package anli;


import java.util.Date;

public class data1 {
    public static void main(String[] args) {

        System.out.println(1);

        long time = new Date().getTime();
        for (int i = 1; i < 1000000; i++) {
            System.out.println(i);
        }
        long end = new Date().getTime();
        System.out.println((time-end)/1000.0);


    }
}
