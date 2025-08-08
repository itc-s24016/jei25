package D53;
//引数から各商品の情報と価格を表示するプログラム
//税抜き価格と税込み価格の合計を求めるようにしてください
public class D53Q5kadai {
    private static int[] taxes = {8, 10};
    private static int FOODS = 0;
    private static int OTHER = 1;
    public static void main(String[] args) {
        int dataSize = Integer.parseInt(args[0]); //データ数
        String[] names = new String[dataSize]; //商品名
        int[] prices = new int[dataSize]; //単価
        int[] nums = new int[dataSize]; //数量
        char[] types = new char[dataSize]; //タイプ 食品 or その他

        int argsIdex = 1;
        for (int i = 0; i < dataSize; i++) {
            names[i] = args[argsIdex++];
            prices[i] = Integer.parseInt(args[argsIdex++]);
            nums[i] = Integer.parseInt(args[argsIdex++]);
            types[i] = args[argsIdex++].charAt(0);
        }

        System.out.println("商品名\t 税抜\t 税込\t タイプ");
        int sum = 0; //税抜価格の合計
        int sumTaxed = 0; //税込価格の合計

        for (int i = 0; i < dataSize; i++) {
            int zeinuki = prices[i] * nums[i]; //税抜価格
            sum += zeinuki;
            int zeikomi, taxType; //税込み価格, タイプによる税率の違い
            taxType = types[i] == 'f' ? FOODS : OTHER; //タイプの判定
            zeikomi = zeinuki * (taxes[taxType] + 100) / 100; //税込価格の計算
            sumTaxed += zeikomi; //税込価格の合計
            System.out.print(names[i] + "\t" + zeinuki + "円\t");
            System.out.println(zeikomi + "円\t" + viewType(types[i]));
        }
        System.out.println("合計\t" + sum + "円\t" + sumTaxed + "円\t");
    }
    private static String viewType(char c) {
        return c == 'f' ? "食品" : "その他";
    }
}
