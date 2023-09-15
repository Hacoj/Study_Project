package lesson.collection_.Homework;

import java.util.ArrayList;
import java.util.Objects;

public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        New_ new_1 = new New_("新冠确诊病例超千万，数百万印度教信徒赴恒河\"生育\"引起民众担忧");
        New_ new_2 = new New_("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        arrayList.add(new_1);
        arrayList.add(new_2);

        for(Object obj : arrayList){
            New_ new_ = (New_) obj;
            String temp_title = "";
            if (new_.getTitle().length() > 15){
                temp_title = new_.getTitle().substring(0,15) + "...";//此处可做出新的 方法来进行对字符串的截取
            }
            System.out.println(temp_title);
        }

    }
}

class New_{
    private String title;
    private String body;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        New_ aNew = (New_) o;
        return Objects.equals(title, aNew.title) && Objects.equals(body, aNew.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, body);
    }

    @Override
    public String toString() {
        return "New_{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public New_(String title) {
        this.title = title;
    }
}