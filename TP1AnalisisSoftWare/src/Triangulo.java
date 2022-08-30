import java.util.ArrayList;
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

    private ArrayList<Integer> lados;

    public Triangulo() {
        lados = new ArrayList<Integer>();
    }

    public String queTrianguloSoy() {
        if (esValido()) {
            if (lados.get(0).equals(lados.get(1)) && lados.get(0).equals(lados.get(2))) {
                return "Equilátero";
            } else if (!lados.get(0).equals(lados.get(1)) && !lados.get(0).equals(lados.get(2)) && !lados.get(1).equals(lados.get(2))) {
                return "Escaleno";
            } else
                return "Isósceles";
        }
        return "No forma Triangulo";
    }

    public void ingresarLado(int lado) {
        lados.add(lado);
    }

    public boolean esValido() {
        return (lados.get(0) + lados.get(1) > lados.get(2)) &&
                (lados.get(1) + lados.get(2) > lados.get(1)) &&
                (lados.get(0) + lados.get(2) > lados.get(1));
    }

    public static void main(String[] args) {
        System.out.println("Ingrese los valores de un triángulo de uno a la vez.");
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        int medidaDelTriangulo;
        for (int i = 1; i < 4; i++){
            System.out.println("Ingrese la medida del lado numero: " + i + " del triangulo");
            medidaDelTriangulo = sc.nextInt();
            triangulo.ingresarLado(medidaDelTriangulo);
        }

        System.out.println("El triangulo es de tipo: " + triangulo.queTrianguloSoy());
        sc.close();
    }
}
