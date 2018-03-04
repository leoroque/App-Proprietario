
package appproprietario;

import javax.swing.JOptionPane;


public class AppProprietario {

   
    public static void main(String[] args) {
      
        GerenciarProprietario ge = new GerenciarProprietario();
         
        int opcao;
        
        do
        { opcao = Integer.parseInt(JOptionPane.showInputDialog("1- "+
                "Cadastrar Priprietario e animal" +
                "\n2 - "+ "Listar todos os proprietarios" +
                "\n3 - " + "Lista de raças " +
                "\n4 - "+ "Sair"));
            
        
            
            switch(opcao) 
                 {

            case 1:
                Proprietario p = new Proprietario();
                p.setNomeProprietario(JOptionPane.showInputDialog("digite o nome do proprietario"));
                
            break;
            
            case 2 :
            break;
                
            case 3:
            break;
            
            case 4:
            System.exit(0);
            break;
        }
            
        }
        while(opcao >= 1 && 4 <= opcao);
    }
    
}
