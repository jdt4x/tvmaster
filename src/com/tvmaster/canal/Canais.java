package com.tvmaster.canal;

import com.tvmaster.planoo.Plano;

/**
 *
 * @author joice
 */
public class Canais extends Plano{
    private String Nome;
    private int NumeroDoCanal;
    private String Classificacao;
    private String Categoria;
    
        public Canais (double preco, String Nome, int NumeroDoCanal, String Classificacao, String Categoria){
        super();
        
        this.Categoria = Categoria;
        this.Classificacao = Classificacao;
        this.NumeroDoCanal = NumeroDoCanal;
        this.Nome = Nome;
        }
        
        public void setCategoria (String Categoria){
                this.Categoria = Categoria;
            }
            
            public String getCategoria (){
                return Categoria;
            }
            
            public void setNome (String Nome){
                this.Nome = Nome;
            }
            
            public String getNome (){
                return Nome;
            }
            
            public void setNumeroDoCanal (int NumeroDoCanal){
                this.NumeroDoCanal = NumeroDoCanal;
            }
            
            public int getNumeroDoCanal (){
                return NumeroDoCanal;
            }
            public void setClassificacao (String Classificacao){
                this.Classificacao = Classificacao;
            }
            
            public String getClassificacao (){
                return Classificacao;
            }
    
}
