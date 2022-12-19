package arrays;

import java.util.Arrays;

public class Ornekler_04 {

    public static void main(String[] args) {

//Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki
// "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.

int tamSayilar [] = {25, -2, 16, -9, 53};
 Arrays.sort(tamSayilar);
        System.out.println(Arrays.toString(tamSayilar));   // [-9, -2, 16, 25, 53]
int enBuyukNegatif = tamSayilar[0];
int enKucukPozitif = tamSayilar[tamSayilar.length-1];

for( int w : tamSayilar){
  if (w<0) {
      enBuyukNegatif = Math.max(enBuyukNegatif, w);
  }
   if(w>0) {

       enKucukPozitif = Math.min(enKucukPozitif,w);
   }

} System.out.println(enBuyukNegatif + " ve " + enKucukPozitif);




//Example 2: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz
        String cumle = "Cok para kazanmam icin Java ogrenmem lazim.";
        String sesliHarf [] = cumle.toLowerCase().split("");


        int counter = 0;

     for (String w : sesliHarf){
         switch (w){
             case "a":
             case "e":
             case "ı":
             case "u":
             case "o":
          counter++;
         }
     }
        System.out.println(counter);
    }

}
