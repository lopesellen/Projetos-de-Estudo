import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Emprestimo {
    private Leitor leitor;
    private LocalDate dataEmprestimo;
    private LocalDate dataEntrega;
    private List<ItemEmprestimo> itens;

    public Emprestimo(Leitor leitor){
        this.leitor = leitor;
        this.dataEmprestimo = LocalDate.now();
        this.dataEntrega = LocalDate.now().plusDays(7);
        this.itens = new ArrayList<>();
    }

    public void pegarEmprestado(ItemEmprestimo item){
        this.itens.add(item);
    }

    public void mostrarLivros(){
        for (ItemEmprestimo item : itens){
            System.out.println("Livro: " + item.getLivro().getTitulo());
        }
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public List<ItemEmprestimo> getItens() {
        return itens;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void setItens(List<ItemEmprestimo> itens) {
        this.itens = itens;
    }
}
