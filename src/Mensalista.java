public class Mensalista  extends Empregado {
   
    private String cargo;
 
    public String getCargo () {
        return cargo;
    }
 
    public void setCargo (String cargo) {
        this.cargo = cargo;
    }
 
    //Construtor
    public Mensalista (String nome, String endereco, double salario, String cargo) {
        super (nome, endereco, salario);
        this.cargo = cargo;
    }
 
    public void calcularSalario () {
        if (cargo.equals ("Junior")) {
            salario = 2500;
        } else if (cargo.equals ("Pleno")) {
            salario = 3500;
            // Coloquei o cargo Senior, q nao tinha, e um else final com salario de 0, caso o cargo nao seja nenhum desses 3
        } else if (cargo.equals ("Senior")) {
            salario = 5500;
        } else {
            salario = 0;
        }
 
    }

}


