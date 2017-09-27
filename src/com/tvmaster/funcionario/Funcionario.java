package com.tvmaster.funcionario;

import com.tvmaster.pessoa.Pessoa;


/**
 *
 * @author joice
 */
public abstract class Funcionario extends Pessoa{
    
    public static final int ADMIN = 1;
    public static final int ATENDENTE = 2;
    public static final int TECNICO = 3;
    
    protected String funcao;
    
        public Funcionario (String funcao, String nome, String email, String cpf, String telefone){
            super(nome, email, cpf, telefone);
            this.funcao = funcao;
        
        }
        
        public void setFuncao (String funcao){
                this.funcao = funcao;
            }
            
            public String getFuncao (){
                return funcao;
            }
}
    