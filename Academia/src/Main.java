public class Main{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ellen");
        Aluno aluno2 = new Aluno("Cátia");

        Plano plano1 = new Plano("Trimestral - ", "350,00");
        Plano plano2 = new Plano("Mensal - ", "120,00");

        Treino treino1 = new Treino("Pernas");
        treino1.setRepeticoes("3x 20");
        Treino treino2 = new Treino("Ombros");
        treino2.setRepeticoes("4x de 30");

        aluno1.adicionarTreino(treino1);
        aluno1.adicionarTreino(treino2);
        aluno2.adicionarTreino(treino1);
        aluno2.adicionarTreino(treino2);

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Plano: " + plano1.getTipoPlano() + plano1.getValor());
        System.out.println("Treinos: " + aluno1.getTreinos());

        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Plano: " + plano2.getTipoPlano() + plano2.getValor());
        System.out.println("Treinos" + aluno2.getTreinos());
    }
}