/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8;
import java.util.Random;
/**
 *
 * @author Hirt
 */
public class bolacha{    
    array b;

    public bolacha(ponto p){
        Random aux = new Random();
        int type = aux.nextInt(3) + 1;
        switch(type){
            case 1:
               //circulo
               circulo c = new circulo(p, (aux.nextFloat()%10)*10);
               b = (array) c;
               break;
            case 2:
               //triangulo
               triangulo tr = new triangulo(p, (aux.nextFloat()%10)*10, (aux.nextFloat()%10)*10);
               b = (array) tr;
               break;
        
            case 3:
               //retangulo
               retangulo re = new retangulo(p, (aux.nextFloat()%10)*10, (aux.nextFloat()%10)*10);
               b = (array) re;
               break;
        }
    }
    
    public float getarea(){
        return b.getArea();
    }
    
}
