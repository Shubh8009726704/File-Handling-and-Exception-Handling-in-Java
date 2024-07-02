import java.io.FileWriter;

public class file_write{
    public static void main(String[] args){
      try{
      FileWriter a = new FileWriter("demo.txt");
      a.write("Hello My name is Shubham");
      a.close();
      System.out.println("file written successfully");
   }catch(Exception e){
      System.out.println("file can not be written");
   }
    }
}
