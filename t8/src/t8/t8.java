/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8;
import java.util.ArrayList;
/**
 *
 * @author Hirt
 */
public class t8 {
        
    public static void main(String[] args) {
        float maior = 0;
        
        ArrayList<bolacha> b = new ArrayList<>();
        for(int i=0;i<5;i++){
            for (int j=0; j<10; j++){
               ponto p = new ponto(i*10, j*10);
               b.add(new bolacha(p));
            }
        }
        
        for(int i=0;i<50;i++){
            if(b.get(i).getarea() > maior){
                maior = b.get(i).getarea();
            }
        }
        
       System.out.println("\nA maior area e: = " + maior);     
        
    }
}
