public class caminhao extends veiculo {
    private double capacidadeDeCarga;

    public caminhao(String modelo, int ano, double capacidadeDeCarga) {
        super(modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeDeCarga + " toneladas");
    }
}
