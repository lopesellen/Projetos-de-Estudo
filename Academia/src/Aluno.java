import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private List<Treino> treinos;

    public Aluno(String nome) {
        this.nome = nome;
        this.treinos = new ArrayList<>();;
    }

    public void adicionarTreino(Treino treinos){
        this.treinos.add(treinos);
    }
    public void todosTreinos(){
        for (Treino treino : treinos){
            System.out.println(treino);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }
}

