public class onibus extends veiculo {
    private int numeroDeAssentos;

    public onibus(String modelo, int ano, int numeroDeAssentos) {
        super(modelo, ano);
        this.numeroDeAssentos = numeroDeAssentos;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Assentos: " + numeroDeAssentos);
    }
}
