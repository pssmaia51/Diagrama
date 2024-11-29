package iPhone;

import java.util.ArrayList;
import java.util.List;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Atributos
    private String musicaAtual;
    private boolean musicaTocando;
    private boolean emChamada;
    private List<String> abasAbertas;

    // Construtor
    public IPhone() {
        this.musicaAtual = null;
        this.musicaTocando = false;
        this.emChamada = false;
        this.abasAbertas = new ArrayList<>();
    }

    // Implementação de ReprodutorMusical
    @Override
    public void play(String musica) {
        if (musicaTocando) {
            System.out.println("Já está tocando uma música. Pare antes de iniciar outra.");
        } else {
            this.musicaAtual = musica;
            this.musicaTocando = true;
            System.out.println("Reproduzindo música: " + musica);
        }
    }

    @Override
    public void pause() {
        if (musicaTocando) {
            this.musicaTocando = false;
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando para pausar.");
        }
    }

    @Override
    public void stop() {
        if (musicaTocando || musicaAtual != null) {
            this.musicaTocando = false;
            this.musicaAtual = null;
            System.out.println("Reprodução de música parada.");
        } else {
            System.out.println("Nenhuma música para parar.");
        }
    }

    // Implementação de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        if (emChamada) {
            System.out.println("Já está em uma chamada. Finalize antes de ligar para outro número.");
        } else {
            this.emChamada = true;
            System.out.println("Ligando para o número: " + numero);
        }
    }

    @Override
    public void atender() {
        if (!emChamada) {
            this.emChamada = true;
            System.out.println("Atendendo a chamada.");
        } else {
            System.out.println("Já está em uma chamada.");
        }
    }

    @Override
    public void desligar() {
        if (emChamada) {
            this.emChamada = false;
            System.out.println("Chamada encerrada.");
        } else {
            System.out.println("Nenhuma chamada para encerrar.");
        }
    }

    // Implementação de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        abasAbertas.add(url);
    }

    @Override
    public void adicionarNovaAba() {
        abasAbertas.add("Nova aba");
        System.out.println("Nova aba adicionada. Total de abas abertas: " + abasAbertas.size());
    }

    @Override
    public void atualizarPagina() {
        if (!abasAbertas.isEmpty()) {
            System.out.println("Atualizando página: " + abasAbertas.get(abasAbertas.size() - 1));
        } else {
            System.out.println("Nenhuma aba aberta para atualizar.");
        }
    }
}
