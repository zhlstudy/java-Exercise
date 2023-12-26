package bianchen.day1;

public class lianxi01 {
    public static void main(String[] args) {
        /**
         * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
         * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
         * 问每个月的兔子总数为多少？
         * //这是一个菲波拉契数列问题
         */
        System.out.println("第一个月的兔子对数： 1");
        System.out.println("第二个月的兔子对数： 1");
        int f1=1,f2=1,f,M=24;
        for (int i = 3; i <=M ; i++) {
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println("第"+i+"个月的兔子对数："+f2);
        }

//        前面哪个数加后面哪个数等于 最后面哪个数------>这就是斐波拉契数列
//          0，1，1，2，3，5，8，13，21，34
    }
}
