package md.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {

    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/md/filemanagementservice/test.txt");
        System.out.println(FileManager.createTheFileIfItDoesNotExist(fileObject));
        FileManager.informIfTheFileExist(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.printTheAbsolutPath(fileObject);
        FileManager.printIfItIsDirectoryOrAFile(fileObject);


        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(), "Content");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject, "Value Free");

        InputFileReaderManager.printDataOnTheConsoleUsingFileReader(fileObject);
        System.out.println();
        InputFileReaderManager.printDataUsingTheEasierWay(fileObject);

    }
}
