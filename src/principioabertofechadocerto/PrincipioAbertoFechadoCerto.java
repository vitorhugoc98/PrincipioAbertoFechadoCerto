package principioabertofechadocerto;

public class PrincipioAbertoFechadoCerto {

    public static void main(String[] args) {
        
        Taxa taxa00 = new Taxa("INSS", 10); 
        Salario salario00 = new Salario(5000f, taxa00); 
        Cargo cargo00 = new Cargo("Analista de Sistemas", salario00);
        Funcionario funcionario00 = new Funcionario("Joao", cargo00); 
        
        System.out.println("Funcionario: "+funcionario00.getNome());
        System.out.println("Cargo: "+funcionario00.getCargo().getNome());
        System.out.println("Salario: "+funcionario00.getCargo().getSalario().getValor());
        System.out.println("Salario Final: "+funcionario00.getCargo().getSalario().calcularSalarioFinal());
        
    }
    
}
