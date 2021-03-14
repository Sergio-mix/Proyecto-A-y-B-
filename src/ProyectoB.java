import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoB {


    public static void main(String[] args) {
        EstudianteDAO estudianteDAO = new EstudianteDAO();
        Estudiante estudiante;

        int nCubiculo = 0;
        ArrayList<Integer> casilleros = new ArrayList<Integer>();
        int nCasilleros = 0;
        ArrayList<String> cedulas = new ArrayList<String>();

        int opcion, opcion1 = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantos cubiculos tiene: ");
        nCubiculo = entrada.nextInt();

        for (int i = 1; i <= nCubiculo; i++) {
            System.out.println("Ingrese el numero de casilleros que tiene el " + i + " cubiculo: ");
            nCasilleros = entrada.nextInt();
            casilleros.add(nCasilleros);
        }
        System.out.println(nCubiculo);
        for (int i = 0; i < casilleros.size(); i++) {
            System.out.println(casilleros.get(i));
        }

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre:  ");
        String nombre = entrada2.nextLine();

        System.out.println("Ingrese el apellido:  ");
        String apellido = entrada2.nextLine();

        System.out.println("Ingrese la cedula:  ");
        String cedula = Integer.toString(entrada2.nextInt());
        estudiante = new Estudiante(nombre, apellido, cedula);
        cedulas.add(cedula);


        System.out.println("digite una opcion: \n**********************\n1.Ingresar usuario a casillero \n2.Retirar usuario de casillero\n3.Consultar usuario de casillero"
                + "\n4.salir");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese la cedula del usuario:  ");
            String cedulaIngresar = Integer.toString(entrada.nextInt());
            boolean existe = cedulas.contains(cedulaIngresar);
            int aux = 0;
            if (existe) {

                for (int i = 0; i < casilleros.size(); i++) {
                    if (casilleros.get(i) > 0) {
                        aux = casilleros.get(i);
                        aux += -1;
                        System.out.println(aux);

                    }else if(casilleros.get(i+1) >0){
                        aux = casilleros.get(i+1);
                        aux += -1;
                        System.out.println(aux);
                    }
                    else System.out.println("No hay mas espacios");
                }
            }
            System.out.println("¿Que desea hacer?\n1.Volver al menu inicial\n2.Salir");
            opcion1 = entrada.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("digite una opcion: \n**********************\n1.Ingresar usuario a casillero \n2.Retirar usuario de casillero\n3.Consultar usuario de casillero"
                            + "\n4.salir");
                    opcion = entrada.nextInt();

                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Por favor ingrese un valor valido");

            }
        } else if (opcion == 2) {
            System.out.println("Ingrese la cedula del usuario que quiere retirar: ");
            int cedulaEliminar = entrada.nextInt();
            System.out.println("¿Que desea hacer?\n1.Volver al menu inicial\n2.Salir");
            opcion1 = entrada.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("digite una opcion: \n**********************\n1.Ingresar usuario a casillero \n2.Retirar usuario de casillero\n3.Consultar usuario de casillero"
                            + "\n4.salir");
                    opcion = entrada.nextInt();

                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Por favor ingrese un valor valido");

            }
        } else if (opcion == 3) {
            System.out.println("Ingrese la cedula del usuario que quiere consultar: ");
            int cedulaConsultar = entrada.nextInt();
            System.out.println("¿Que desea hacer?\n1.Volver al menu inicial\n2.Salir");
            opcion1 = entrada.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("digite una opcion: \n**********************\n1.Ingresar usuario a casillero \n2.Retirar usuario de casillero\n3.Consultar usuario de casillero"
                            + "\n4.salir");
                    opcion = entrada.nextInt();

                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Por favor ingrese un valor valido");

            }
        } else if (opcion == 4) {
            System.exit(0);
        } else {
            System.out.println("Por favor ingrese un valor valido");
        }


    }


    static class Estudiante {
        public String nombre = "";
        public String apellido = "";
        public String cedula = "";

        public Estudiante(String nombre, String apellido, String cedula) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = cedula;
        }
    }

    static class EstudianteDAO {
        public ArrayList<Estudiante> aEstudiante;

        public EstudianteDAO() {
            aEstudiante = new ArrayList<Estudiante>();
        }

        public String agregarEstudiante(Estudiante estudiante) {
            aEstudiante.add(estudiante);
            return "Se ha registrado un estudiante";
        }

//        public Boolean ingresarUsuario(String cedula) {
//            boolean existe = aEstudiante.contains(cedula);
//            if (existe) {
//                for (int i = 0; i <){}
//            }
//
//            return existe;
//        }

    }
}
