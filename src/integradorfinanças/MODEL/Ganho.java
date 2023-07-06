/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorfinanças.MODEL;



/**
 *
 * @author bruno.costa2
 */
public class Ganho {
    private String nomeganhos;
    private double valorganhos;
    private String dataganhos;
    
    
    
    public Ganho(String nomeganhos, double valorganhos, String dataganhos){
        this.nomeganhos = nomeganhos;
        this.valorganhos = valorganhos;
        this.dataganhos = dataganhos;
        
    }
       public Ganho(){
        
    }

    public String getNomeganho() {
        return nomeganhos;
    }

    public void setNomeganho(String nomeganhos) {
        this.nomeganhos = nomeganhos;
    }

    public double getValorganho() {
        return valorganhos;
    }

    public void setValorganho(double valorganhos) {
        this.valorganhos = valorganhos;
    }

    public String getDataganhos() {
        return dataganhos;
    }

    public void setDataganhos(String dataganhos) {
        this.dataganhos = dataganhos;
    }


    }
    
            
    

