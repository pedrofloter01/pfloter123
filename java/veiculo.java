public class veiculo {
    protected String modelo;
    protected int ano;

    public veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
