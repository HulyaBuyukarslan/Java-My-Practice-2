package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ornekler_02 {
    public static void main(String[] args) {


// Example 1 : String bir Array olusturun ve "Ali" ve "Ali"dan önceki  tum elemanlari ekrana yazdirin.

    String elemanlar [] = {"Hülya", "Rumeysa", "Gulser", "Ali", "Faruk"};
    for (String w : elemanlar){
    System.out.print(w +" ");
         if(w.equals("Ali")){
             break;
    }


}
        System.out.println();



    //Example 2: String bir Array olusturunuz "Ali" ve "Ayse" haric tum elemanlari ekrana yazdiriniz
        String isimler []=  {"Hülya", "Ayse", "Rumeysa", "Gulser", "Ali", "Faruk"};
    for (String w : isimler){
        if(w.equals("Ayse") || w.equals("Ali")){
             continue;
        }
        System.out.print(w+ " ");
    }

        System.out.println();


//Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
//           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kaç isim gireceginizi yaziniz");
        int isimSayisi = input.nextInt();

        String ogrenciAdlari [] = new String[isimSayisi];

        int idx = 0;
        for (String  w : ogrenciAdlari){
            System.out.println("Lutfen ogrenci ismini giriniz");
            String adlar   = input.next();
            ogrenciAdlari [idx] = adlar;
                    idx++;

        }
        System.out.println(Arrays.toString(ogrenciAdlari));

    }

}
