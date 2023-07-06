/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorfinanças.MODEL;




/**
 *
 * @author bruno.costa2
 */
public class Investimentos {
    private String nomeinv;
    private double valorinv;
    String datainv;
    
   public Investimentos( String nomeinv, double valorinv, String datainv){
      
        this.nomeinv = nomeinv;
        this.valorinv = valorinv; 
        this.datainv = datainv;
   }
   
   public Investimentos(){
       
   }
  

 

    public String getNomeinv() {
        return nomeinv;
    }

    public void setNomeinv(String nomeinv) {
        this.nomeinv = nomeinv;
    }

    public double getValorinv() {
        return valorinv;
    }

    public void setValorinv(double valorinv) {
        this.valorinv = valorinv;
    }

    public String getDatainv() {
        return datainv;
    }

    public void setDatainv(String datainv) {
        this.datainv = datainv;
    }
    
    
   
    
}
