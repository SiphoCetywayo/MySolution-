import java.util.Scanner;
public class StringReverse {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any string value to be reversed");
        String Word = input.nextLine();

        StringRev(Word);
    }

    private static void StringRev(String word) {

         char[]  StringToChararray = word.toCharArray();
         int i = 0;
         for(i = StringToChararray.length-1; i>=0; i--) {

            System.out.print(StringToChararray[i]);
         }
    }
}
