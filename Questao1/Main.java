package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook Dell", 10);

        ObservadorEstoque compras = new Compras();
        ObservadorEstoque vendas = new Vendas();
        ObservadorEstoque auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("--- Reduzindo estoque para 4 (Dispara Compras e Auditoria) ---");
        notebook.setQuantidade(4);

        System.out.println("\n--- Tentando alterar para o mesmo valor (Sem alteracao/notificacao) ---");
        notebook.setQuantidade(4);

        System.out.println("\n--- Zerando estoque (Dispara Auditoria) ---");
        notebook.setQuantidade(0);

        System.out.println("\n--- Repondo estoque para 8 (Dispara Vendas e Auditoria) ---");
        notebook.setQuantidade(8);

        System.out.println("\n--- Removendo setor de Auditoria e reduzindo estoque para 2 ---");
        notebook.removerObservador(auditoria);
        notebook.setQuantidade(2);
    }
}