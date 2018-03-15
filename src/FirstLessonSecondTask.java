import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/12/2018.
 */
public class FirstLessonSecondTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu norite ivesti?");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Iveskite " + i + " elementa");
            int numb = sc.nextInt();
            if (numb >= 100) {
                System.out.println(numb);
            }
        }
    }
}
