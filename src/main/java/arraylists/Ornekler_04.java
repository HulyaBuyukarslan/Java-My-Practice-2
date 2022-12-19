package arraylists;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Ornekler_04 {
    public static void main(String[] args) {



//Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
//              [12, 19, 15, 30, 21]  ==>  19 ve 21


List<Integer> eleman = new ArrayList<>();
eleman.add(12);
eleman.add(19);
eleman.add(15);
eleman.add(30);
eleman.add(21);
        System.out.println(eleman);             // [12, 19, 15, 30, 21]

        Collections.sort(eleman);
        System.out.println(eleman);             // [12, 15, 19, 21, 30]


        int azFark = Integer.MAX_VALUE;
        for (int i = 1; i <eleman.size() ; i++) {

        azFark = Math.min(azFark, eleman.get(i)-eleman.get(i-1));
        }
        System.out.println(azFark);    //2






//Example 2: Bir Integer ArrayList'teki 7 hariç tüm elemanları 2 artırınız
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(12);
        rakamlar.add(6);
        rakamlar.add(9);
        rakamlar.add(4);
        rakamlar.add(7);
        rakamlar.add(3);
        System.out.println(rakamlar);       // [12, 6, 9, 4, 7, 3]

        for (Integer w : rakamlar){
          if (w==7) {
              continue;
          }
              rakamlar.set(rakamlar.indexOf(w), w+2);

        }
            System.out.println(rakamlar);       // [14, 8, 11, 6, 7, 5]



// Example 2: Size verilen ArrayList'te 8 ve 8'den onceki tum elemanlari iki katina cikariniz.

        List<Integer> rakamlar1 = new ArrayList<>();
        rakamlar1.add(10);
        rakamlar1.add(6);
        rakamlar1.add(9);
        rakamlar1.add(11);
        rakamlar1.add(8);
        rakamlar1.add(3);
        System.out.println(rakamlar1);          //  [10, 6, 9, 11, 8, 3]


        for (Integer w : rakamlar1){

            rakamlar1.set(rakamlar1.indexOf(w),w*2);

            if(w ==8) {
                break;
            }

        } System.out.println(rakamlar1);        // [20, 12, 18, 22, 16, 3]
    }
}
