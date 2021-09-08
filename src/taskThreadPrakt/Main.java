package taskThreadPrakt;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("taskThread2.txt");
        if (!file.exists()) {

            file.createNewFile();
            System.out.println("file was created");
        }

        //FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.write("How to write JSON object to File in Java\n");
        printWriter.write("In this tutorial,\nI’ll show you how to write JSON data to a file\n ");
        printWriter.flush();
        printWriter.close();
        LineStorage lineStorage=new LineStorage();
        ContentReader contentReader = new ContentReader(lineStorage);
        ContentPrinter contentPrinter=new ContentPrinter(lineStorage);


    }

    public static class LineStorage {
        String lineText;

        public synchronized String getLineText() {
            return lineText;
        }

        public synchronized void setLineText(String lineText) {
            this.lineText = lineText;
        }

        @Override
        public String toString() {
            return "LineStorage{" +
                    "lineText='" + lineText + '\'' +
                    '}';
        }
    }

    public static class ContentReader implements Runnable {
        LineStorage ls;
private String fileName;

        public ContentReader(LineStorage ls) {
            this.ls = ls;
        }

        public ContentReader(LineStorage ls, String fileName) {
            this.ls = ls;
            this.fileName = fileName;
            new Thread(this, "Reader").start();
        }

        @Override
        public void run() {
            FileReader reader = null;
            try {
                reader = new FileReader("taskThread2.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            String line = null;
            BufferedReader bufferedReader = new BufferedReader(reader);
            // ls.setLineText(bufferedReader.readLine());
            while (true) {
                try {
                    if (!((line = bufferedReader.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(line);
                ls.setLineText(line);


            }
            ls.setLineText(null);


        }
    }

    public static class ContentPrinter implements Runnable {
        LineStorage ls;

        public ContentPrinter(LineStorage ls) {
            this.ls = ls;
          new Thread(this, "Printer").start();
        }

        @Override
        public void run() {
            while (!(ls.getLineText().equals("file"))){
               // ls.getLineText();
                System.out.println(Thread.currentThread().getName() + " " + ls.getLineText());
            }

        }
    }

}
