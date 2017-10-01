/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tvmaster.contrato;


/**
 *
 * @author Bianca
 */
public class Contrato {
    private String numeroDeContrato;
    private int quantReceptor;
    private String endereço;
    private int tipoDePlano;

    public Contrato(String numeroDeContrato, int quantReceptor, String endereço, int tipoDePlano) {
        this.numeroDeContrato = numeroDeContrato;
        this.quantReceptor = quantReceptor;
        this.endereço = endereço;
        this.tipoDePlano = tipoDePlano;
    }
    
    
    public void alteraContrato(int x){
        
        
        
    }

    public String getNumeroDeContrato() {
        return numeroDeContrato;
    }

    public void setNumeroDeContrato(String numeroDeContrato) {
        this.numeroDeContrato = numeroDeContrato;
    }

    public int getQuantReceptor() {
        return quantReceptor;
    }

    public void setQuantReceptor(int quantReceptor) {
        this.quantReceptor = quantReceptor;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getTipoDePlano() {
        return tipoDePlano;
    }

    public void setTipoDePlano(int tipoDePlano) {
        this.tipoDePlano = tipoDePlano;
    }
    
     
}