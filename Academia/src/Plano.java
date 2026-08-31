public class Plano {
    private String tipoPlano;
    private String valor;

    public Plano(String tipoPlano, String valor){
        this.tipoPlano = tipoPlano;
        this.valor = valor;
    }
    public void exibirPlano(){
        System.out.println("Plano: " + tipoPlano);
        System.out.println("Preço: " + valor);
    }
    public String getTipoPlano() {
        return tipoPlano;
    }

    public String getValor() {
        return valor;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
