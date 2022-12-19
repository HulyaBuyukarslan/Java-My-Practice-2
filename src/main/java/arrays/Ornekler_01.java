package arrays;

import java.util.Arrays;

public class Ornekler_01 {

    public static void main(String[] args) {

// Example 1 :  Array'deki en kucuk ve en buyuk elemani ekrana yazdiriniz.
    int sayilar [] ={23, 16, 90, 12, -5 };
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));   //   [-5, 12, 16, 23, 90]

    int enKucuk = sayilar[0];
    int enBuyuk = sayilar [sayilar.length-1];
        System.out.println("En Kucuk= "  + enKucuk);
        System.out.println("En Buyuk= " + enBuyuk);




// Example 2 : Array'in icindeki tum elemanlarin toplamini ekrana yazdiran kodu yazdiriniz.

    int sayilar1 [] = {9,-3, 5, 12,-6};
    int toplam = 0;
    for (int w : sayilar1){
        toplam+=w;
    }
        System.out.println(toplam);




// Example 3 : String bir Array olusturunuz.
// Bu Array'e 5 tane isim yerlestiriniz.
// Bu isimlerdeki karakter sayilarindaki toplami yazdiriniz.


String isimler [] = {"Ali", "İhsan", "Zeynep", "Ayşe", "Mehmet"};
 int toplam1 = 0;

 for (String w : isimler){
     toplam1 += w.length();
 }
        System.out.println(toplam1);



 //Example 4 : Char bir array olusturunuz
// Bu Array'e bes eleman ekleyiniz
// Bu Array'deki sadece buyuk harfleri ekrana yazdiriniz.

char semboller [] = {'m', 'A', 'Y', 'z','L', 'A' };
for (char w : semboller){
    if(w>='A' && w<='Z'){
        System.out.print(w+" ");
    }

}
    }
}
