package questao1;

public class Vendas implements ObservadorEstoque {
    @Override
    public void atualizar(Produto produto, int quantidadeAntiga, int novaQuantidade) {
        if (quantidadeAntiga == 0 && novaQuantidade > 0) {
            System.out.printf("[ALERTA VENDAS] O produto '%s' voltou a ter estoque: %d unidades disponiveis.%n",
                    produto.getNome(), novaQuantidade);
        }
    }
}