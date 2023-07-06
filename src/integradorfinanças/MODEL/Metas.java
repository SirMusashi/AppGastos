/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorfinanças.MODEL;

/**
 *
 * @author wagner.takahashi
 */
public class Metas {    
   
private String nomemeta;
private double valormeta;
    
   public Metas ( String nomemeta, double valormeta){
      
        this.nomemeta = nomemeta;
        this.valormeta = valormeta;
   }
   
   public Metas(){
       
   }
  

    public String getNomemeta() {
        return nomemeta;
    }

    public void setNomemeta(String nomemeta) {
        this.nomemeta = nomemeta;
    }

    public double getValormeta() {
        return valormeta;
    }

    public void setValormeta(double valormeta) {
        this.valormeta = valormeta;
    }

    
   
    
}
    
    
  
