package atv4eletredomestico;

public class MainEletrodomestico {
    public static void main(String[] args) {
        Geladeira g = new Geladeira("Eletrolux", 200, 100);
        g.ligar();

        Microondas m = new Microondas("Brastemp", 500, 30);
        m.ligar();
        
    }
}
