package bianchen.day3;

import java.util.Scanner;

public class lianxi07 {
    public static void main(String[] args) {
       f1();
        System.out.println("-------------方法二---------------");
       f2();
    }



    private static void f1() {
        /**
         * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
         * 第一种方法；
         */
        int digital=0;//统计数字
        int character=0;//统计英文字母
        int other = 0;//空格个数
        int blank = 0;//其他字符个数
        char[] ch = null;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ch = s.toCharArray();
        for(int i=0; i<ch.length; i++) {
            if (ch[i]>='0'&&ch[i]<='9'){
                digital++;
            }else if (ch[i]>='a'&&ch[i]<='z'){
                character++;
            }else if (ch[i]==' '){
                blank++;
            }else {
                other++;
            }
        }
        System.out.println("数字个数: " + digital);
        System.out.println("英文字母个数: " + character);
        System.out.println("空格个数: " + blank);
        System.out.println("其他字符个数:" + other );
    }

    private static void f2() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input=sc.nextLine();
        char[] Arr=input.toCharArray();
        int letter=0;
        int witpace=0;
        int digit=0;
        int qite=0;
        for (int i = 0; i <Arr.length ; i++) {
            if (Character.isLetter(Arr[i])){
                letter++;
            }else if (Character.isWhitespace(Arr[i])){
                witpace++;
            }else if (Character.isDigit(Arr[i])){
                digit++;
            }else {
                qite++;
            }
        }
        System.out.println("英文字母："+letter+"个！"+"\n");
        System.out.println("英文字母："+witpace+"个！");
        System.out.println("英文字母："+digit+"个！");
        System.out.println("英文字母："+qite+"个！");
    }
}
