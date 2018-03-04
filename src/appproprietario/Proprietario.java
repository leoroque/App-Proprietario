
package appproprietario;


public class Proprietario {
    
    String nomeProprietario;
    int telefone;
    Animal animal;

    
    
    Proprietario(){
        
    }
    
    public Proprietario (String nomeProprietario, String nome, int telefone, String raca, int anoDeNacimento, String cor){
        this.nomeProprietario = nomeProprietario;
        this.telefone = telefone;  
        animal.setAnoDeNacimento(anoDeNacimento);
        animal.setCor(cor);
        animal.setNome(nome);
        animal.setRaca(raca);
    }

    
    
  

    /**
     * @return the nomeProprietario
     */
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    /**
     * @param nomeProprietario the nomeProprietario to set
     */
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the animal
     */
    public Animal getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

   
    

   
   
    
    
    
    
    
    
}
