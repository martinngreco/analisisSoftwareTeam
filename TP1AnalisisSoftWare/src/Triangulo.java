import java.util.Scanner;

//    Tp analisis de soft
//    Realizar un programa que lea tres valores enteros desde la pantallaƒ
//    Los tres valores son interpretados de forma que representan las longitudes de los tres lados de un triángulo.
//    El programa debe mostrar un mensaje que indique si el triángulo es “escaleno “,”isósceles “ o “equilátero”
//    ingreso x teclado
//    De los 3 valores ( no los valido para que sean enteros)
//    Tengo que analizar los valores de los 3 lados
//    Para esto necesito a,b ; b,c ; a,c como peor caso
public class Triangulo {

    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int i, int j, int k) {
        lado1 = i;
        lado2 = j;
        lado3 = k;
    }

    private void decirTipo() {

        if( lado1 == lado2){
            //Iso o equi
            if( lado1 == lado3)
                System.out.println("El triángulo es Equilátero");
            else
                System.out.println("El triángulo es Isóceles");
        }
        else{
            //Iso o escaleno
            if( lado1 == lado3)
                System.out.println("El triángulo es Isóceles");
            else
                if( lado2 == lado3)
                    System.out.println("El triángulo es Isóceles");
                else
                    System.out.println("El triángulo es Escaleno");
        }

    }

    public static void main(String[] args) {
        System.out.println("Ingrese los valores de un triángulo de uno a la vez.");
        System.out.println("Ingrese el primer valor");
        Scanner sc1 = new Scanner(System.in);
        int lado1 = sc1.nextInt();
        System.out.println("Ingrese el segundo valor");
        Scanner sc2 = new Scanner(System.in);
        int lado2 = sc2.nextInt();
        System.out.println("Ingrese el tercer valor");
        Scanner sc3 = new Scanner(System.in);
        int lado3 = sc3.nextInt();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);

        triangulo.decirTipo();
    }
}
