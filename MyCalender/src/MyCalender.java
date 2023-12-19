import java.util.Scanner;

public class MyCalender {

    public String book;
    public int start,end;


    MyCalender(String book, int start, int end){

        this.book = book;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString(){
        return "Ürün adı : " + book + " " + start + " " + end;
    }






}
