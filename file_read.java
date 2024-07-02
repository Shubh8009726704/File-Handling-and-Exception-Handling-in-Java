import java.io.File;

public class file_read{
    public static void main(String[] args) {
        File a = new File("demo.txt");
     if(a.exists()){
        System.out.println("File name is " + a.getName());
        System.out.println("Path is " + a.getAbsolutePath());
        System.out.println("Parent is " + a.getParent());
        System.out.println("File size is " + a  filesize+ "bytes");
        System.out.println("File is readable " + a.canRead());
        System.out.println("File is writeable " + a.canWrite());
     }
     else{
        System.out.println("File not found");
     }
    }
}
