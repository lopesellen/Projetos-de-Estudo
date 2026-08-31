public class Treino {
    private String nomeTreino;
    private String repeticoes;

    public Treino(String nomeTreino){
        this.nomeTreino = nomeTreino;
        this.repeticoes = repeticoes;
    }

    @Override
    public String toString() {
        return "Treino: " + nomeTreino + " || Repetições: " + repeticoes  + " || ";
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public String getRepeticoes() {
        return repeticoes;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public void setRepeticoes(String repeticoes) {
        this.repeticoes = repeticoes;
    }
}
