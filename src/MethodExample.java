import java.util.Arrays;

/**
 * Created by andriusbaltrunas on 3/12/2018.
 */
public class MethodExample {

    public static void main(String[] args){
        MethodExample methodExample = new MethodExample();

        System.out.println(methodExample.sayHelloToUser("andrius"));

        String t = methodExample.sayHelloToUser("Jonas");
        System.out.println(t);

        sum(13, 56);

        String a;
        {
             a = "Aaaa";
        }

        System.out.println(a);
    }

    private static void addNumbToString(String word){
        StringBuilder sb = new StringBuilder();
        sb.append(word).append(" ").append(50);
        System.out.println(sb.toString());
    }

    private String sayHelloToUser(String name){
        String result = "Labas " + name;
        sum(34, 56);
        return result;
    }

    public static void sum(int numb, int numb2){
        int result = numb + numb2;
        System.out.println(result);
    }
}
