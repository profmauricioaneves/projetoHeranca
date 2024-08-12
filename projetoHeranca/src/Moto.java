public class Moto extends Veiculo {

    private Boolean partidaEletrica;

    public Moto(String placa, String modelo, Integer ano, Boolean partida) {
        super(placa, modelo, ano);
        this.partidaEletrica = partida;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();

        if (this.partidaEletrica) {
            System.out.println("Moto tem Partida Elétrica ");
        } else {
            System.out.println("Moto NÃO tem Partida Elétrica ");
        }


    }
}
