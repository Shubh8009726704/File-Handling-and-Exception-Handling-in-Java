public class FinallyException {
    public static void main(String[] args) {
        int a[] = {10,20,30,40};

        System.out.println("Hello everyone");
        try {
            System.out.println(a[8]);
        } 
        catch (Exception e) {
            System.out.println("Exceptions handling");
        }
        finally{
            System.out.println("i will run always exceptions come or not");
        }


        // you can use directly try and finally block without catch block
        //error will come but finally block always run

        try {
            System.out.println(a[8]);
        } 
        finally{
            System.out.println("i will run always exceptions come or not");
        }
        System.out.println("Byee Byee");
    }
}

// we can also use finally block after try and catch block.
//finally block always executed whether there is an exception inside the try block or not
//Note - You can use catch multiple time but finally blockonly once.
