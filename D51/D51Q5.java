package D51;
//ガス料金の計算
public class D51Q5 {
    //使用したガスの量に応じてガス料金を計算する
    public static void main(String[] args) {
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE}; //使用量
        double[] unit = {0.0, 2.0, 3.0, 5.0};                 //単位数
        int[] rate = {0, 19, 17, 14};                        //従量料金単価
        /*
        ガス使用量が60.0の場合の料金

        基本料金:1200円

        第1段階 (0.0〜23.99):
        料金単価：1単位あたり19円
        MAXまで使用しているので、24.0 × 19円 / 単位 = 456円

        第2段階 (24.0〜56.99):
        料金単価：1単位あたり17円
        使用量：57.0 − 24.0 = 33.0単位
        したがって、33.0 × 17円 / 単位 = 561円

        第3段階 (57.0以上):
        料金単価：1単位あたり14円
        使用量：今回の使用量 − 57.0 = 3.0単位
        したがって、3.0 × 14円 / 単位 = 42円

        ガス料金
        2259円 = 1200円 + 456円 + 561円 + 42円
        */

        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }
        double amount = Double.parseDouble(args[0]);
        if (amount < 0.0) {
            System.out.println("0.0以上の使用量を入力");
            return;
        }

        int i, price = 1200;
        for (i = 1; amount >= level[i]; i++) {
            price += (int) ((level[i] - level[i - 1]) / unit[i] * rate[i]);
        }
        price += (int) Math.ceil((amount - level[i - 1]) / unit[i]) * rate[i];
        System.out.println("今月のガス料金" + price + "円");
    }
}
