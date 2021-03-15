import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Brayan Camilo Moreno Romero
 * Miguel Angel Sierra Morales
 * Sergio Alejandro Hernandez Zambrano
 */
public class francisco {

    public static int numeroDeCualidades;
    public static int cantidadDeChicas;
    public static String cualidadesM;
    public static String cualidadesN;
    public static List<String> cualidadesDeLasChicas;
    public static int contador;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        cualidadesDeLasChicas = new ArrayList<>();

        String numCu = leer.nextLine();
        numeroDeCualidades = Integer.parseInt(numCu.replace(" ", ""));
        String cualidades = leer.nextLine();
        cualidadesN = cualidades.replace(" ", "");
        String canChi = leer.nextLine();
        cantidadDeChicas = Integer.parseInt(canChi.replace(" ", ""));
        for (int i = 0; i < cantidadDeChicas; i++) {
            String cualidadesChicas = leer.nextLine();
            cualidadesM = (cualidadesChicas.replace(" ", ""));
            cualidadesDeLasChicas.add(cualidadesM);
        }

        if (cantidadDeChicas <= 100
                && cantidadDeChicas >= 1
                && numeroDeCualidades <= 100
                && numeroDeCualidades >= 1) {

            for (int i = 0; i < cualidadesDeLasChicas.size(); i++) {
                obtenerNumero(i);
            }

            System.out.println(contador);

        } else {
            System.exit(0);
        }
    }

    public static void obtenerNumero(int i) {
        int contadorP = 0;
        for (int j = 0; j < numeroDeCualidades; j++) {
            if (cualidadesDeLasChicas.get(i).contains(cualidadesN.substring(j, j + 1))) {
                contadorP += 1;
                if (contadorP == numeroDeCualidades) {
                    contador += 1;
                    contadorP = 0;
                }
            }
        }
    }
}