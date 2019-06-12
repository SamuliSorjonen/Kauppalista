import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class main {


    public static void main (String [] args){
        ArrayList<Tuote> kauppalista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        BigDecimal kallein = BigDecimal.ZERO;
        BigDecimal halvin = BigDecimal.ZERO;

        while (true){
            System.out.println("Anna tuotteen nimi tai lopeta painamalla pelkästään enter");
            String nimi = lukija.nextLine();
            if (nimi.equals("")){
                break;
            }
            System.out.println("Anna hinta");
            String alkuHinta = lukija.nextLine();
            BigDecimal hinta = new BigDecimal(alkuHinta);

            kauppalista.add (new Tuote (nimi, hinta));

            if (hinta.compareTo(kallein) > 0 || kallein.compareTo(BigDecimal.ZERO) == 0){
                kallein = hinta;
            }

            if (hinta.compareTo(halvin) < 0 || halvin.compareTo(BigDecimal.ZERO) == 0){
                halvin = hinta;
            }

        }

        while(true){
            System.out.println();
            System.out.println("Jos haluat kalleimman tuotteen, valitsa A");
            System.out.println("Jos haluat halvimman tuotteen, valitse B");
            System.out.println("Jos haluat koko listan, valitse C");
            System.out.println("Jos haluat jo lähteä kauppaan, valitse D");
            String valinta = lukija.nextLine();

            if (valinta.equals("A")){
                for (Tuote tuote : kauppalista){
                    if (tuote.getHinta().equals(kallein)){
                        System.out.println("Kallein tuote on: " + tuote);
                    }
                }
            } else if (valinta.equals("B")){
                for (Tuote tuote : kauppalista){
                    if (tuote.getHinta().equals(halvin)){
                        System.out.println("Halvin tuote on: " + tuote);
                    }
                }
            } else if (valinta.equals("C")){
                System.out.println("Tässä koko lista:");
                for (Tuote tuote : kauppalista){
                    System.out.println(tuote);
                }
            } else if (valinta.equals("D")){
                System.out.println("Mukavaa kauppareissua");
                break;
            } else {
                System.out.println("Mene nukkumaan!");
                break;
            }
        }
    }
}
