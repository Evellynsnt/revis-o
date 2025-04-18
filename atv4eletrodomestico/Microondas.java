package atv4eletredomestico;

class Microondas extends Eletrodomestico {
    private int tempoMaximo;

    public Microondas(String marca, double potencia, int tempoMaximo){
        super(marca, potencia);
        this.tempoMaximo = tempoMaximo;
    }

    public int getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(int tempoMaximo){
        this.tempoMaximo = tempoMaximo;
    }

    public void ligar(){
        System.out.println("Microondras:"+getMarca()+"| Potência:"
        +getPotencia()+"| Tempo Máximo:"+getTempoMaximo());
    }

}
