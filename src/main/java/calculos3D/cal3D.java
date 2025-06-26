/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos3D;

import calculos2D.cal2D;
import java.util.Scanner;

/**
 *
 * @author sebai
 */
public class cal3D {
    Scanner es = new Scanner(System.in);
    cal2D c2 = new cal2D();
    public void cubo(){
    System.out.print("para calcular volumen del cubo ingresa la altura : ");
        double altura = es.nextDouble();
        double Acuadrado = c2.cuadrado();
        double Vcubo = Acuadrado * altura;
        System.out.println("El volumen cubo = " + Vcubo);
    }
    
    public void esfera(){
    double ra = c2.circulo();
    double Vesfera = (3/4)*Math.PI*Math.pow(ra,3);
        System.out.println("El volumen de la esfera = "+Vesfera);
    }
    
    public void cilindro(){
    double ra = c2.circulo();
    System.out.print("para calcular volumen del cilindro ingresa la altura : ");
    double altura = es.nextDouble();
    double Vcilindro = Math.PI*Math.pow(ra,2)*altura;
        System.out.println("El volumen cilindro = "+Vcilindro);
    }
    public void paralelepipedo(){
    System.out.print("para calcular volumen del Paralelepipedo ingresa la altura : ");
        double altura = es.nextDouble();
        double area = c2.rectangulo();
        double Vparalelepipedo = altura * area;
        System.out.println("El area paralelepipedo = "+Vparalelepipedo);
    }
}
