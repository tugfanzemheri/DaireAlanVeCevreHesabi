import java.util.Scanner;
public class DaireAlanVeCevreHesabi {
    public static void main(String[] args) {
        double r, cevre, alan, pi=3.14;
        Scanner gir = new Scanner(System.in);
        System.out.print("Dairenin yarıçap değerini giriniz : ");
        r = gir.nextDouble();
        alan = pi*r*r;
        cevre = 2*pi*r;
        System.out.println("Dairenin Alanı   : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);



    }
}
