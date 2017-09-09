package javaex1;

/**
 * Created by lukasz on 2017-09-09.
 */
public class Calculator {
    public Integer operateBinary(Integer a, Integer b, IntegerMath lambda){
        int result = lambda.f(a, b);
        return  result;
    }

    public int specialFun(Integer x, Integer y, Integer z, IntegerMath lambda ){
        return x*x + y -z + lambda.f(x,y);
    }
}
