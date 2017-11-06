/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tvmaster.funcionario.model;


/**
 *
 * @author joice
 */

import com.tvmaster.funcionario.Funcionario;
import com.tvmaster.tvmaster.DataAccessObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FuncionarioDAO extends DataAccessObject {
    private String table = "Funcionario";
   
    
    private ArrayList<Funcionario> toList(ResultSet resultset) throws SQLException
    {
        ArrayList<Funcionario> list = new ArrayList<>();
        
        while(resultset.next()) 
        {
            Funcionario item = new Funcionario();
            
            item.setId(resultset.getInt("id"));
            item.setEmail(resultset.getString("email"));
            item.setSenha(resultset.getInt("senha"));
            item.setCpf(resultset.getString("cpf"));
            item.setTelefone(resultset.getString("telefone"));
            item.setFuncao(resultset.getString("funcao"));
            item.setNome(resultset.getString("nome"));
           
            list.add(item);
        }
        
        resultset.close();
        
        return list;
    }

    public void create(Funcionario item)  throws SQLException
    {
        try (PreparedStatement stmt = this.query("INSERT INTO " + this.table + " (id, senha, email, funcao, nome, telefone, cpf) VALUES (?,?,?,?,?,?,?)")) 
        {
            stmt.setInt(1, item.getId());
            stmt.setInt(2, item.getSenha());
            stmt.setString(3,item.getEmail());
            stmt.setString(4, item.getFuncao());
            stmt.setString(5, item.getNome());
            stmt.setString(6, item.getTelefone());
            stmt.setString(7, item.getCpf());
            stmt.executeUpdate();
            stmt.close();
        } 
    }

    public ArrayList<Funcionario> read() throws SQLException 
    {
        ArrayList<Funcionario> list;
        
        try (PreparedStatement stmt = this.query("SELECT * FROM " + this.table)) 
        {
            ResultSet rs = stmt.executeQuery();
            list = this.toList(rs);
        }
        
        return list;
    }

    public void update(Funcionario item) throws SQLException 
    {       
        try(PreparedStatement stmt = this.query("UPDATE " + this.table + " SET senha=?, email=?, funcao=?, nome=?, telefone=?, cpf=? WHERE id=?")) 
        {
            stmt.setInt(1, item.getId());
             stmt.setInt(2, item.getSenha());
            stmt.setString(3, item.getEmail());
            stmt.setString(4, item.getFuncao());
            stmt.setString(5, item.getNome());
            stmt.setString(6, item.getTelefone());
            stmt.setString(7, item.getCpf());
            stmt.executeUpdate();
            stmt.close();
            
            
            
        }
    }

    public void delete(Funcionario item) throws SQLException 
    {
        try(PreparedStatement stmt = this.query("DELETE FROM " + this.table + " WHERE id=?")) 
        {
            stmt.setInt(1, item.getId());
            stmt.executeUpdate();
            stmt.close();
        }
    }
    
    private ArrayList<Funcionario> find(String query) throws SQLException 
    {
        ArrayList<Funcionario> list;
        
        try(PreparedStatement stmt = this.query(query))
        {
            ResultSet rs = stmt.executeQuery();
            list = this.toList(rs);
            stmt.close();
        }
        
        return list;
    }
    
    public Funcionario findById(Integer id) throws SQLException 
    {
        ArrayList<Funcionario> result = this.find("SELECT * FROM " + this.table + " WHERE id = " + id + " LIMIT 1");
        
        return (result.size() > 0) ? result.get(0) : null;
    }
    
    public Funcionario findByCPF(String cpf) throws SQLException 
    {
        ArrayList<Funcionario> result = this.find("SELECT * FROM " + this.table + " WHERE cpf = '" + cpf + "' LIMIT 1");
        
        return (result.size() > 0) ? result.get(0) : null;
    }
    
    
    
    
}
