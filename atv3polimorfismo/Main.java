package atv3polimorfismo;

abstract class Animal {
    public abstract void fazerSom();
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("AU AU");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("MIAU MIAU");
    }
}

class Vaca extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("MUUUU");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();

    
        for (Animal a : animais) {
            a.fazerSom();
        }
    }
}
