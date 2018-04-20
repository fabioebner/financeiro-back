package br.com.lumera.financeiroback.util;

import br.com.lumera.financeiroback.config.TokenAuthenticationService;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;

@Service
public class TokenUtil {

    @Autowired
    HttpServletRequest request;

    public Object recuperarVariavelToken(String nomeVariavel){
        String token = request.getHeader("Authorization");
        return  Jwts.parser()
                .setSigningKey(TokenAuthenticationService.SECRET)
                .parseClaimsJws(token.replace(TokenAuthenticationService.TOKEN_PREFIX, ""))
                .getBody().get(nomeVariavel);
    }
}
