/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NegocioHelados;

import Inerfaces.PropiedadesH;

/**
 *
 * @author its_pardo_
 */
public class CirculoH extends Figuras implements PropiedadesH
{
     public CirculoH()
    {
        super();
    }

    public CirculoH(int x, int y, int l1, int l2)
    { 
    super(x, y, l1, l2,0);
    }
    
    @Override
    public float getPerimetro() 
    {
        float perimetro=(float)(2*Math.PI*this.getL1()); 
        return perimetro;
    }

    @Override
    public float getArea() 
    {
        float area=(float)(2*Math.PI*Math.pow(this.getL1(),2)); 
        return area;
    }

    @Override
    public float getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() 
    {
    return this.getX()+","+this.getY()+","+this.getL1();
    }

    @Override
    public float getAreaLateral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getDiagonal()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
