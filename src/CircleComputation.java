/*
mini programi do obliczania pola i obwodu koła
na podstawie średnicy
 */

public class CircleComputation {
    public static void main(String[] args) {
                                        //rozpoczynam od nazwania i typów zmiennych
        double promien, pole, obwod;    //3 zmienne + typ double - zmienne i wynik będzie liczba zmiennoprzecinkową

        final double PI = 3.14159265;   //zdeklarowana liczba PI, double bo jest zmiennoprzecinkowa a FINAL czyni ja stałą (tak tworzymy stałe);
        promien  = 1.2;                 //deklaruję wartość
        pole = PI * promien * promien;  //podaję algorytm do obliczeń pola
        obwod = 2.0 * PI * promien;     //podaję algorytm do obliczeń obwodu; obwod jest typu double więc musi miec przecinek 2.0

        System.out.print("Przy promieniu okręgu równym ");
        System.out.println(promien);
        System.out.print("Pole tego okręgu wynosi ");
        System.out.println(pole);
        System.out.print(" oraz obwód wynosi ");
        System.out.println(obwod);

    }
}
