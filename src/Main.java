public class Main {
    public static void main(String[] args) {
        Leitor leitor1 = new Leitor();
        Leitor leitor2 = new Leitor();

        leitor1.setNome("Maria");
        leitor2.setNome("Eduardo");

        Livro livro1 = new Livro();
        livro1.setTitulo("Harry Potter");

        Livro livro2 = new Livro();
        livro2.setTitulo("Lusíadas");

        Livro livro3 = new Livro();
        livro3.setTitulo("A arte de viver");


        Emprestimo emprestimo = new Emprestimo(leitor1);
        ItemEmprestimo item1 = new ItemEmprestimo(livro1);
        ItemEmprestimo item2 = new ItemEmprestimo(livro2);
        emprestimo.pegarEmprestado(item1);
        emprestimo.pegarEmprestado(item2);

        Emprestimo emprestimo1 = new Emprestimo(leitor2);
        ItemEmprestimo item3 = new ItemEmprestimo(livro3);
        emprestimo1.pegarEmprestado(item3);

        System.out.println("Cliente: " + leitor1.getNome());
        System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo());
        emprestimo.mostrarLivros();
        System.out.println("-------------------------------");
        System.out.println("Cliente: " + leitor2.getNome());
        System.out.println("Data do empréstimo: " + emprestimo1.getDataEmprestimo());
        emprestimo1.mostrarLivros();
    }
}

// Associação: Leitor e Livro / 1..*
// Composição: ItemEmprestimo /  1
//             Emprestimo / 1..*
