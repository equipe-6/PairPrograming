
import javax.swing.JOptionPane;


public class exercicio3 {
 
   
        
        double R;
        double L;
        double V = 3.1416;

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }
        
        
      
        
   public void calculaVolume(){
        double resultado;
        
        resultado = (V * Math.pow(getR(), 2)) * getL();
        
        
        JOptionPane.showMessageDialog(null,"Volume do cilindro: "+ resultado);
        
    }
        
    
    
 
   
   
       

    
}
