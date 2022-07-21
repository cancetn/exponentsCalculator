import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
         programı "For Döngüsü" kullanarak yapınız.
         */

        int sayi, us, sonuc=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Us almak istediginiz sayiyi giriniz = ");

        sayi = inp.nextInt();

        System.out.println("Us degerini giriniz = ");

        us = inp.nextInt();

        for(int i=1; i<=us; i++){
            sonuc = sonuc * sayi;
            System.out.println(i+" . dereceden degeri = "+ sonuc);
        }








    }
}
