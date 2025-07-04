package D51;

public class D51Q5kadai {
    //使用したガスの量に応じてガス料金を計算する
    public static void main(String[] args) {
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE}; //使用量
        double[] unit = {0.0, 2.0, 3.0, 5.0};                 //単位数
        int[] rate = {0, 19, 17, 14};                         //従量料金単価

        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }
        double amount = Double.parseDouble(args[0]);
        if (amount < 0.0) {
            System.out.println("0.0以上の使用量を入力");
            return;
        }

        //値上げしました ▶ 基本料金 + 100円：従量単価 + 1円
        for (int i = 0; i < rate.length; i++) {
            rate[i] += 1;
        }

        int i, price = 1200 + 100;
        for (i = 1; amount >= level[i]; i++) {
            price += (int) ((level[i] - level[i - 1]) / unit[i] * rate[i]);
        }
        price += (int) Math.ceil((amount - level[i - 1]) / unit[i]) * rate[i];
        System.out.println("今月のガス料金" + price + "円");
    }
}
