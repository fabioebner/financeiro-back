package br.com.lumera.financeiroback.config;

import br.com.lumera.financeiroback.entity.Usuario;
import br.com.lumera.financeiroback.repository.UsuarioRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Date;

public class TokenAuthenticationService {
    // EXPIRATION_TIME = 10 dias
    public static final long EXPIRATION_TIME = 860_000_000;
    public static final String SECRET = "MySecret";
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";


    static void addAuthentication(HttpServletResponse response, String username, HttpServletRequest request) {
        Usuario usuario =BeanLocator.find(UsuarioRepository.class).findByEmail(username);
        String JWT = Jwts.builder().claim("schema",usuario.getInstituicao().getNomeSchema())
                .claim("usuarioId",usuario.getId())
                .claim("instituicaoId",usuario.getInstituicao().getId())
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();

        response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
    }

    static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(HEADER_STRING);

        if (token != null) {
            // faz parse do token
            //TODO http://andreybleme.com/2017-04-01/autenticacao-com-jwt-no-spring-boot/
            String schema = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody().get("schema").toString();

            String user = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody()
                    .getSubject();


            if (user != null) {
                return new UsernamePasswordAuthenticationToken(user, schema, Collections.emptyList());
            }
        }
        return null;
    }
}
