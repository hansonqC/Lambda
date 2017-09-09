package javaex1;

/**
 * Created by lukasz on 2017-09-09.
 */
public class Main {
    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("20 10 = " + myApp.operateBinary(20, 10, subtraction));
        System.out.println(myApp.specialFun(4,2,1,(a,b) ->a*b+1));
    }

}
