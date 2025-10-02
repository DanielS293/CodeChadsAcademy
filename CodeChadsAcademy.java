import java.util.Scanner;

public class CodeChadsAcademy {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        double[] notasDeExamenes = new double[5];

        System.out.println("Ingrese la nota del primer examen: ");
        notasDeExamenes[0] = sc.nextDouble();
        System.out.println("Ingrese la nota del segundo examen: ");
        notasDeExamenes[1] = sc.nextDouble();
        System.out.println("Ingrese la nota del tercer examen: ");
        notasDeExamenes[2] = sc.nextDouble();
        sc.close();
     

        if (notasDeExamenes[1] < 60){
            notasDeExamenes[3] = 100;
        } else {
            notasDeExamenes[3] = notasDeExamenes[1];
        }

        if (notasDeExamenes[0] + notasDeExamenes[1] > 150){
            notasDeExamenes[4] = 95;
        } else {
            notasDeExamenes[4] = 70;
        }

        // Resumen de calificaciones: 

        System.out.println("\n-- RESUMEN DE CALIFICACIONES --");
        System.out.println("Examen 1: " + notasDeExamenes[0] + 
        "\nExamen 2: " + notasDeExamenes[1] + 
        "\nExamen 3: " + notasDeExamenes[2] + 
        "\nExamen 4: " + notasDeExamenes[3] + 
        "\nExamen 5: " + notasDeExamenes[4]);    

        // 1. Verificar si aprobó todos los exámenes.

        if (notasDeExamenes[0] >= 60 && notasDeExamenes[1] >= 60 && notasDeExamenes[2] >= 60 && notasDeExamenes[3] >= 60 && notasDeExamenes[4] >= 60){
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (notasDeExamenes[0] >= 60 || notasDeExamenes[1] >= 60 || notasDeExamenes[2] >= 60 || notasDeExamenes[3] >= 60 || notasDeExamenes[4] >= 60){
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
        } else {
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        }

        // 2. Prueba mas inconsistente:

        double mayorDiferencia = 0;
        int numeroExamen1 = 0;
        int numeroExamen2 = 0;

        for (int i = 0; i < 4; i++) {
            if (notasDeExamenes[i+1] - notasDeExamenes[i] > mayorDiferencia){
                mayorDiferencia = notasDeExamenes[i+1] - notasDeExamenes[i];
                numeroExamen1 = i+1;
                numeroExamen2 = i+2;
            }
        }

        System.out.println("Mayor salto fue de "+mayorDiferencia+" puntos entre la prueba "+numeroExamen1+" y la prueba "+numeroExamen2);

        // 3. Bonus por progreso:

        if (notasDeExamenes[1] > notasDeExamenes[0] && notasDeExamenes[2] > notasDeExamenes[1] && notasDeExamenes[3] > notasDeExamenes[2] && notasDeExamenes[4] > notasDeExamenes[3]){
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento.");;
        }
        

        // 4. Mostrar notas ordenadas (sin usar sort):

        
        // 5. Evaluación final por nivel:

        double notaTotal = 0;
        notaTotal = notasDeExamenes[0] + notasDeExamenes[1] + notasDeExamenes[2] + notasDeExamenes[3] + notasDeExamenes[4];

        System.out.println("\nTu nivel es: ");
        if (notaTotal >= 450){
            System.out.println("Stone Chad definitivo.");
        } else if (notaTotal < 449 && notaTotal >= 350){
            System.out.println("Chad.");
        } else if (notaTotal < 349 && notaTotal >= 250){
            System.out.println("Soft Chad.");
        } else {
            System.out.println("Normie total.");
        }

        // 6. (Desafío final) Ranking entre varios alumnos:


    }
}