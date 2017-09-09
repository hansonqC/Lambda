package lambdademo;


@FunctionalInterface
interface FunctInterface {
  //  metoda opisuje strukture dozwolonych wyrazen lambda , wzor podany w momencie wywoływania funkcji fun
    String h (String w1,String w2);
}
public class Main {
    // funkcja która jako argument przyjmuje wyrazenie lambda zgodne z interfejsem FundInterface
    private static String fun(FunctInterface fi){
        String result = "joined strings :"+ fi.h("abc","ghi");
        return  result;
    }
    public static void main(String[] args) {
       FunctInterface fi = (a,b) -> a+", "+b+", "+a;
       // w momencie wywoływania funkcji fun przekazuje jej konkretny anonimowi wzór funkcji która przyjmuje dwa napisy i zwraca napis
        System.out.println(fi.h("test1","test2"));

    }
}
