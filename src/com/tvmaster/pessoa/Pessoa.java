package com.tvmaster.pessoa;

/**
 *
 * @author joice
 */
 public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String email;
    
        public Pessoa (String nome, String cpf, String telefone, String email){
            this.cpf = cpf;
            this.email = email;
            this.nome = nome;
            this.telefone = telefone;
        }
        
            public void setNome (String nome){
                this.nome = nome;
            }
            
            public String getNome (){
                return nome;
            }
            
            public void setCpf (String cpf){
                this.cpf = cpf;
            }
            
            public String getCpf(){
                return cpf;
            }
            
            public void setTelefone (String telefone){
                this.telefone = telefone;
            }
            
            public String getTelefone(){
                return telefone;
            }
            
            public void setEmail (String email){
                this.email = email;
            }
            
            public String getEmail(){
                return email;
            }
        
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    @Override
	public String toString() {
		return  this.nome + "" + this.cpf; 
				
	}
}