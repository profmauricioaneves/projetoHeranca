public class Veiculo {
    //atributos
    private String placa;
    private String modelo;
    private Integer ano;

    public Veiculo(String placa, String modelo, Integer ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }


public void mostrarDados(){
    System.out.println("Placa: " + this.placa);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ano: " + this.ano);
}

public void andar() {
    System.out.println("Veiculo andando");

}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
