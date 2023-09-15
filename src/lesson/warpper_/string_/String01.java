package lesson.warpper_.string_;

//String继承了Serializable接口，可以网络传输
//称实现串行化
//使用Unicode编码，每个字符两个字节
public class String01 {
    public static void main(String[] args) {
        String s = "a";
        s.intern();
    }
}
