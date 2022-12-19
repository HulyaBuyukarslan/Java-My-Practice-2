package arrays;

import java.util.Arrays;

public class Ornekler_03 {
    public static void main(String[] args) {

// Example 1: [0, 2, 3, 0, 9 , 0] sifirlari en sona koyunuz

        int rakamlar[] = {0, 2, 3, 0, 9, 0};
        int yeniRakamlar[] = new int[rakamlar.length];
        int idx = 0;

        for (int i = 0; i < rakamlar.length; i++) {
            if (rakamlar[i] != 0) {
                yeniRakamlar[idx] = rakamlar[i];
                idx++;
            }

        }
        System.out.println(Arrays.toString(yeniRakamlar));


//Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
//           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
//                             ==> Kullanici 6'yi sordu ==> 6 array'de yok

        int sayilar [] = {2, 1, 2, -3, 2};

        int sayi = 2;

   int counter = 0;


    for (int w : sayilar){

        if(w == sayi){
            counter++;
        }

        }if(counter > 0) {
            System.out.println(sayi + " Array'de " + counter + " defa vardir");

        } else {    System.out.println(sayi + " Array'de yoktur");

        }

    //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana


    String cumle = "Java kolaydir calisana, ne kolay ki calismayana.";

    cumle = cumle.replaceAll("\\p{Punct}", "");

    String yeniCumle  [] = cumle.toLowerCase().split(" ");

    System.out.println(Arrays.toString(yeniCumle));// [java, kolaydir, calisana, ne, kolay, ki, calismayana]

        System.out.println(yeniCumle[yeniCumle.length-1]);

    }


}




