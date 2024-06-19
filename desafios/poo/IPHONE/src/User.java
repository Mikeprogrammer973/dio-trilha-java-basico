import iphone.Iphone;

public class User {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.selecionarMusica("Fix You");
        iphone.pausar();

        iphone.ligar("514 857-9685");
        iphone.iniciarCorreioVoz();
    }
}
