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
public class PuntoH extends Figuras implements PropiedadesH
{
    public PuntoH() 
    { 
    super();
    }

    public PuntoH(int x, int y, int l1, int l2, int l3)
    { 
    super(x, y, l1, l2, l3);
    }
//métodos

    @Override
    public float getPerimetro() 
    { 
    return 0;
    }

    @Override
    public float getArea()
    { 
    return 0;
    }

    @Override
    public float getVolumen() 
    {
    return 0;
    }

    @Override
    public String toString() 
    {
    return this.getX()+","+this.getY();
    }

    @Override
    public float getAreaLateral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getDiagonal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
