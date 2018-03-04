
package appproprietario;


public class Animal {
     public String nome;
     public String raca;
     public String cor;
     public int anoDeNacimento;
    
    
    
    public Animal(String raca, String nome, String cor, int anoDeNacimento){
        this.anoDeNacimento = anoDeNacimento;
        this.cor = cor;
        this.raca = raca;
        this.nome = nome;
    }

    

   
    
    

 
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

   
    public String getCor() {
        return cor;
    }

    
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public int getAnoDeNacimento() {
        return anoDeNacimento;
    }

    
    public void setAnoDeNacimento(int anoDeNacimento) {
        this.anoDeNacimento = anoDeNacimento;
    }
    
    
    
    
    
}
