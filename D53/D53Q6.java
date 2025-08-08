package D53;
/*
引数で指定された値を、16進数から4ビットの「o」と「.」表記（例: o.o.）に変換、
逆に「o」と「.」表記から16進数に変換して表示する
例） java D53Q6 b 5 A F 0
.o.o
o.o.
oooo
....

例） java D53Q6　g .o.o o.o. oooo ....
5 A F 0
*/
public class D53Q6 {
    private static String hex = "0123456789ABCDEF";
    public static void main(String[] args) {
        if (args.length != 5) { //引数の数は 種類 値 値 値 値 で構成されるべき
            return;
        }
        if (args[0].equals("b")) { //ビット(g)=16進数が入力された
            for (int i = 1; i <= 4; i++){
                int num = hex.indexOf(args[i]); //16進数 -> 10進数
                System.out.println(intToStr(num));
            }
        } else if (args[0].equals("g")) { //画像(g)=2進数(?)が入力された
            for (int i = 1; i <= 4; i++) {
                System.out.println(strToInt(args[i]));
            }
        }
    }
    /**16進数の値を4ビットの「o」と「.」表記に変換する*/
    public static String intToStr(int x) {
        String s = "";
        //計算過程
        // 16進数の1桁は4ビットで表現されるので、4ビット分のループ
        // 例: E == 14
        // 14 / 2 = 7 あまり 0 -> s = "." + "";
        //  7 / 2 = 3 あまり 1 -> s = "o" + "."; POINT("o" + s にすると先頭から追加できる)
        //  3 / 2 = 1 あまり 1 -> s = "o" + "o.";
        //  1 / 2 = 0 あまり 1 -> s = "o" + "oo.";
        // 4回終了後：s = ooo.

        for (int i = 0; i < 4; i++) {//4ビット分のループ
            if (x % 2 == 0) {//偶数なら「.」
                s = "." + s;
            } else {         //奇数なら「o」
                s = "o" + s; //"o"と入れることで、先頭に追加される
            }
            x /= 2; // 2で割って次のビットへ
        }
        return s;
    }

    /**4ビットの「o」と「.」表記を16進数に変換する*/
    public static String strToInt(String s) {
        int x = 1, sum = 0;
        for (int i = 3; i >= 0; i--){
            if (s.charAt(i) == 'o'){
                sum += x;
            }
            x *= 2;
        }
        return hex.substring(sum, sum + 1);
    }
}