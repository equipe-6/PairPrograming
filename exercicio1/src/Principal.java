
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[]args){
        
        Aluno aluno = new Aluno();
    
 
        aluno.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        if(aluno.getIdade() <= 16 ){
            int idade = 16;
            
            aluno.setIdade(idade);
                                
                    }
        
       
        
        
        aluno.setSemestre(Integer.parseInt(JOptionPane.showInputDialog("Semestre: ")));
        aluno.setEstagio(Double.parseDouble(JOptionPane.showInputDialog("Salário: ")));
        if(aluno.getEstagio() <= 600){
            double salario = 600;
            
            aluno.setEstagio(salario);
            
            
        }
        
        
        

      
        
          JOptionPane.showMessageDialog(null,"Nome: "+ aluno.getNome() + "\n" 
                                            +"Idade: "+ aluno.getIdade() +"\n" 
                                            +"Semestre: "+ aluno.getSemestre() + "\n" 
                                            +"Salário Estágio: "+"R$"+aluno.getEstagio());
                                                aluno.salarioAnual();
                                                aluno.salarioSemestral();
                                            
       
        
        
        
    
    
    
    
}
}