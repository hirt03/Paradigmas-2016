package t9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.restfb.*;
import com.restfb.json.JsonObject;
import com.restfb.types.User;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Hirt
 */
public class restfbb {
    
    public restfbb() throws MalformedURLException{
       int i, limit = 50;
       JsonObject picture = null;
       String token = "EAACFBIar8QIBAMidTQuuT7r08ZAIaQ9w7pfjDEmcynDSOzZClj6wZCGh3pkKaoGwQ1SDGsU0iRCpMDY0MiegyZBDrCfAzUIUIhtOd4bEPn8sWl1FNcbXMyZBXN0DUSNFqUCFXBU6PmKYmykIrG91OzEABsduuadFEJ2S3A1f1cwZDZD", nameUser = "Caroline Chagas";
    
       FacebookClient client = new DefaultFacebookClient(token, Version.LATEST);
       Connection<User> usuarios = client.fetchConnection("search", User.class, Parameter.with("q", nameUser), Parameter.with("type", "user"), Parameter.with("limit", 500));
       //String id = "caroline.chagas.942";
       
       JFrame frame = new JFrame();
       
       for(i = 0; i < limit; i++){
           String id = usuarios.getData().get(i).getId();
           ImageIcon foto = new ImageIcon(new URL("http://graph.facebook.com/" + id + "/picture?type=large"));
           System.out.println(foto);
           JLabel label = new JLabel(foto);
           frame.add(label);
           frame.setDefaultCloseOperation
              (JFrame.EXIT_ON_CLOSE);
           frame.pack();
           frame.setVisible(true);
       }
       
       //ImageIcon foto = new ImageIcon(new URL("http://graph.facebook.com/" + id + "/picture?type=large"));
    
      // System.out.println(foto);
  
}
}
