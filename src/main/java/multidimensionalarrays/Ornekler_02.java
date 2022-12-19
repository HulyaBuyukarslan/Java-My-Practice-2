package multidimensionalarrays;

import java.util.Arrays;

public class Ornekler_02 {
    public static void main(String[] args) {

//Example 1 : Bir tane integer multidimensional array olusturunuz
//Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        int sayilar[][] = {{1, 2, 3}, {4, 5,}, {6, 7, 8, 9}, {0}, {9}};
        int toplam = 0;
        for (int[] w : sayilar) {
            for (int k : w) {
                toplam += k;
            }
        }
        System.out.println(toplam);


//Example 2 : Bir multidimensional array'i normal array'e ceviren kodu yaziniz

      String buyukAile [][] = { {"Hulya", "Faruk", "Emine"}, {"Yeter", "Serif"}, {"Hiranur"}, {"Miray"}  };
      int toplam1 = 0;

      for (String [] w : buyukAile){
          toplam1 +=w.length;
      }
        System.out.println(toplam1); // 7



        String aile [] = new String[toplam1];
        int idx = 0;
        for (String [] w : buyukAile){
            for (String k :w){
                aile [idx] = k;
           idx++;

            }
        }
        System.out.println(Arrays.toString(aile));  // [Hulya, Faruk, Emine, Yeter, Serif, Hiranur, Miray]
    }
}













//Example 3 : Bir multidimensional array deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz















