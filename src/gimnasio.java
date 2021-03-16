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
    public static List<Estudiante> listaE;
    public static Scanner leer;
    public static String matriz[][];
    public static int cubiculos;
    public static int casilleros;
    public static String nombre;
    public static String apellido;
    public static String cedula;
    private static Estudiante estudiante;
    public static String imprimirCase2;
    public static String imprimirCase3;


    public static void main(String[] args) {
        salir = false;
        listaE = new ArrayList<>();
        leer = new Scanner(System.in);
        String cub = leer.nextLine();
        cubiculos = Integer.parseInt(cub);
        String cas = leer.nextLine();
        casilleros = Integer.parseInt(cas);
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
                    try {
                        cedula = leer.nextLine();
                        String nom = leer.nextLine();
                        nombre = nom.split(" ")[0];
                        apellido = nom.split(" ")[1];
                    } catch (Exception e) {

                    }


                    if (cedulas(cedula)) {
                        estudiante = new Estudiante(nombre, apellido, cedula);
                        listaE.add(estudiante);
                        añadirEstudiante(nombre);
                        for (int k = 0; k < cubiculos; k++) {
                            for (int j = 0; j < casilleros; j++) {
                                System.out.println(matriz[k][j]);
                            }
                        }
                    } else {
                        System.exit(0);
                    }
                    break;
                case 2:
                    cedula = "";

                    cedula = leer.nextLine();
                    retirar(cedula);

                    System.out.println(imprimirCase2);
                    for (int i = 0; i < cubiculos; i++) {
                        for (int j = 0; j < casilleros; j++) {
                            System.out.println(matriz[i][j]);
                        }
                    }

                    break;
                case 3:
                    cedula = "";
                    leer = new Scanner(System.in);
                    cedula = leer.nextLine();
                    consultar(cedula);
                    System.out.println(imprimirCase3);
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
                    if (numListRegistro() == 1) {
                        if (matriz[i][j].equals("" + (i + 1) + "," + (j + 1) + "")) {
                            matriz[i][j] = nombre;
                            contador += 1;
                            break;
                        }
                    } else {
                        if (matriz[i + formula()][j].equals("" + (i + (formula() + 1)) + "," + (j + 1) + "")) {
                            matriz[i + formula()][j] = nombre;
                            contador += 1;
                            break;
                        }

                    }
                }
            }
        }
    }

    public static boolean cedulas(String cedula) {

        boolean case1Return = false;
        try {
            for (int i = 0; i <= listaE.size(); i++) {
                if (cedula.length() == 10) {
                    if (listaE.size() == 0) {
                        case1Return = true;
                    } else {
                        if (!listaE.get(i).cedula.equals(cedula)) {
                            case1Return = true;
                        }
                    }

                }
            }
        } catch (Exception e) {
        }
        return case1Return;
    }

    public static void retirar(String cedula) {
        int contador = 0;
        imprimirCase2 = "";
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
                        imprimirCase2 = "Se elimino " + posicion + " de cubiculo " + (i + 1) + " y casillero " + (j + 1);
                        contador += 1;
                        break;
                    }
                }
            }
        }

    }

    public static void consultar(String cedula) {
        int contador = 0;
        imprimirCase2 = "";
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
                        imprimirCase3 = posicion + " esta ubicado en cubiculo " + (i + 1) + " y casillero " + (j + 1);
                        contador += 1;
                        break;
                    }
                }
            }
        }

    }

    public static int formula() {
        int resultado = casilleros / numListRegistro();
        return resultado;
    }

    public static int numListRegistro() {
        int listnum = 0;
        if (listaE.size() != 0) {
            for (int i = 0; i < listaE.size(); i++) {
                listnum += 1;
            }
        }
        return listnum;
    }
}

