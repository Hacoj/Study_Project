package self_study.kmp;

import org.junit.jupiter.api.Test;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */
public class KMP {

    public static void main(String[] args) {

    }



    //判断已经匹配成功前后缀相同部分的长度
    public static int getFixLength(String str){
        int length_ = 0;
        for(int i = 1;i < str.length(); i++){
            if(str.substring(str.length() - i).equals(str.substring(0, i))){
                length_ = i;
            }
        }
        return length_;
    }
}
