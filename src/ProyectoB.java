import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoB {


    public static void main(String[] args) {

        Estudiante estudiante;
        EstudianteDAO estudianteDAO = new EstudianteDAO();
        int opcion, opcion1 =0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre:  ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido:  ");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese la cedula:  ");
        int cedula = entrada.nextInt();
        estudiante = new Estudiante(nombre, apellido, cedula);


        System.out.println("digite una opcion: \n**********************\n1.Ingresar usuario a casillero \n2.Retirar usuario de casillero\n3.Consultar usuario de casillero"
                + "\n4.salir");
        opcion = entrada.nextInt();
        if (opcion==1){
            System.out.println("Ingrese la cedula del usuario:  ");
            int cedulaIngresar = entrada.nextInt();
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
        }
        else if (opcion == 2){
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
        }
        else if (opcion == 3){
            System.out.println("Ingrese la cedula del usuario que quiere consultar: ");
            int cedulaConsultar= entrada.nextInt();
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
        }
        else if(opcion==4){
            System.exit(0);
        }
        else{
            System.out.println("Por favor ingrese un valor valido");
        }



    }

    static class Estudiante {
        public String nombre = "";
        public String apellido = "";
        public int cedula = 0;

        public Estudiante(String nombre, String apellido, int cedula) {
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

    }
}
