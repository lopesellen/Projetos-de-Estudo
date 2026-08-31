import java.time.LocalDate;

public class ItemEmprestimo {
    private Livro livro;
    private LocalDate dataDevolucaoEfetiva;
    private boolean devolvido;

    public ItemEmprestimo(Livro livro){
        this.livro = livro;
        this.devolvido = false;
        this.dataDevolucaoEfetiva = null;
    }

    public void registrarDevolucao(){
        this.devolvido = true;
        this.dataDevolucaoEfetiva = LocalDate.now();
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataDevolucaoEfetiva() {
        return dataDevolucaoEfetiva;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setDataDevolucaoEfetiva(LocalDate dataDevolucaoEfetiva) {
        this.dataDevolucaoEfetiva = dataDevolucaoEfetiva;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}


