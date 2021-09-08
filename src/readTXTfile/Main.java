package readTXTfile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        System.out.println("enter file name");
        String path = in.nextLine();
        File file = new File(path + ".txt");
        if (!file.exists()) {

            file.createNewFile();

            System.out.println("file was created");
        } else {
            System.out.println("file exists");
        }
        FileWriter fileWriter = new FileWriter(file, true);
        System.out.println("border 1:");
        int b1 = in.nextInt();
        System.out.println("border 2:");
        int b2 = in.nextInt();
        System.out.println("how many number do u want to write");
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            int tmp = new Random().nextInt(b2-b1+1) + b1;
            System.out.println(tmp);
            fileWriter.write(tmp+"\n");
        }
        fileWriter.flush();
        fileWriter.close();
        in.close();
        System.out.println("**********************************");
        //зчитати з файлу
        FileReader fr=new FileReader(file);
        Scanner scan=new Scanner(fr);
        int i=0;
        while (scan.hasNextLine()){
            System.out.println(i+" : "+scan.nextLine());
            i++;
        }
        fr.close();

    }
}
