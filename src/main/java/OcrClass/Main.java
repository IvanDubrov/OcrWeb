package OcrClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String a[]) {
        String filePatch = "D:\\java IDE\\SqilSoftWeb\\src\\main\\resources\\";
        ArrayList<ArrayNameAndTextFile> arrayNameAndTextFile = new ArrayList<ArrayNameAndTextFile>();
        File f = new File(filePatch + "img");
        String ListNameFile[] = f.list();

        //GET IMG-TEXT from CLASS OcrClass.OCR
        OCR ocr = new OCR();
        String listTextIMG[] = ocr.scanIMG(ListNameFile);

        //ADD COLLECTION NAME FILE AND IMG-TEXT && CREATE TXT FILE
        for (int i = 0; i < ListNameFile.length; i++) {

            //ADD COLLECTION NAME FILE AND IMG TEXT
            arrayNameAndTextFile.add(new ArrayNameAndTextFile(ListNameFile[i], listTextIMG[i]));


            String nameFileTXT = ListNameFile[i];
            nameFileTXT = nameFileTXT.replace(".jpg", ".txt");

            //CREATE TXT FILE AND WRITE IMG TEXT
            File f2 = new File(filePatch + "resultScanText\\" + nameFileTXT);
            FileOutputStream output;
            try {
                output = new FileOutputStream(f2);
                output.write(listTextIMG[i].getBytes());
                output.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
//OUTPUT IMG TEXT WITH
        for (ArrayNameAndTextFile anArrayNameAndTextFile : arrayNameAndTextFile) {
            System.out.println(anArrayNameAndTextFile.getText());
        }
    }

}
