package questao1;

public interface ObservadorEstoque {
    void atualizar(Produto produto, int quantidadeAntiga, int novaQuantidade);
}