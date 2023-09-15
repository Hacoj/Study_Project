package lesson.warpper_.warpper;

public class WapperExercise01 {
    public static void main(String[] args) {
        //由于三元运算符是一个整体，所以java会自动将数据转化为精度最高的类型
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);//1.0

        Object obj2 = true ? new Integer(1) : new Double(2);
        System.out.println(obj2);//1.0

        Object obj3;
        if(true)
        {
            obj3 = new Integer(1);
        }
        else {
            obj3 = new Double(2);
        }
        System.out.println(obj3);
    }
}
