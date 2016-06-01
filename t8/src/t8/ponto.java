/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8;

/**
 *
 * @author Hirt
 */
public class ponto {
    private double x;
    private double y;
    
    public ponto(){
       x = 0.0;
       y = 0.0;
       
}
    public ponto(double _x, double _y){
        x = _x;
        y = _y;
    }
    
    void move (double dx, double dy){
        x += dx;
        y += dy;
    }
    
    double distancia(ponto p2){
        double dx = p2.x - x;
        double dy = p2.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public void exibe(){
        System.out.println("x = " + x + ", y = " + y);
    }
    
    double getx(){
        return x;
    }
    
    double gety(){
        return y;
    }

}
