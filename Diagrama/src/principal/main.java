package principal;

import iPhone.IPhone;

public class main {
    public static void main(String[] args) {
        // Criando instância do iPhone
        IPhone iphone = new IPhone();

        // Testando ReprodutorMusical
        iphone.play("Proteção - Banda Plebe Rude");
        iphone.pause();
        iphone.stop();

        // Testando AparelhoTelefonico
        iphone.ligar("(91)98236-4562");
        iphone.desligar();
        iphone.atender();

        // Testando NavegadorInternet
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
