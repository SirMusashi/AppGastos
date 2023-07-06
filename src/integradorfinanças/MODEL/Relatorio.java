/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorfinanças.MODEL;

/**
 *
 * @author wagner.takahashi
 */
public class Relatorio {
    
    private String ganhos;
    private String gastosfixos;
    private String gastosvariaveis;
    private String investimentos; 
    
     public Relatorio() {
    }

    public Relatorio(String ganhos, String gastosfixos, String gastosvariaveis, String investimentos) {
        this.ganhos = ganhos;
        this.gastosfixos = gastosfixos;
        this.gastosvariaveis = gastosvariaveis;
        this.investimentos = investimentos;
    }

    public String getGanhos() {
        return ganhos;
    }

    public void setGanhos(String ganhos) {
        this.ganhos = ganhos;
    }

    public String getGastosfixos() {
        return gastosfixos;
    }

    public void setGastosfixos(String gastosfixos) {
        this.gastosfixos = gastosfixos;
    }

    public String getGastosvariaveis() {
        return gastosvariaveis;
    }

    public void setGastosvariaveis(String gastosvariaveis) {
        this.gastosvariaveis = gastosvariaveis;
    }

    public String getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(String investimentos) {
        this.investimentos = investimentos;
    }
    
      

    
}
