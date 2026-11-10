package questao1;

public class Auditoria implements ObservadorEstoque {
    @Override
    public void atualizar(Produto produto, int quantidadeAntiga, int novaQuantidade) {
        System.out.printf("[AUDITORIA] Produto '%s': alterado de %d para %d unidades.%n",
                produto.getNome(), quantidadeAntiga, novaQuantidade);
    }
}