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

    public static Natureza findByCodigo(int cartorioNatureza) {
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

    public static Natureza findByNome(String natureza) {
        if(natureza.equalsIgnoreCase("Registro de Imóveis")){
            return REGISTRO_IMOVEIS;
        }else if(natureza.equalsIgnoreCase("Protesto")){
            return PROTESTO;
        }else if(natureza.equalsIgnoreCase("Notas")){
            return NOTAS;
        }else if(natureza.equalsIgnoreCase("Firmas")){
            return FIRMAS;
        }else if(natureza.equalsIgnoreCase("Títulos e Documentos e Pessoa Jurídica")){
            return TITULOS_DOCUMENTO_PJ;
        }else if(natureza.equalsIgnoreCase("Registro Civil")){
            return REGISTRO_CIVIL;
        }else if(natureza.equalsIgnoreCase("Registro Civil PJ")){
            return REGISTRO_CIVIL_PJ;
        }
        return null;
    }
}
