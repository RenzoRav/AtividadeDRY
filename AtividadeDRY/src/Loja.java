public class Loja {
    public static void main(String[] args) {
        Produto celular = new Produto("Celular", 2000.0, 0.10);
        Produto notebook = new Produto("Notebook", 4500.0, 0.15);
        Produto tablet = new Produto("Tablet", 1500.0, 0.05);

        celular.exibirPrecoFinal();
        notebook.exibirPrecoFinal();
        tablet.exibirPrecoFinal();
    }
}
