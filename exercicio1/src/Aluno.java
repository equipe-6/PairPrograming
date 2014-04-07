
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrias
 */
public class Aluno {
    String nome;
    int idade;
    int semestre;
    double valorEstagio;
    
    
    	public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
    
    
    
    	public int getIdade() {
			return idade;
		}
	
		public void setIdade(int idade) {
			this.idade = idade;
		}
                
                	public int getSemestre() {
			return semestre;
		}
	
		public void setSemestre(int semestre) {
			this.semestre = semestre;
		}
                
                	public double getEstagio() {
			return valorEstagio;
		}
	
		public void setEstagio(double valorEstagio) {
			this.valorEstagio = valorEstagio;
		}
                
                
         public void salarioAnual(){
             double salario;
             salario = getEstagio() * 12;
             
             JOptionPane.showMessageDialog(null, "Seu salário anual é: "+ salario);
               
                   
            
             
             
         }
         
         
         public void salarioSemestral(){
             double aumento = 0.234;
             double salarioSemestre;
             
             salarioSemestre = (getEstagio() * aumento + getEstagio()) * 6;
             JOptionPane.showMessageDialog(null, "Seu salário semestral é: "+ salarioSemestre);
             
         }
         
         
                    
                    
                }
                
    

