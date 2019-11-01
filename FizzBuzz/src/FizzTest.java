import java.util.Scanner;

public class FizzTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = scan.nextInt();
        FizzBuzz(num);
    }

    public static void FizzBuzz(int FizzNum) {

        for (int num = 1; num <= FizzNum; num++){
            if (num % 15 == 0) {
                System.out.println("FizzBuzz" + " ");

            } else if(num % 5 == 0){
                System.out.print("Buzz" + " ");
            }else if(num % 3 == 0){
                System.out.print("Fizz" + " ");
            }
                else{
                System.out.print(num + " ");
            }
        }
    }
}
