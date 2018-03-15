/**
 * Created by andriusbaltrunas on 3/12/2018.
 */
public class MasExample {

    public static void main(String[] args){

        String[] mas = new String[5];

        mas[0] = "Andrius";

        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }

        String[] mas2 = {"Andrius", "Jonas", "Antanas", "Jokubas"};

        for(String m : mas2){
            System.out.println(m);
        }
    }
}
