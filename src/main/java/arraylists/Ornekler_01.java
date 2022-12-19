package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Ornekler_01 {
    public static void main(String[] args) {


//Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdirin.
        List<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(4);
        nums.add(21);
        nums.add(8);
        nums.add(3);
        nums.add(17);
        System.out.println(nums);  // [11, 4, 21, 8, 3, 17]



        for (Integer w : nums) {
         if(w%2 != 0){
             nums.set(nums.indexOf(w), w+11);
         }

        }
            System.out.println(nums);   // [22, 4, 32, 8, 14, 28]



//Example 2: ArrayList'den 34 elemaninin ilk gorunumunu  siliniz
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(34);
        sayilar.add(26);
        sayilar.add(34);
        sayilar.add(-2);
        System.out.println(sayilar);        // [5, 34, 26, 34, -2]

        Integer sayi = 34;
        sayilar.remove(sayi);
        System.out.println(sayilar);        // [5, 26, 34, -2]


//Example 3: "takilar1" listinde "kolye" elemaninin ilk gorunumunu siliniz

    List<String> takilar1 = new ArrayList<>();
    takilar1.add("bilezik");
    takilar1.add("kupe");
    takilar1.add("kolye");
    takilar1.add("yuzuk");
    takilar1.add("halhal");

        System.out.println(takilar1); //  [bilezik, kupe, kolye, yuzuk, halhal]
        takilar1.remove("kolye");
        System.out.println(takilar1);  // [bilezik, kupe, yuzuk, halhal]


//Example 4: "takilar" listinde "kolye" elemaninin  gorunumlerini siliniz


        List<String> takilar = new ArrayList<>();
        takilar.add("bilezik");
        takilar.add("kupe");
        takilar.add("kolye");
        takilar.add("yuzuk");
        takilar.add("kolye");
        takilar.add("halhal");
        takilar.add("kolye");
        System.out.println(takilar);    // [bilezik, kupe, kolye, yuzuk, kolye, halhal, kolye]

        List<String> yeniTaki = new ArrayList<>();
        yeniTaki.add("kolye");
        takilar.removeAll(yeniTaki);

        System.out.println(takilar);   // [bilezik, kupe, yuzuk, halhal]


    }

}















