public class FolhaPGTO {

    public static void main(String[] args) throws Exception {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // TENHO QUE VER //
        //Os news da folha de pagamento todos estao dando erros
        // Atualizar calculo IRPF
        // Atualizar calculo INSS
        // Identificar falha calculo salario mensalista (era a falta de um else com 0 como msg de erro???)
        // Criar metodo void imprimir

        
        // Empregados mensalistas
        men1 = new Mensalista ("Rodrigo", "Rua da felicidade", double.class, "Junior");
        men1.calcularSalario ();
        men1.calcINSS ();
        System.out.println ("Nome: " + men1.getNome ());
        System.out.println ("Endereco: " + men1.getEndereco());
        System.out.println ("Salario: " + men1.getSalario());
        System.out.println ("Cargo: " + men1.getCargo());


        men2 = new Mensalista ("Juliana", "Rua das Rosas", double.class, "Senior");
        men2.calcularSalario();
        men2.calcINSS();
        System.out.println ("Nome: " + men2.getNome ());
        System.out.println ("Endereco: " + men2.getEndereco());
        System.out.println ("Slario: " + men2.getSalario());
        System.out.println ("Cargo: " + men2.getCargo());


        //Empregados horistas EUUUUUU
        hora1 = new Horista ("Priscila", "Rua do Amor", "Pleno", 160);
        hora1.calcularSalarioHoras();
        System.out.println ("Nome: " + hora1.getNome());
        System.out.println ("Endereco: " + hora1.getEndereco());
        System.out.println ("Salario: " + hora1.getSalario());
        System.out.println ("Horas trabalhadas: " + hora1.getHoras());

        }
    }
