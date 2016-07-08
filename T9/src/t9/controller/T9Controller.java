/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9.controller;

import t9.model.TableModel;
import t9.model.Dados;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.json.JsonObject;
import com.restfb.types.User;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import t9.view.tabelaFB;

/**
 *
 * @author Hirt
 */
public class T9Controller {
    private tabelaFB tabela;
    private TableModel model;
    
    public T9Controller(tabelaFB tabela, TableModel model){
        this.tabela = tabela;
        this.model = model;
    }

    public void Search() throws MalformedURLException
    {
        String token;
        String nameUser;
        
        token = tabela.getToken().getText();
        nameUser = tabela.getNome().getText();
        
        int x = 0;
        String id;
        
        FacebookClient client = new DefaultFacebookClient(token, Version.LATEST);
        
        Connection<User> usuarios = client.fetchConnection("search", User.class, Parameter.with("q", nameUser), Parameter.with("type", "user"), Parameter.with("limit", 200));
        
        for(User usu : usuarios.getData())
        {
            x++;
            
                id = usu.getId();
                
                System.out.println("Id: "+ id);
                try
                {
                    JsonObject picture = client.fetchObject(id+"/picture", JsonObject.class, Parameter.with("redirect", "false"));
                    URL url = new URL(picture.getJsonObject("data").getString("url"));
                    
                    ImageIcon foto = new ImageIcon(url);
                    System.out.println("Foto: "+ foto);
                    Dados data = new Dados(x, id, usu.getName().toString(), foto);
                    model.add(data);
                    
                }
                catch(Exception e)
                {
                    System.out.println("Erro!");
                }
                
        } 
    }
}
