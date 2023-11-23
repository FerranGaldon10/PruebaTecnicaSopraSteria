import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("HORAS TRABAJADAS: ");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.print("TARIFA: ");
        double tarifa = scanner.nextDouble();
        
        double sueldo = 0;

        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * tarifa;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;
            
            double sueldoHorasNormales = horasNormales * tarifa;
            double sueldoHorasExtras = horasExtras * (tarifa * 1.5);
            
            sueldo = sueldoHorasNormales + sueldoHorasExtras;
        }

        System.out.println("El sueldo recibido por el trabajador es: " + sueldo);

        scanner.close();
    }
}