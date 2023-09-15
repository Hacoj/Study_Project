package lesson.warpper_.string_;

public class StringExercise {
    String str = new String("sjs"); //此时的str指向的是一个堆区的对象
    final char[] ch = {'j','a','v','a'};//在堆区的数组

    public void change1(){
        str = "java";//在这条语句执行后，str从堆区的对象指向常量池的java
        ch[0] = 'h';
    }
    public void change2(String str, char[] ch){
        str = "java";//在这条语句执行后，str从堆区的对象指向常量池的java,但是change2中的str并不是原本的值，它是一个副本
        ch[0] = 'h';
    }



    public static void main(String[] args) {

        StringExercise stringExercise = new StringExercise();
        //stringExercise.change1();
        stringExercise.change2(stringExercise.str, stringExercise.ch);
        System.out.println(stringExercise.str + " and ");
        System.out.println(stringExercise.ch);
//        String s1 = "sjs";
//        String s2 = "java";
//        String s3 = "sjsjava";
//        String s4 = (s1 +s2).intern();
//        System.out.println(s3 == s4);
//        System.out.println(s3.equals(s4));
    }

}
