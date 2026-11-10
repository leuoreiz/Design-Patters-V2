package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int novaQuantidade) {
        // RQ1.4: Comunicação só ocorre se a quantidade realmente mudar
        if (this.quantidade != novaQuantidade) {
            int antiga = this.quantidade;
            this.quantidade = novaQuantidade;
            notificarObservadores(antiga, novaQuantidade);
        }
    }

    private void notificarObservadores(int antiga, int nova) {
        for (ObservadorEstoque obs : observadores) {
            obs.atualizar(this, antiga, nova);
        }
    }
}