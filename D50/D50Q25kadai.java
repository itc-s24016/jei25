package D50;

public class D50Q25kadai {
    //偶数か奇数か
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++){
            if (i % 2 == 1)   //0 にすれば偶数を表示できる
                continue;
            System.out.println(i);
        }
    }
}
