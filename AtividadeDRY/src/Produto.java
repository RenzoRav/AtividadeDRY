public class Produto {
    private String nome;
    private double preco;
    private double percentualDesconto;

    public Produto(String nome, double preco, double percentualDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularPrecoFinal() {
        return preco - (preco * percentualDesconto);
    }

    public void exibirPrecoFinal() {
        System.out.println(nome + " - Preço final: R$ " + calcularPrecoFinal());
    }
}
