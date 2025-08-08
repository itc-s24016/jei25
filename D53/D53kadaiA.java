package D53;
/*　
　　引数で与えられた整数の合計値を出力するプログラム
　　引数がない場合は「引数を入力してください」と出力する
　　引数の個数は不定
*/
public class D53kadaiA {
    public static void main(String[] args) {
        int sum = 0;

        // 引数がない場合の処理
        if (args.length == 0) {
            System.out.println("引数を入力してください");
            return;
        }

        for (String i : args) {
            sum += Integer.parseInt(i);
        }

        System.out.println("合計: " + sum);
    }
}
