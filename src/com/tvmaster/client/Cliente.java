/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tvmaster.client;

import com.tvmaster.pessoa.Pessoa;

/**
 *
 * @author joice
 */
public class Cliente extends Pessoa{
    private String cpf;
    
    public Cliente (String nome, String email, String cpf, String telefone){
    super(nome, email, cpf,telefone);
    }
    
}
