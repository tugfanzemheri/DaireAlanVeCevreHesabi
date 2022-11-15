import java.util.Scanner;
public class DaireDilimiAlanHesabi {
    public static void main(String[] args) {
        double pi=3.14, alan, r=3.14, 𝛼;
        System.out.print("Dairenin yarıçapını giriniz    : ");
        Scanner gr = new Scanner(System.in);
        alan = gr.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz: ");
        Scanner g𝛼 = new Scanner(System.in);
        𝛼 = g𝛼.nextDouble();
        alan = (pi * (r * r) * 𝛼) / 360;
        System.out.println("Merkez açısı " + 𝛼 + " derece olan daire diliminin alanı: " + alan);
    }
}
