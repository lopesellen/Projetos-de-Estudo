import java.util.ArrayList;
import java.util.List;

public class Leitor {
    private String nome;
    private String id;
    private List<Livro> livrosEmprestados;

    public Leitor(){
        this.livrosEmprestados = new ArrayList<Livro>();
    }
    public void retirarLivro(Livro livro){
        this.livrosEmprestados.add(livro);
    }


    public String getNome(){
        return nome;
    }

    public String getId(){
        return id;
    }
    public List<Livro> getLivrosEmprestados(){
        return livrosEmprestados;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setLivrosEmprestados(List<Livro> livrosEmprestados){
        this.livrosEmprestados = livrosEmprestados;
    }
}
