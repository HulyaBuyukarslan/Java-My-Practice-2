package arraylists;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornekler_03 {
    public static void main(String[] args) {

        //Example 1: Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(25);
        sayilar.add(-5);
        sayilar.add(6);
        sayilar.add(6);
        sayilar.add(23);
        sayilar.add(-5);

        System.out.println(sayilar);       //         [25, -5, 6, 6, 23, -5]

        List<Integer> yeniSayilar = new ArrayList<>();
        for (Integer w : sayilar){
            if(!yeniSayilar.contains(w)){
                yeniSayilar.add(w);

            }

        } System.out.println(yeniSayilar);          // [25, -5, 6, 23]




//Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz
// yoksa o harfi List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]


        Scanner input = new Scanner(System.in);
        String harf = "";


        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("K");
        harfler.add("R");
        harfler.add("S");
        System.out.println(harfler);   //     [A, K, R, S]



        do{
            System.out.println("Lutfen bir harf giriniz");
             harf = input.next().substring(0,1);
            if(harfler.contains(harf)){
                harfler.set(harfler.indexOf(harf),"Bulundu");
            }else if (!harf.equalsIgnoreCase("Q")){
                harfler.add(harf);
            }
            System.out.println(harfler);
        } while (!harf.equals("Q"));


    }

        }











