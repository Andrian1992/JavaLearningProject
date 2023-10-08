package md.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean createTheFileIfItDoesNotExist(File file) throws IOException {
        return file.createNewFile();
    }

   public static void informIfTheFileExist(File file){
        if(file.exists()){
            System.out.println("The file is present");
        }else {
            System.out.println("The file is not present");
        }
   }

   public static void printTheFileName(File fileThatIsConsidered){
       System.out.println(fileThatIsConsidered.getName());
   }
    public static void printTheAbsolutPath(File fileThatIsConsidered){
        System.out.println(fileThatIsConsidered.getAbsolutePath());
    }

    public static void printIfItIsDirectoryOrAFile(File file){
        if (file.isDirectory()){
            System.out.println("It is a Directory");
        }else {
            System.out.println("It is a file");
        }
    }

}
