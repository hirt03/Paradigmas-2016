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
public class triangulo extends array{
    float b, h;
    
    public triangulo(ponto p, float b, float h){
        this.b = b;
        this.h = h;
    }
    
    @Override
    public float getArea() {
        float area = (float)(b*h)/2;
        return area;
    }
    
}
