public class Exception_Handling {
    public static void main(String[] args) {

        System.out.println("Hello world");

        int a =45;
        int b =0;
        try{
        int c = a/b;//ArithmeticException 
        System.out.println(c); 
    }
    catch(Exception x){
        System.out.println("something went wrong " + x);
    }
    System.out.println("My name is Shubham");


    // type 2
// if error will come in try block then execute catch block otherwise not execute catch block
    int[] arr = {1,2,3,4};   
    String f = null;

try{
    System.out.println(arr[5]); 
    System.out.println(f.length()); 


        System.out.println("this is try block 1"); 
        System.out.println("this is try block 2"); 
        int c = a/b;  
        System.out.println("this is try block 3"); 
    }
    catch(ArithmeticException i){
        System.out.println("divisible by zero error");
    }
    //you can check more than one exception use at the same time

    catch(ArrayIndexOutOfBoundsException | NullPointerException j){
        System.out.println("array error");
    }
    catch(Exception  x){
        System.out.println("new error " + x);
    }
    }

    // exception use of end of the code not use starting file_

}
