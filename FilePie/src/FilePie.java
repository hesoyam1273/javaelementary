import java.lang.*;
import java.nio.file.*;
import java.io.*;


public class FilePie {

    private void fileSplit(String fileName, String partFileName, String partNum) throws Exception
    {
        Path filePath = Paths.get(fileName);
        try (BufferedInputStream input =
                     new BufferedInputStream(Files.newInputStream(filePath))) {
            long size = Files.size(filePath);

            int iPartNum = Integer.parseInt(partNum);
            long partSize = size / iPartNum;
            byte[] buffer = new byte[(int)partSize];
            for (int i = 0; i < iPartNum; i++) {

                try (OutputStream outputStream = Files.newOutputStream(Paths.get(partFileName+i));
                     BufferedOutputStream output = new BufferedOutputStream(outputStream)) {
                    int currentSize = 0;
                    while (currentSize < partSize) {
                        int byteCount = input.read(buffer);
                        output.write(buffer, 0, byteCount);
                        currentSize += byteCount;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String fileNameIn = args[0];
        String partFileNameOut = args[1];
        String partNum = args[2];
        //System.out.printf("%s%s    ok!", fileName, partFileName);
        FilePie sp = new FilePie();

        sp.fileSplit(fileNameIn,partFileNameOut, partNum);

    }



}
