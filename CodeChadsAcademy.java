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
        // Se aplica técnica bubble sort.

        double [] notasAOrdenar = notasDeExamenes.clone();

        for (int i = 0; i < notasAOrdenar.length - 1; i++) {
            boolean huboCambios = true;
            
            for (int j = 0; j < notasAOrdenar.length - i - 1; j++) {
                if (notasAOrdenar[j] < notasAOrdenar[j + 1]) {
                    double variableTemporal = notasAOrdenar[j];
                    notasAOrdenar[j] = notasAOrdenar[j + 1];
                    notasAOrdenar[j + 1] = variableTemporal;
                    huboCambios = false;
                }
            }

            if (huboCambios) {
                break;
            }
        }

        System.out.println(
            "\nNotas ordenadas de mayor a menor: " + 
            "\n1: " + notasAOrdenar[0] + 
            "\n2: " + notasAOrdenar[1] + 
            "\n3: " + notasAOrdenar[2] + 
            "\n4: " + notasAOrdenar[3] + 
            "\n5: " + notasAOrdenar[4]
        );
        
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
        
        double [][] estudiantes = new double [4][5];

        // Se cargan notas del primer estudiante.
        estudiantes [0][0] = 60;
        estudiantes [0][1] = 55.1;
        estudiantes [0][2] = 90;
        estudiantes [0][3] = 72.3;
        estudiantes [0][4] = 45.5;

        // Se cargan notas del segundo estudiante.
        estudiantes [1][0] = 40;
        estudiantes [1][1] = 28.9;
        estudiantes [1][2] = 60;
        estudiantes [1][3] = 62;
        estudiantes [1][4] = 50;

        // Se cargan notas del tercer estudiante.
        estudiantes [2][0] = 18;
        estudiantes [2][1] = 58;
        estudiantes [2][2] = 79.8;
        estudiantes [2][3] = 87;
        estudiantes [2][4] = 11;

        // Se cargan notas del cuarto estudiante.
        estudiantes [3][0] = 97;
        estudiantes [3][1] = 78;
        estudiantes [3][2] = 88.2;
        estudiantes [3][3] = 100;
        estudiantes [3][4] = 86;

        System.out.println("\n--- RANKING DE ESTUDIANTES ---");
        System.out.println("Resumen de promedios: \n");

        // Se resuelve qué estudiante obtuvo el promedio más alto.

        double mejorPromedioEstudiantes = 0;
        int numeroMejorEstudiante = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Estudiante número " + (i+1) + ": ");

            double acumuladorPromedio = 0;
            
            for (int j = 0; j < estudiantes[i].length; j++) {
                acumuladorPromedio += estudiantes[i][j];
            }
            
            acumuladorPromedio = acumuladorPromedio / estudiantes[i].length;

            System.out.println(acumuladorPromedio + " puntos.");
            
            if (acumuladorPromedio > mejorPromedioEstudiantes){
                mejorPromedioEstudiantes = acumuladorPromedio;
                numeroMejorEstudiante = i+1;    
            }
        }  

        System.out.println("\nMejor promedio: Estudiante número " + numeroMejorEstudiante + " con " + mejorPromedioEstudiantes + "puntos.");
                

    }
}   