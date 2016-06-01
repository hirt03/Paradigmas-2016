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
public class retangulo extends array{
    float c, h;
    
    public retangulo(ponto p, float c, float h){
        this.c = c;
        this.h = h;
    }
    
    @Override
    public float getArea() {
        float area = c*h; 
        return area;
    }
}
