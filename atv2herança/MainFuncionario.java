package atv2heranca;

public class MainFuncionario{
    public static void main(String[] args) {
        Assistente a = new Assistente("Lucas", 2000.00, "Assistente Administrativo");
        System.out.println("Nome: "+a.getNome());
        System.out.println("Salário: R$"+a.getSalario());
        System.out.println("Cargo: "+a.getCargo());
        System.out.println("Bônus: R$"+a.calcularBonus());
        System.out.println("Valor total com bônus acrescentados: R$"+a.getSalario() + a.calcularBonus());

        System.out.println("-------------------------------------------------------");
        
        Gerente g = new Gerente("Carla", 6000.00, "Gerente de Banco");
        System.out.println("Nome: "+g.getNome());
        System.out.println("Salário: R$"+g.getSalario());
        System.out.println("Cargo: "+g.getCargo());
        System.out.println("Bônus: R$"+g.calcularBonus());
        System.out.println("Valor total do bônus acrescentados: R$"+g.getSalario()+g.calcularBonus());

    }
}

