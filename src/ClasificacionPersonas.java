//Ejercicio con datos random para no tener que introducir 50 datos manualmente.

import java.util.Random;

public class ClasificacionPersonas {
    static class Persona {
        char sexo;
        int edad;
    }

    public static void main(String[] args) {
        Random random = new Random();
        
        Persona[] personas = new Persona[50];
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;
        int contadorMujeres = 0;

        // Generar datos aleatorios para el vector de personas
        for (int i = 0; i < 50; i++) {
            personas[i] = new Persona();
            
            // Generar género aleatorio: 'M' o 'F'
            personas[i].sexo = random.nextBoolean() ? 'M' : 'F';
            
            // Generar edad aleatoria entre 1 y 100
            personas[i].edad = random.nextInt(100) + 1;
        }

        for (int i = 0; i < 50; i++) {
            if (personas[i].edad >= 18) {
                mayoresDeEdad++;
                if (personas[i].sexo == 'M') {
                    hombresMayores++;
                }
            } else {
                menoresDeEdad++;
                if (personas[i].sexo == 'F') {
                    mujeresMenores++;
                }
            }
            
            if (personas[i].sexo == 'F') {
                contadorMujeres++;
            }
        }

        double porcentajeMayores = (mayoresDeEdad * 100.0) / 50;
        double porcentajeMujeres = (contadorMujeres * 100.0) / 50;

        System.out.println("a. Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("b. Cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("c. Cantidad de personas masculinas mayores de edad: " + hombresMayores);
        System.out.println("d. Cantidad de personas femeninas menores de edad: " + mujeresMenores);
        System.out.println("e. Porcentaje de personas mayores de edad respecto al total de personas: " + porcentajeMayores + "%");
        System.out.println("f. Porcentaje de mujeres respecto al total de personas: " + porcentajeMujeres + "%");
    }
}