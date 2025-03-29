package atv2heranca;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, String cargo){
        super(nome,salario,cargo);
        this.bonus = calcularBonus();
 }

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }


    public double calcularBonus(){
        return getSalario() * 0.10;
    }
}
