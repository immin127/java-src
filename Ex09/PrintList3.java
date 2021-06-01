package Ex09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintList3 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(args[0]);
            FileWriter fw = new FileWriter(args[0] + ".list");
            Scanner sin = new Scanner(fr);){
            PrintWriter out = new PrintWriter(fw);
            int i = 1;
            while(sin.hasNext()){
                String s= sin.nextLine();
                out.println(i + ": " + s);
                i++;
            }
            
        } catch (Exception e) {
            System.out.println("오류 발생");
            System.exit(0);
        }
    }
}
