import java.util.Scanner;

public class ParImparDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Leer numero: ");
        int numero = scanner.nextInt();
        
        System.out.println("Número ingresado: " + numero);
        
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
            System.out.println("Números pares descendientes desde " + numero + " hasta 0:");
            for (int i = numero; i >= 0; i -= 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("El número es impar.");
            System.out.println("Números impares descendientes desde " + numero + " hasta 1:");
            for (int i = numero; i >= 1; i -= 2) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
