import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Brayan Camilo Moreno Romero
 * Miguel Angel Sierra Morales
 * Sergio Alejandro Hernandez Zambrano
 */
public class gimnasio {
    public static boolean case1Return = false;
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
    private static Estudiantes estudiante;


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
                    for (int i = 0; i < listaE.size(); i++) {
                        cedulas(i, cedula);
                    }
                    if (case1Return) {
                        for (int k = 0; k < cubiculos; k++) {
                            for (int j = 0; j < casilleros; j++) {
                                System.out.println(matriz[k][j]);

                            }
                        }
                    }

//


                    break;
                case 2:
                    cedula = "";
                    leer = new Scanner(System.in);
                    System.out.println("cedula");
                    cedula = leer.nextLine();
                    retirarUsuario(cedula);

                    for (int i = 0; i < cubiculos; i++) {
                        for (int j = 0; j < casilleros; j++) {
                            matriz[i][j] = "" + (i + 1) + "," + (j + 1) + "";

                        }
                    }


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

    public static void cedulas(int i, String cedula) {
        if (cedula.length() == 10 && cedula.length() > 0 && !cedula.equals(listaE.get(i).cedula)) {
            estudiante = new Estudiantes(nombre, apellido, cedula);
            listaE.add(estudiante);
            case1Return = true;

        }
    }


    public static String retirarUsuario(String cedula) {
        int contador = 0;
        String posicion = "";
        for (int i = 0; i < listaE.size(); i++) {
            if (cedula.equals(listaE.get(i).cedula)) {
                posicion = listaE.get(i).nombre;
            }

        }
        for (int i = 0; i < cubiculos; i++) {

            if (contador == 0) {
                for (int j = 0; j < casilleros; j++) {
                    if (matriz[i][j] == posicion) {
                        matriz[i][j] = "" + (i + 1) + "," + (j + 1) + "";
                        contador += 1;

                        break;

                    } else {

                    }

                }

            }


        }

       return "Se elimino" + posicion +"de cubiculo"+ cubiculos+"y casillero"+casilleros ;
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

