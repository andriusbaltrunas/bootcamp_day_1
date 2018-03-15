/**
 * Created by andriusbaltrunas on 3/12/2018.
 */
public class TypeClassExample {

    public static void main(String[] args){

        Integer integer = 123;

        Integer integer1 = Integer.parseInt("12343");
        Integer integer2 = Integer.valueOf("2222");

        Boolean booleanClass = Boolean.parseBoolean("True");
        Boolean booleanClass1 = Boolean.getBoolean("true");

        Double doubleClass = Double.sum(123.44, 76.56);

        System.out.println(Double.MAX_VALUE);
        System.out.println(doubleClass);

        System.out.println(booleanClass);
        System.out.println(booleanClass1);

        System.out.println(integer1);
        System.out.println(integer2);

    }
}
