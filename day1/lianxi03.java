package bianchen.day1;

public class lianxi03 {
    public static void main(String[] args) {
        /**
         * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
         * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
         */
        for (int i=100;i<1000;i++){
            int bai=i/100;
            int shi=(i%100)/10;
            int ge=i%10;
            if((bai*bai*bai + shi*shi*shi + ge*ge*ge) == i) {
                System.out.println(i+"是一个水仙花数");
            }
        }
    }
}
