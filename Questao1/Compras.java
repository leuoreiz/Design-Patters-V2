package questao1;

public class Compras implements ObservadorEstoque {
    private static final int LIMITE_MINIMO = 5;

    @Override
    public void atualizar(Produto produto, int quantidadeAntiga, int novaQuantidade) {
        if (novaQuantidade < LIMITE_MINIMO) {
            System.out.printf("[ALERTA COMPRAS] O produto '%s' está com estoque baixo: %d unidades.%n",
                    produto.getNome(), novaQuantidade);
        }
    }
}