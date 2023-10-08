package md.filemanagementservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class InputFileReaderManager {
    public static void printDataOnTheConsoleUsingFileReader(File file){
        FileReader fileReaderObj = null;
        try {
            fileReaderObj = new FileReader(file);

            int charNumberInAsciiSystem;

            while ((charNumberInAsciiSystem = fileReaderObj.read()) != -1){
                System.out.print((char) charNumberInAsciiSystem); //doar "print" ca sa arate intr-un rind in consola.
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not fount, the procedure is aborted ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("There is a problem with read process");
        }finally {
            try {
                fileReaderObj.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void printDataUsingTheEasierWay(File file){
        try {
            String content = Files.readString(file.toPath());
            System.out.println(content);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
