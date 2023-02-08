
package ejercicio;

import java.util.Scanner;

public class consola {
    public static void main(String[] args){
        calculadora objeto = new calculadora();
        Scanner objetoingreso = new Scanner(System.in);
        String opcion;
        int cantMax = 50;
        
        
        System.out.println("Bienvenido, que opcion desea usar: \n 1. Funciones matematicas basicas \n 2. Funciones trigonometricas \n 3. IVA");
        int x=objetoingreso.nextInt();
        
        switch(x){
            case 1:
            System.out.print("Bienvenido, porfavo ingrese el valor a:");
        objeto.a=objetoingreso.nextInt();
        System.out.print("Porfavo ingrese el valor b:");
        objeto.b=objetoingreso.nextInt();
        
        
        System.out.println("Que opcion desea utilizar: \n 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division");
        int n=objetoingreso.nextInt();
        switch(n){
            case 1:
            objeto.suma();
                System.out.println("La suma es de:" + objeto.c);
                break;
            case 2:
            objeto.resta();
                System.out.println("La resta es de:" + objeto.c);
                break;
            case 3:
            objeto.multiplicacion();
                System.out.println("La multiplicacion es" + objeto.c);
                break;
            case 4:
            objeto.division();
                System.out.println("La division es" + objeto.c);
                break;
            }
                break;
            
            case 2:
                System.out.print("Bienvenido, por favor ingrese el valor del numero: ");
                objeto.a=objetoingreso.nextInt();
                    
                System.out.println("Que opcion desea utilizar: \n 1. Seno \n 2. Coseno \n 3. Tangente \n 4. Raiz \n 5. Exponente");
                int y=objetoingreso.nextInt();
                
                switch(y){
                    case 1:
                    objeto.seno();
                        System.out.println("El seno es de: " + objeto.c);
                    break;
                    case 2:
                    objeto.coseno();
                        System.out.println("El coseno es de: " + objeto.c);
                    break;
                    case 3:
                    objeto.tangente();
                        System.out.println("La tangente es de: " + objeto.c);
                    break;
                    case 4:
                    objeto.raiz();
                        System.out.println("La raiz es de: " + objeto.c);
                    break;
                    case 5:
                    objeto.exponente();
                        System.out.println("El resultado es de:  " + objeto.c);
                    break;
            }
            break;
            case 3:
                System.out.println("Ingrese el valor al que desea sacar el IVA");
                objeto.a=objetoingreso.nextInt();
                objeto.IVA();
                System.out.println("El iva de " + objeto.a + " es de " + objeto.c);
            break; 
            case 4:
                System.out.println("Repetir consola? \n 1.si \n 2.no");
                objeto.a=objetoingreso.nextInt();
                break;

    }
        
    }
}
