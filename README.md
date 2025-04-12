# javaEjercicios

ejercicio 1

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       double numero1;
       double numero2;
       Scanner sc = new Scanner(System.in);
       
       System.out.print("ingrese un primer numero: ");
       numero1 = sc.nextDouble();
       
        System.out.print("ingrese un segundo numero: ");
       numero2 = sc.nextDouble();
       
       System.out.println("la suma es: " + (numero1 + numero2));
       System.out.println("la resta es: " + (numero1 - numero2));
       System.out.println("la multiplicacion es: " + (numero1 * numero2));
       System.out.println("la division es: " + (numero1 / numero2));
        System.out.println("el modulo es: " + (numero1 % numero2));
          
    }
}



ejercicio 2


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       String nombre;
       String correo;
       int edad;
       Scanner sc = new Scanner(System.in);
       
       System.out.print("ingrese su nombre: ");
       nombre = sc.nextLine();
       
        System.out.print("ingrese su correo: ");
       correo = sc.nextLine();
       
       System.out.print("ingrese su edad: ");
       edad =sc.nextInt();
       
       System.out.println("El nombre es: " +nombre);
        System.out.println("El correo es: " +correo);
         System.out.println("La edad es: " +edad);
        
       
        
    }
}
