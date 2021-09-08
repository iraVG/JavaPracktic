package lessonFile;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("mytext1.txt");
        // System.out.println(file.exists());
        if (!file.exists()) {
            file.createNewFile();
        }
        //System.out.println(file.exists());
        //System.out.println(file.isFile());
        //System.out.println(file.getName());
//        System.out.println(file.length());
//        System.out.println(file.getCanonicalPath());

//        File myFolder = new File("myFolder");
//        System.out.println(myFolder.exists());
//        if(!myFolder.exists()){
//            myFolder.mkdir();
//        }
//        System.out.println(myFolder.exists());
//        System.out.println(myFolder.isDirectory());
//        System.out.println(myFolder.isFile());
//        myFolder.delete();

//        Properties properties = System.getProperties();
//        for (Object o : properties.keySet()
//        ) {
//            System.out.println(o);
//
//        }
//        System.out.println(System.getProperty("user.home"));
//        String atom=System.getProperty("user.home");
//        File userFolder=new File(atom);
//        System.out.println(userFolder.length());
//        String[] list = userFolder.list();
//        for (String fileOrFolder:list
//             ) {
//            System.out.println(fileOrFolder);
//
//        }

//        File[] files = userFolder.listFiles();
//        for (File fileOrFolder:files) {
//            String type=null;
//            if(fileOrFolder.isFile()){
//                type="file";
//                if(fileOrFolder.getName().equals("text.txt")){
//                    System.out.println("I find file!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//                    fileOrFolder.delete();
//                }
//            }else{
//                type="folder";
//            }
//            System.out.println(fileOrFolder.getName()+"  "+type);
//        }
//====================bytes stream
//        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
//        String sms=" Lecture stream";
//        byte[] smsBytes=sms.getBytes();
//        fileOutputStream.write(smsBytes);
//        fileOutputStream.flush();
//        //mozhlyvi inshi dii
//        fileOutputStream.close();


//        FileInputStream fileInputStream = new FileInputStream(file);
//        byte[] answer=new byte[fileInputStream.available()];
//        fileInputStream.read(answer);
//        fileInputStream.close();
//        String output =new String(answer);
//        System.out.println(output);
//        for (byte i:answer
//             ) {
//            System.out.println(i);
//        }

//===========symbol stream
//        FileWriter fileWriter = new FileWriter(file,true);
//        fileWriter.write("hello world!!!!!!!");
//        fileWriter.flush();
//        fileWriter.close();

//        FileReader fileReader = new FileReader(file);
//       // System.out.println((char) fileReader.read());
//
//        int collector;
//       while((collector=fileReader.read())!=-1){
//           System.out.print((char) collector);
//       }
//
//        fileReader.close();

        //=============byferyzovani potoky
//        PrintWriter printWriter = new PrintWriter(file);
//        printWriter.println("our printWriter test"); //write e takozh
//        printWriter.println("hello");
//      //  printWriter.append(" ha-ha");
//        Lesson lesson = new Lesson("file read/write");
//        printWriter.println(lesson);
//        printWriter.flush();
//        printWriter.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//   //     System.out.println(bufferedReader.readLine());
//        String line="";
//        while((line=bufferedReader.readLine())!=null){
//            System.out.println(line);
//        }

        //================zapus obektiv
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        objectOutputStream.writeObject(new Lesson(1,"file read/write"));
//        objectOutputStream.flush();
//        objectOutputStream.close();

//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        Lesson lesson = (Lesson) objectInputStream.readObject();
//        System.out.println(lesson);
//        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
//        String sms=" mama";
//        byte [] smsBytes=sms.getBytes();
//        fileOutputStream.write(smsBytes);
//        fileOutputStream.flush();
//        fileOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream(file);
//        byte[] answer=new byte[fileInputStream.available()];
//        fileInputStream.read(answer);
//        fileInputStream.close();
//        String output=new String(answer);
//        System.out.println(output);
//        for (byte i:answer
//             ) {
//            System.out.println(i);
//
//        }

//        FileWriter fileWriter = new FileWriter(file, true);
//        fileWriter.write(" hello all");
//        fileWriter.flush();
//        fileWriter.close();

//        FileReader fileReader = new FileReader(file);
//       // System.out.println((char)fileReader.read());
//        int collector;
//        while((collector=fileReader.read())!=-1){
//            System.out.println(collector);
//        }
//
//        fileReader.close();

//        PrintWriter printWriter = new PrintWriter(file);
//        printWriter.println("our test");
//        printWriter.println(" PrintWriter");
//        printWriter.append(" ha-ha");
//        Lecture lecture = new Lecture(1, "read/write");
//        printWriter.println(lecture);
//        printWriter.flush();
//        printWriter.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        System.out.println(bufferedReader.readLine());
//
//
//        String line="";
//        while ((line=bufferedReader.readLine())!=null){
//            System.out.println(line);
//        }

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(new Lecture(2,"kokos"));
        objectOutputStream.flush();
        objectOutputStream.close();

//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        Lecture lecture = (Lecture) objectInputStream.readObject();
//        System.out.println(lecture);


    }
}

