import java.util.Scanner;
 public class RemoveCharacter {

    static void printwords(String str)

    {

        str = str.trim();

        String delims = "\\W+"; 

        String[] tokens = str.split(delims);
        for (String item : tokens) {
 

            System.out.println(item + " ");

        }

    }
 

    public static void main(String[] args)

    {
 

        String str = "Hello, how are you ?";

        printwords(str);

    }
}