package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Demo1 {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1, 5).forEach(Demo1::show);
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        list.add("aaa");
    }

    public static void show(Integer num) {
        System.out.println("helloworld!!!");
    }

    public static void show1() {
        System.out.println("helloworld!!!");
    }

    public abstract class ttt{
        public abstract void show2();
    }

    public class ts extends ttt{
        @Override
        public void show2() {
            System.out.println("hello!!!");
        }
    }
}
