public class Livro {
    private String titulo;
    private String autor;
    private String anoPubli;

    public Livro (){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
    }
    @Override
    public String toString() {
        return this.titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getAnoPubli(){
        return anoPubli;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAnoPubli(String anoPubli){
        this.anoPubli = anoPubli;
    }
}