/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NegocioHelados;

/**
 *
 * @author its_pardo_
 */
public class Figuras 
{
     private int x; 
     private int y; 
     private int l1; 
     private int l2;
     private int l3;


    public Figuras()
    {
    this.x = 0;
    this.y = 0;
    this.l1 = 0;
    this.l2 = 0;
    this.l3 = 0;
    }
    
    public Figuras(int x, int y, int l1, int l2, int l3) 
    { 
    this.x = x;
    this.y = y;
    this.l1 = l1;
    this.l2 = l2;
    this.l3 = l3;
    }

    public int getX()
    {
    return x;
    }

    public void setX(int x) 
    { 
    this.x = x;
    }

    public int getY() 
    { 
    return y;
    }

    public void setY(int y) 
    { 
     this.y = y;
    }

    public int getL1() 
    { 
    return l1;
    }

    public void setL1(int l1) 
    { 
    this.l1 = l1;
    }

    public int getL2() 
    { 
    return l2;
    }

    public void setL2(int l2) 
    { 
    this.l2 = l2;
    }
 

    public int getL3() 
    { 
    return l3;
    }
    public void setL3(int l3)
    { 
    this.l3 = l3;
    }

}
