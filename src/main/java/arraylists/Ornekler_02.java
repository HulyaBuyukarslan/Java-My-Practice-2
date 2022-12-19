package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Ornekler_02 {
    public static void main(String[] args) {


//Example 1: Bir tane salary listi olusturun.
// Eger salary 10000'den az ise %20 10000 ve 10000'den cok ise %10 zam yapiniz.

        List<Double> salary = new ArrayList<>();
        salary.add(9.250);
        salary.add(12.500);
        salary.add(8.750);
        salary.add(15.250);
        salary.add(18.750);
        System.out.println(salary);     // [9.25, 12.5, 8.75, 15.25, 18.75]



        for (Double w : salary){
            if (w<10000){
                salary.set(salary.indexOf(w), w*1.2);


            }else {
                salary.set(salary.indexOf(w), w*1.1);

            }



        }System.out.println(salary);            // [11.1, 15.0, 10.5, 18.3, 22.5]



//Example 2: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz


    List<String> renkler1 = new ArrayList<>();
    renkler1.add("mavi");
    renkler1.add("yesil");
    renkler1.add("kirmizi");
    renkler1.add("sari");

    List<String> renkler2 = new ArrayList<>();

    renkler2.add("mavi");
    renkler2.add("yesil");
    renkler2.add("kirmizi");
    renkler2.add("mor");


       int counter = 0;


        for (int i = 0; i < renkler1.size() ; i++) {
            if( renkler1.size()!=renkler2.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            } else if ( renkler1.get(i)!= renkler2.get(i) ){
                counter++;
                System.out.println("Listler esit degildir");
                break;

            }

        }if(counter==0){
            System.out.println("Listler esittir.");
        }



     // 2.Yol  :


        boolean esitMi = renkler1.equals(renkler2);

        if(esitMi){
        System.out.println("Listler esittir.");
        }else {
        System.out.println("Listler esit degildir.");
        }

    }


}
