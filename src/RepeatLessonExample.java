/**
 * Created by andriusbaltrunas on 3/12/2018.
 */
public class RepeatLessonExample {

    public static void main(String[] args){
        RepeatLessonExample repeatLessonExample = new RepeatLessonExample();//obejktas
        repeatLessonExample.test1();
        int a = 6;
        repeatLessonExample.test2(a);
        repeatLessonExample.test3(4, 5);
        repeatLessonExample.test4("aaa", 5);
        repeatLessonExample.test5(4, "aaa", true);
        test6(7);
        test7("aaa");
    }

    private void test1(){}

    private void test2(int a){}

    private void test3(int a, int b){}

    private void test4(String a, int b){}

    private void test5(int a,String b, boolean c){}

    public static String test6(int b){
        return "";
    }
    public static  boolean test7(String c){
        return true;
    }
}
