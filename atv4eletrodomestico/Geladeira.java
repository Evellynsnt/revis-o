package atv4eletredomestico;

class Geladeira extends Eletrodomestico {
    private double capacidade;

    public Geladeira(String marca, double potencial, double capacidade){
        super(marca, potencial);
        this.capacidade = capacidade;
    }

    public double getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }

    public void ligar(){
        System.out.println("Geladeira:"+getMarca()+"| Capacidade:"
        +getCapacidade()+"| Potência:"+getPotencia());;
    }
}
