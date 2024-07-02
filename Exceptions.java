import java.math.BigInteger;

public class Exceptions {
    // two type of exception
    // 1.Compile type error 
    // 2. Runtime error 

    public static void main(String args[]){
        //compile type error get compilation time

        // print("Hello");
        // System.out.Println("Hello");

        
        //runtime get error execution time

        Number[] bigInt = new BigInteger[5];
        bigInt[0] = Double.valueOf(123.456);  //ArrayStoreException

        int[] y = {3,5,7,8};
        System.out.println(y[5]);  //ArrayIndexOutOfBoundsException

        int a =45;
        int b =0;
        int c = a/b;
        System.out.println(c); //ArithmeticException

        String x = null;
        System.out.println(x.length());   //NullPointerException
    }
}
