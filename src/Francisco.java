import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Francisco {
    public static int numeroDeCualidades;
    public static int cualidades;
    public static int cantidad;

    public static List<Integer> numeroDeCualisalesList;
    public static List<Integer> cualidadesList;
    public static List<Chica> listChicas;

    public static String cuM;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cuM = null;
        numeroDeCualisalesList = new ArrayList();
        cualidadesList = new ArrayList();
        listChicas = new ArrayList<>();

        String num = leer.nextLine();
        numeroDeCualidades = Integer.parseInt(num.replace(" ", ""));
        String cu = leer.nextLine();
        cualidades = Integer.parseInt(cu.replace(" ", ""));
        cantidad = leer.nextInt();


        for (int i = 0; i < cantidad; i++) {
            cuM = leer.nextLine();
            cuM = cuM.replace(" ", "");
            crearChicas(cuM);
        }


    }

    private static int compararCualidades(List<Chica> listaChicas, List<cualidades> listaDeCualides) {
        int cantidadDeCualidades = 0;
        for (int i = 0; i < listaChicas.size(); i++) {
            if (listaChicas.get(i).getCualidades().contains(listaDeCualides.get(i))) {
                cantidadDeCualidades = +cantidadDeCualidades;
            }
        }
        return cantidadDeCualidades;
    }

    private static void crearChicas(String cuM) {
        int cantidadCualidades = 0;
        int uno = Integer.parseInt(cuM.substring(0));
        int dos = Integer.parseInt(cuM.substring(1));
        int tres = Integer.parseInt(cuM.substring(2));
        int cuatro = Integer.parseInt(cuM.substring(3));
        int cinco = Integer.parseInt(cuM.substring(4));
        int seis = Integer.parseInt(cuM.substring(5));
        int siete = Integer.parseInt(cuM.substring(6));
        cualidades cualidades = new cualidades(uno, dos, tres, cuatro, cinco, seis, siete);
        List<cualidades> list = new ArrayList<>();
        list.add(cualidades);
        for (int i = 0; i < cuM.length(); i++) {
            if (Integer.parseInt(cuM.substring(i)) != 0) {
                cantidadCualidades = +cantidadCualidades;
            }
        }
        Chica chica = new Chica(cantidadCualidades, list);
        listChicas.add(chica);
    }

//    private static int cantidadDeChicas() {
//        return
//    }

}

class Chica {
    private int numeroDeCalidades;
    private List<cualidades> cualidades;

    public Chica(int numeroDeCalidades, List<cualidades> cualidades) {
        this.numeroDeCalidades = numeroDeCalidades;
        this.cualidades = cualidades;
    }

    public List<cualidades> getCualidades() {
        return cualidades;
    }
}

class cualidades {
    private int carinosa;
    private int extrovertida;
    private int chistosa;
    private int tierna;
    private int sincera;
    private int buenaBailarina;
    private int sencilla;


    public cualidades(int carinosa, int extrovertida, int chistosa, int tierna, int sincera, int buenaBailarina, int sencilla) {
        this.carinosa = carinosa;
        this.extrovertida = extrovertida;
        this.chistosa = chistosa;
        this.tierna = tierna;
        this.sincera = sincera;
        this.buenaBailarina = buenaBailarina;
        this.sencilla = sencilla;
    }
}
