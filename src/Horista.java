public class Horista extends Empregado {
    
    private double horas;
    private double vlHoras;

    public double getHoras () {
        return horas;
    }

    public void setHoras (double horas) {
        this.horas = horas;
    }

    //Construtor
    public Horista (String nome, String endereco, double salario, double horas, double vlHoras) {
        super (nome, endereco, salario);
        this.horas = horas;
        this.vlHoras = vlHoras;
    }

    public void calcularSalarioHoras () {
        salario = horas * vlHoras;

    }
}
