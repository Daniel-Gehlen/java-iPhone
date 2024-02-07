package iPhone;

import browser.Browser;
import player.Player;
import telephone.Telephone;

//Classe iPhone
public class iPhone implements Player, Telephone, Browser {
    private boolean musicPlaying;
    private boolean callInProgress;
    private boolean internetConnected;

    @Override
    public void play() {
        // Implementação para tocar música
        if (!musicPlaying) {
            System.out.println("Música tocando.");
            musicPlaying = true;
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    @Override
    public void stop() {
        // Implementação para pausar música
        if (musicPlaying) {
            System.out.println("Música pausada.");
            musicPlaying = false;
        } else {
            System.out.println("Nenhuma música está tocando para pausar.");
        }
    }

    @Override
    public void selectMusic() {
        // Implementação para selecionar música
        System.out.println("Selecionando música.");
    }

    @Override
    public void toConnect() {
        // Implementação para ligar o telefone
        if (!callInProgress) {
            System.out.println("Ligando...");
            callInProgress = true;
        } else {
            System.out.println("Já há uma chamada em andamento.");
        }
    }

    @Override
    public void toMeet() {
        // Implementação para atender chamadas
        if (callInProgress) {
            System.out.println("Chamada atendida.");
            callInProgress = false;
        } else {
            System.out.println("Não há chamada para atender.");
        }
    }

    @Override
    public void startVoicemail() {
        // Implementação para iniciar correio de voz
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void displayPage() {
        // Implementação para exibir página da internet
        if (internetConnected) {
            System.out.println("Exibindo página da internet.");
        } else {
            System.out.println("Sem conexão com a internet.");
        }
    }

    @Override
    public void addNewTab() {
        // Implementação para adicionar nova aba
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void updatePage() {
        // Implementação para atualizar página
        System.out.println("Atualizando página.");
    }
}

