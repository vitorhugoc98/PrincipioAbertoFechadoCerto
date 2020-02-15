package principioabertofechadocerto;

public class Salario {
    private float valor; 
    private Taxa taxa; 

    public Salario(float valor, Taxa taxa) {
        this.valor = valor;
        this.taxa = taxa;
    }
    
    public float calcularSalarioFinal (){
        float salarioFinal; 
        salarioFinal = this.valor - (this.valor * this.taxa.getPorcentagem() / 100); 
        
        return salarioFinal;
    }
    
    //public float calcularDecimoTerceiroSalario(){
    //    float salarioComDecimoTerceiro; 
    //    salarioComDecimoTerceiro = calcularSalarioFinal()*2; 
    //    return salarioComDecimoTerceiro; 
    //}
    
    //public float salarioComDecimoTerceiro(){
    //    float salarioComDecimoTerceiro = calcularDecimoTerceiroSalario(); 
    //    return salarioComDecimoTerceiro; 
    //}

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Taxa getTaxa() {
        return taxa;
    }

    public void setTaxa(Taxa taxa) {
        this.taxa = taxa;
    }
    
}
