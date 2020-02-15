package principioabertofechadocerto;

public class Taxa {
    
    private String nome; 
    private int porcentagem; 

    public Taxa(String nome, int porcentagem) {
        this.nome = nome;
        this.porcentagem = porcentagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }
    
}
