/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorfinanças.MODEL;

/**
 *
 * @author bruno.costa2
 */
public class OutrosGastosFixos {
    String nomeogf;
    double valorogf;
    

    public OutrosGastosFixos() {
    }

    public OutrosGastosFixos(String nomeogf, double valorogf) {
        this.nomeogf = nomeogf;
        this.valorogf = valorogf;
        
    }

    public String getNomeogf() {
        return nomeogf;
    }

    public void setNomeogf(String nomeogf) {
        this.nomeogf = nomeogf;
    }

    public double getValorogf() {
        return valorogf;
    }

    public void setValorogf(double valorogf) {
        this.valorogf = valorogf;
    }


    
    
    
   
}
