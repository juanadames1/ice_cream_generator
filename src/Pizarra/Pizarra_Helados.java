/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizarra;

import NegocioHelados.CirculoH;
import NegocioHelados.ConoH;
import NegocioHelados.PuntoH;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author its_pardo_
 */
public class Pizarra_Helados extends JApplet
{
   private CirculoH circulito; 
    private PuntoH puntico;
    private ConoH conito;
    private int opcion, R, G, B;
    Graphics pintor;
    private String ruta;



    public void init()
    {
    this.setSize(1280, 720); 
    this.puntico=null;
    this.circulito=null;
    this.conito=null;
    this.opcion=0;
    this.pintor=null;
    this.ruta = "./HeladitosText/mishelados.txt";
    }
    
    private void captura()
    {
    String dato; int a,b,rad,h,prof,hancho;

    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada X del cono"));
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada Y del cono"));
    rad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio del cono"));
    
    do
        {
        JOptionPane.showMessageDialog(null, "La altura debe ser el doble del radio");
        h = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el altura del cono"));
        }
        while(h<rad*2);  
    conito = new ConoH(a, b, rad, h, 0);
   
    }
    
    
    public void guardarProducto()
    {
        
        try
        {
            File file = new File(ruta);
            if( !file.exists() )
            {
                file.createNewFile();
            }
            FileWriter fr = new FileWriter(file, false);
            PrintWriter ps = new PrintWriter(fr);
            ps.println(this.conito.txt());
            ps.close();
            JOptionPane.showMessageDialog(null, "¡Guardado!");
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, el producto no fue guardado");
        }
    }
    public void recargArchivo()
    {
        FileReader file; 
        BufferedReader br;
        String registro = "";
        int a,b,rad,h; 
        
        try
        {
            file = new FileReader(ruta);
            br = new BufferedReader(file);
            while((registro = br.readLine())!=null)
            {
                String campos[]=registro.split(",");
                conito = new ConoH(Integer.parseInt(campos[0]), Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), Integer.parseInt(campos[3]),Integer.parseInt(campos[4]));
            }
                  
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(null, "ERROR buscando codigo del producto.");
        }
    }
      
    
    
    private void Dibujador()
    {
    
    
    Color colorcito = new Color(this.R, this.G, this.B);
    Color cereza = new Color (255, 11, 0);
    Color galleta = new Color (158, 84, 0);
    
    
    pintor.setColor(cereza);
    pintor.fillOval(this.conito.getX()-this.conito.getL1(), this.conito.getY()-this.conito.getL1(), this.conito.getL1()/2, this.conito.getL1()/2);
    pintor.setColor(colorcito);
    pintor.fillOval(this.conito.getX()-this.conito.getL1(), this.conito.getY()-this.conito.getL1(), this.conito.getL1()*2,this.conito.getL1()*2);
    pintor.setColor(Color.WHITE);
    pintor.fillRect(this.conito.getX()-this.conito.getL1(),this.conito.getY() ,this.conito.getL1()*2 , this.conito.getL1());
        
    pintor.setColor(galleta);
    int[] intx = {this.conito.getX()-this.conito.getL1(), this.conito.getX(), this.conito.getX()+this.conito.getL1()};    
    int[] inty = {this.conito.getY(), this.conito.getY()+this.conito.getL2(), this.conito.getY()};    
    pintor.fillPolygon(intx, inty, 3);
    }
    
    

    public void paint(Graphics mancito)
    {
        this.pintor=mancito;
        int respuesta;
        do
        {
            this.opcion=Integer.parseInt(JOptionPane.showInputDialog("=========Opciones=========\n"+
                                                                        "1. Crear helado \n"+
                                                                        "2. Guardar helado \n"+
                                                                        "3. Limpiar \n"+
                                                                        "4. Recuperar \n"+
                                                                        "0. Salir "
                                                                    ));
            switch (this.opcion)
            {
                case 1:
                    
                    this.captura();
                    this.menuHelado();
                    this.Dibujador();
                   
                break;
                
                case 2:
                    this.guardarProducto();
                 
                    break;
                                       
                case 3:
                    this.limpiador(pintor);
                    break;
                
                case 4:
                    this.recargArchivo();
                    this.Dibujador();
                                                        
                break;
                     
                case 0:
                    JOptionPane.showMessageDialog(null, "Vemos my lof");
                    System.exit(1);
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Elección inválida");
                break; 
            }
        }
        while(this.opcion!=0);
    }
    
    public void menuHelado()
    {
        int respuesta = 0;
        do
        {
            this.opcion=Integer.parseInt(JOptionPane.showInputDialog("=========Opciones=========\n"+
                                                                        "1. Chocolate \n"+
                                                                        "2. Vainilla \n"+
                                                                        "3. Fresa \n"+
                                                                        "4. Limón \n"+
                                                                        "5. Mandarina \n"+
                                                                        "6. Mora en leche \n"+
                                                                        "0. Salir"
                                                                    ) );
                    
            switch (this.opcion)
            {
                case 1:
                    this.R=117;
                    this.G=81;
                    this.B=27;
                    
                   
                break;
                
                case 2:
                    this.R=255;
                    this.G=228;
                    this.B=150;
                 
                    break;
                                       
                case 3:
                    this.R=240;
                    this.G=7;
                    this.B=78;
                   
                    break;
                
                case 4:
                 
                    this.R=114;
                    this.G=207;
                    this.B=42;
                   
                                                        
                break;
                
                case 5:
                    this.R=255;
                    this.G=42;
                    this.B=2;
                break;
                    
                case 6:
                    this.R=164;
                    this.G=110;
                    this.B=232;
                break;
                    
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Vemos my lof");
                    
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Elección inválida");
                break; 
            }

        }
        while(respuesta!=0);
    }
    
    public void limpiador(Graphics pintor)
    {
        Dimension d = getSize();
        pintor.setColor(Color.WHITE);
        pintor.fillRect(0, 0, d.width, d.height);
    }
}
