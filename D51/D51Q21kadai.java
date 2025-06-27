package D51;
//異なる基数同士を計算するオリジナルプログラム
public class D51Q21kadai {
    /*
    異なる基数同士を計算するオリジナルプログラムを作成する
    コメントで説明文を書くこと
    */
    public static void main(String[] args) {
        // コマンドライン引数が2つであることを確認
        if (args.length != 2) {
            System.out.println("使い方: java D51Q21kadai <数値1> <数値2>");
            return;
        }

        // 各文字列の基数を自動判別し、10進数に変換
        int num1 = parseAutoBase(args[0]);
        int num2 = parseAutoBase(args[1]);

        // 10進数で加算を実行し、結果を表示
        int sum = num1 + num2;
        System.out.println("計算結果 (10進数): " + sum);
    }

    /**
     * 文字列のプレフィックスから基数（2, 8, 10, 16）を自動判断し、10進数に変換します。
     * プレフィックス: "0b" (2進), "0x" (16進), "0" (8進、ただし"0"単独は10進)。
     * それ以外は10進数と見なします。
     */
    private static int parseAutoBase(String s) {
        if (s.startsWith("0x")) {
            return Integer.parseInt(s.substring(2), 16); // 16進数 (0xをスキップ)
        } else if (s.startsWith("0b")) {
            return Integer.parseInt(s.substring(2), 2); // 2進数 (0bをスキップ)
        } else if (s.startsWith("0") && s.length() > 1) {
            return Integer.parseInt(s, 8); // 8進数 (0始まりで2文字以上)
        } else {
            return Integer.parseInt(s, 10); // 10進数 (デフォルト)
        }
    }
}
