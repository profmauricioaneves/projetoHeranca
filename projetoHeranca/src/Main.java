public class Main {
    public static void main(String[] args){

        Veiculo veiculo = new Veiculo("FKF-1025","Ranger",2015);
        veiculo.mostrarDados();
        veiculo.andar();

        Carro carro = new Carro("fdf9df89","HB20", 2020, 4);
        carro.mostrarDados();
        carro.andar();
        carro.andar(80);
        System.out.println("------------------------------------------------------");

        Moto minhaMoto = new Moto("kjk-5656","Falcom",2020, false);
        minhaMoto.andar();
        minhaMoto.mostrarDados();

        Veiculo carro2 = new Carro("FKF-1025", "Ranger", 2015, 4);
        System.out.println("");
        System.out.println("Mostrando dados do noso polimorfismo");
        carro2.mostrarDados();

    }
}