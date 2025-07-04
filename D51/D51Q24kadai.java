package D51;
//公倍数を求めるプログラム
public class D51Q24kadai {
    //100未満の3と5の公倍数を出力するコードを作成する
    public static void main(String[] args) {
        for (int x = 1; x < 100; x++){
            if (x % 3 == 0 || x % 5 == 0){
                System.out.println(x + ",");
            }
        }
    }
}
