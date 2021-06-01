package Ex09.Test;

import java.io.*;

public class Ex04 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader(args[0]);
                BufferedReader buff = new BufferedReader(file);
            FileWriter writer = new FileWriter(args[1]);
                String text;
                while((text = buff.readLine()) != null) {
                    System.out.println(text);
                    writer.write(text);
                    writer.write("\r\n");
                }
            file.close();
            writer.close();
        } catch (FileNotFoundException fnoe) {
            fnoe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
