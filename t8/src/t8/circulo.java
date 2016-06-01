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
public class circulo extends array{
    float raio;
    
    public circulo(ponto p, float raio){
        this.raio = raio;
    }
    
    
    @Override
    public float getArea() {
        float area;
        area = 3.14f * raio * raio;
        return area;
    }
}
