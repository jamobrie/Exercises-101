package files;

import java.io.*;

public class SizeOfFile {

    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");

        String str = "World";

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.append("Let's add to this file!!!\n");
        writer.append("Hello\n");
        writer.append(str);

        writer.close();

        System.out.println("The size of the file is: " + file.length() + " in kb");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println("The contents of the file are as follows:");

        //TODO print out all lines correctly!!!
        while (reader.readLine() != null) {
            System.out.println(reader.readLine());
        }
        reader.close();
    }


    //TODO
    //Other approaches here

}
