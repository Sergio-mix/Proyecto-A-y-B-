import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Francisco {

    public static int numeroDeCualidades;
    public static int cantidadDeChicas;
    public static String cualidadesM;
    public static String cualidadesN;
    public static List<String> cualidadesDeLasChicas;
    public static int contador;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        cualidadesDeLasChicas = new ArrayList<>();

        numeroDeCualidades = leer.nextInt();
        String cualidades = leer2.nextLine();
        cualidadesN = cualidades.replace(" ", "");
        cantidadDeChicas = leer.nextInt();

        for (int i = 0; i < cantidadDeChicas; i++) {
            String cualidadesChicas = leer2.nextLine();
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

    public static int obtenerNumero(int i) {
        int contadorP = 0;
        for (int j = 0; j < numeroDeCualidades; j++) {
            if (cualidadesDeLasChicas.get(i).contains(cualidadesN.substring(j, j + 1))) {
                contadorP += 1;
                if (contadorP == numeroDeCualidades) {
                    contador += 1;
                    contadorP = 0;
                    j = 0;
                }
            }
        }
        return contador;
    }
}