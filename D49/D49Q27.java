package D49;

public class D49Q27 {
    //拡張for の変数宣言の注意点
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int sum = 0;
        for (int num : numbers){ //int num じゃないとここでエラー
            sum += num;
        }
        System.out.println(sum);
    }
}
