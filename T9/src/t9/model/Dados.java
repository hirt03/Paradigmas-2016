/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9.model;

import javax.swing.ImageIcon;

/**
 *
 * @author Hirt
 */
public class Dados {
    
    private int num;
    private String id;
    private String nome;
    private ImageIcon foto;
    
    public Dados(){
    }
    
    public Dados(int num, String id, String nome, ImageIcon foto){
        this.num = num;
        this.id = id;
        this.nome = nome;
        this.foto = foto;
    }
    
    public String getID(){
        return id;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public int getNum(){
        return num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ImageIcon getFoto(){
        return foto;
    }
    
    public void setFoto(ImageIcon foto){
        this.foto = foto;
    }
}
