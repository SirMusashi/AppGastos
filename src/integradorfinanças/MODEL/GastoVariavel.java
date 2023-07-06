/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorfinanças.MODEL;

/**
 *
 * @author bruno.costa2
 */
public class GastoVariavel {
    private String nomeGV;
    private double valorGV;
    private String dataGV;
    
    
 
    
    public GastoVariavel(String nomeGV, double valorGV, String dataGV){
        this.nomeGV = nomeGV;
        this.valorGV = valorGV;
        this.dataGV = dataGV;
        
    }
       public GastoVariavel(){
        
    }

    public String getNomeGV() {
        return nomeGV;
    }

    public void setNomeGV(String nomeGV) {
        this.nomeGV = nomeGV;
    }

    public double getValorGV() {
        return valorGV;
    }

    public void setValorGV(double valorGV) {
        this.valorGV = valorGV;
    }

    public String getDataGV() {
        return dataGV;
    }

    public void setDataGV(String dataGV) {
        this.dataGV = dataGV;
    }

}



