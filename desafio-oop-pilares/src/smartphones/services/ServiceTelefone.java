package smartphones.services;

public class ServiceTelefone {

    public void ligar(){
        verificarValidadeDoChip();
    }

    public void atender(){
        
    }

    public void iniciarCorrerioVoz(){
        verificarValidadeDoChip();
    }

    private void verificarValidadeDoChip(){
        System.out.println("Verificando Chip");
    }
   
}
