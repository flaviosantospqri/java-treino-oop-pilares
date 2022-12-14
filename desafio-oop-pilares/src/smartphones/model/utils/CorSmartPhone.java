package smartphones.model.utils;

public enum CorSmartPhone{
    PRETO_COR ("PRETO", "black"),
    BRANCO_COR ("BRACO", "white"),
    CINZA_COR ("CINZA", "Grey");

    private String nome;
    private String nome_en;

    private CorSmartPhone(String nome, String nome_en){
        this.nome = nome;
        this.nome_en = nome_en;
    }
}
