package multidimensionalarrays;

import java.util.Arrays;

public class Ornekler_01 {
    public static void main(String[] args) {

        //Example 1: String bir Multidimesional Array olusturunuz.
        //           Elemanlari ekleyiniz
        //           Toplam eleman sayisini ekrana yazdiran kodu yaziniz


        String elemanlar[][] = {{"Hulya", "Faruk"}, {"Miray", "Hiranur"}, {"Serif", "Yeter"}};

        System.out.println(Arrays.deepToString(elemanlar)); // [[Hulya, Faruk], [Miray, Hiranur], [Serif, Yeter]]

        int toplam = 0;
        for (String[] w : elemanlar) {

            toplam += w.length;
        }
        System.out.println(toplam);





        //Example 2: Bir String multidimensional array'de icinde "a" olan elemanlari concole'a yazdiriniz.


        String elemanlar1[][] = {{"Hulya", "Faruk"}, {"Miray", "Hiranur"}, {"Serif", "Yeter"}};


     for (String [] w : elemanlar1){
         for (String k : w){
             if(k.contains("a")){
                 System.out.print(k + " ");
             }
         }

        }
    }
}
