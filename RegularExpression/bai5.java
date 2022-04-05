package RegularExpression;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bai5 {

    public File createFile(String path) throws IOException {

        File file = new File(path);

        if (file.createNewFile()) {

        } else {

        }

        return file;

    }

    public void readFile(String pathFileReader, String pathFileWriter, String s) {
        try {
            File file = new File(pathFileReader);
            FileReader fileReader = new FileReader(file);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();

            FileWriter fileWrite = new FileWriter(createFile(pathFileWriter));

            while (line != null) {
                if(line.contains(s)) {
                    fileWrite.write(line);
                }
                line = reader.readLine();
            }
            fileReader.close();
            fileWrite.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String pathReader = sc.next();
        String pathWriter = sc.next();
        System.out.println(pathWriter);
        String s = "VIS training";
        bai5 handingFile = new bai5();
        handingFile.readFile(pathReader, pathWriter, s);
    }

}