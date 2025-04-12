import java.util.Scanner;

class EjercicioDos {
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
