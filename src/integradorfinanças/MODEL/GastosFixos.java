/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorfinanças.MODEL;

/**
 *
 * @author bruno.costa2
 */
public class GastosFixos {
    float aguagf;
    float luzgf;
    float internetgf;
    float telefonegf;
    float aluguelgf;
    
    
    public GastosFixos(){
        
    }
    
    public GastosFixos(float aguagf, float luzgf, float internetgf, float telefonegf, float aluguelgf){
        this.aguagf = aguagf;
        this.luzgf = luzgf;
        this.internetgf = internetgf;
        this.telefonegf = telefonegf;
        this.aluguelgf = aluguelgf;
        
    }

    public double getAguagf() {
        return aguagf;
    }

    public void setAguagf(float aguagf) {
        this.aguagf = aguagf;
    }

    public double getLuzgf() {
        return luzgf;
    }

    public void setLuzgf(float luzgf) {
        this.luzgf = luzgf;
    }

    public double getInternetgf() {
        return internetgf;
    }

    public void setInternetgf(float internetgf) {
        this.internetgf = internetgf;
    }

    public double getTelefonegf() {
        return telefonegf;
    }

    public void setTelefonegf(float telefonegf) {
        this.telefonegf = telefonegf;
    }

    public double getAluguelgf() {
        return aluguelgf;
    }

    public void setAluguelgf(float aluguelgf) {
        this.aluguelgf = aluguelgf;
    }
    
    
    
    
}
