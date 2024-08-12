public class Carro extends Veiculo {

    private Integer nrPortas;

    public Carro(String placa, String modelo, Integer ano, Integer nrPortas) {
        super(placa, modelo, ano);
        this.nrPortas = nrPortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Nr Portas: " + this.nrPortas);
    }

    @Override
    public void andar() {
        System.out.println("Carro andando");
    }

    public void andar(Integer kms) {
        System.out.println("Carro andando a " + kms + "/hora");
    }
}
