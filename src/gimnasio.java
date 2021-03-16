import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Brayan Camilo Moreno Romero
 * Miguel Angel Sierra Morales
 * Sergio Alejandro Hernandez Zambrano
 */
public class gimnasio {

    public static int opcion;
    public static boolean salir;
    public static List<Estudiantes> listaE;
    public static Scanner leer;
    public static String matriz[][];
    public static int cubiculos;
    public static int casilleros;
    public static String nombre;
    public static String apellido;
    public static String cedula;
    private static Estudiante estudiante;


    public static void main(String[] args) {
        salir = new Boolean(false);
        listaE = new ArrayList<>();
        leer = new Scanner(System.in);

        cubiculos = leer.nextInt();

        casilleros = leer.nextInt();
        matriz = new String[cubiculos][casilleros];

        for (int i = 0; i < cubiculos; i++) {
            for (int j = 0; j < casilleros; j++) {
                matriz[i][j] = "" + (i + 1) + "," + (j + 1) + "";

            }
        }

        while (!salir) {
            try {
                String op = leer.nextLine();
                opcion = Integer.parseInt(op);

            } catch (Exception e) {

            }


            switch (opcion) {
                case 1:
                    nombre = "";
                    apellido = "";
                    leer = new Scanner(System.in);
                    System.out.println("cedula");
                    cedula = leer.nextLine();
                    System.out.println("nombre");
                    String nom = leer.nextLine();

                    nombre = nom.split(" ")[0];
                    apellido = nom.split(" ")[1];

                    System.out.println("nombre" + nombre + " apellido" + apellido);
                    añadirEstudiante(nombre);


//
                    estudiante = new Estudiante(nombre, apellido, cedula);

                    for (int i = 0; i < cubiculos; i++) {
                        for (int j = 0; j < casilleros; j++) {
                            System.out.println(matriz[i][j]);

                        }
                    }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    salir = true;
                    break;
            }

        }


    }

    public static void añadirEstudiante(String nombre) {
        int contador = 0;
        for (int i = 0; i < cubiculos; i++) {

            if (contador == 0) {
                for (int j = 0; j < casilleros; j++) {

                    if (matriz[i][j].equals("" + (i + 1) + "," + (j + 1) + "")) {

                        matriz[i][j] = nombre;
                        contador += 1;

                        break;

                    } else {

                    }

                }

            }


        }


    }

    class Estudiantes {
        public String nombre;
        public String apellido;
        public String cedula;

        public Estudiantes(String nombre, String apellido, String cedula) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = cedula;
        }
    }
}
