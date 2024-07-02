import java.io.File;

public class file_Hand {
    public static void main(String[] args) {
        File a = new File("demo.txt");
        try{
            if( a.createNewFile()){
        System.out.println("File created successfully");
    }else{
        System.out.println("File already exists");
    }
    }catch(Exception e){
        System.out.println("File not found " + e);
    }
    }
}
