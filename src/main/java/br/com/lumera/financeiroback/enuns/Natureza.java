package br.com.lumera.financeiroback.enuns;

public enum Natureza {
    REGISTRO_IMOVEIS("Registro de Imóveis",1L),
    PROTESTO("Protesto",2L),
    NOTAS("Notas",3L),
    FIRMAS("Firmas",4L),
    TITULOS_DOCUMENTO_PJ("Títulos e Documentos e Pessoa Jurídica",5L),
    REGISTRO_CIVIL("Registro Civil",6L),
    REGISTRO_CIVIL_PJ("Registro Civil PJ",7L);

    private String nome;
    private Long id;

    Natureza(String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public static Natureza recuperaNome(int cartorioNatureza) {
        switch (cartorioNatureza){
            case 1:
                return REGISTRO_IMOVEIS;
            case 2:
                return PROTESTO;
            case 3:
                return NOTAS;
            case 4:
                return FIRMAS;
            case 5:
                return TITULOS_DOCUMENTO_PJ;
            case 6:
                return REGISTRO_CIVIL;
            case 7:
                return REGISTRO_CIVIL_PJ;
        }
        return null;
    }
}
