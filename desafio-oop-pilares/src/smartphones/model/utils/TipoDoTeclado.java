package smartphones.model.utils;

public enum TipoDoTeclado {
    QWERTY_TECLADO ("Qwerty", "qw"),
    TOUCH_TECLADO ("Touch", "tc");

    private String nome;
    private String sigla;

    private TipoDoTeclado(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }
}
