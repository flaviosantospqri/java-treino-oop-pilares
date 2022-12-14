package smartphones.services;

public class ServiceMusica {

    public void tocar(){
        verificarExistenciaAudio();
        verificarEstadoMudo();
    }

    public void pausar(){
        System.out.println("Pausando Musica");

    }

    public void selecionarMusica(){
        System.out.println("Selecionando Musica");
    
    }

    private void verificarEstadoMudo(){
        System.out.println("Verificando audio");
    }

    private void verificarExistenciaAudio(){
        System.out.println("Arquivo encontrado");
    }


}
