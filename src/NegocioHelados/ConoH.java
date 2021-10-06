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
public class ConoH extends Figuras implements PropiedadesH
{
     public ConoH()
    {
        super();
    }
    
    public ConoH(int x, int y, int l1, int l2, int l3)
    { 
    super(x, y, l1, l2, l3);
    }
    
    @Override
    public float getDiagonal() 
    {
        float generatriz=(float)(2*super.getL1()+2*super.getL3()); 
        return generatriz;
    }

    @Override
    public float getPerimetro()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getArea()
    {
        float areaTotalCono=(float)(Math.PI*this.getL1()*this.getDiagonal()+Math.PI*Math.pow(super.getL1(),2));
        return areaTotalCono;    
    }

    @Override
    public float getVolumen()
    {
        float volumCono=(float)((Math.PI*Math.pow(super.getL1(),2)*this.getL3())/3);
        return volumCono;
    }

    @Override
    public float getAreaLateral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String txt()
    {
        return super.getX()+","+super.getY()+","+super.getL1()+","+super.getL2();
    }
    
    @Override
    public String toString()
    {
        return super.getX()+","+super.getY()+","+super.getL1()+","+super.getL2();
    }   

    
}
