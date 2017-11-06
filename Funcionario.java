package com.tvmaster.funcionario;

import com.tvmaster.pessoa.Pessoa;


/**
 *
 * @author joice
 */
public class Funcionario extends Pessoa{ 
   
    protected String funcao;
    
    //construtor
        public Funcionario (){
            this.funcao = funcao;
        
        }
     
        public void setFuncao (String funcao){
                this.funcao = funcao;
            }
            
            public String getFuncao (){
                return funcao;
            }
            
}
    