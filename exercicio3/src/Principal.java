
import javax.swing.JOptionPane;


public class Principal {
    
    public static void main(String args[]){
        
        exercicio3 ex3 = new exercicio3();
        
        ex3.setR(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: ")));
        ex3.setL(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cilindro: ")));
        
        JOptionPane.showMessageDialog(null, "O raio digitado foi: "+ex3.getR()+"²" + "\n" + 
                                            "A altura digitada foi: " +ex3.getL());
        
        
        ex3.calculaVolume();
       
        
        
        
        
        
    }
    
}
