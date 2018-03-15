import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/12/2018.
 */
public class UserInsertNumberExample {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu:");

        int numb = sc.nextInt();

        if(numb %2 == 0){
            System.out.println("Lyginis");
        }else{
            System.out.println("nelyginis");
        }
    }
}
