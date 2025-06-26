/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos2D;

import java.util.Scanner;

/**
 *
 * @author sebai
 */
public class cal2D {
    Scanner es = new Scanner(System.in);
    public double  circulo(){
        System.out.print("para calcular el area del circulo ingresa el radio: ");
        double radio = es.nextDouble();
        double Acirculo = Math.PI*(Math.pow(radio, 2));
        double Pcirculo = Math.PI*(2*radio);
        System.out.println("El area del circulo = " + Acirculo);
        System.out.println("El perimetro = " + Pcirculo);
        return radio;
        
    }
    
    public void triangulo (){
    System.out.print("para calcular el area del triangulo ingresa la base: ");
        double base = es.nextDouble();
    System.out.print("para calcular el area del triangulo ingresa la altura: ");
        double altura = es.nextDouble();
    double Atriangulo = (base*altura)/2;
    double Pcirculo = base *3;
        System.out.println("la base del triangulo = "+Atriangulo);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("EL perimetro del triangulo ="+Pcirculo);
    }
    
    public double cuadrado(){
        System.out.print("para calcular area del cuadrado ingresa el lado: ");
        double lado = es.nextDouble();
        double Acuadrado = Math.pow(lado, 2);
        double Pcuadrado = lado*4;
        System.out.println("El area cuadrado = "+Acuadrado);
        System.out.println("El perimetro cuadrado = "+Pcuadrado);
        return Acuadrado;
    }
    
    public double rectangulo(){
        System.out.print("para calcular el area del ectangulo ingrese la altura: ");
        double altura = es.nextDouble();
        System.out.print("para calcular el area del rectangulo ingrese la base : ");
        double base = es.nextDouble();
        double Arectangulo = altura *base;
        double Prectangulo = (altura*2)+(base*2);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("El area rectangulo = "+Arectangulo);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("El perimetro = "+Prectangulo);
        return Arectangulo;
    }
    public void pentagono(){
    System.out.print("para calcular area del pentagono ingrese un lado: ");
        double lado = es.nextDouble();
        System.out.print("para calcular area del pentagono ingrese la optema: ");
        double optema = es.nextDouble();
        
        double Ppentagono = lado * 5;
        double Apentagono = (Ppentagono * optema)/2;
        
        System.out.println("el area pentagono = "+Apentagono);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("el perimetro pentagono = "+Ppentagono);
    }
    public void hexagono(){
    System.out.print("para calcular area del pentagono ingrese un lado: ");
        double lado = es.nextDouble();
        System.out.print("para calcular area del pentagono ingrese la optema: ");
        double apotema = es.nextDouble();
        
        double Pexagono = lado * 5;
        double Aexagono = (Pexagono * apotema)/2;
        
        System.out.println("el area exagono = "+Aexagono);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("el perimetro exagono = "+Pexagono);
    }
    //3D
    

}

