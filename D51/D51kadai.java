package D51;

import static java.lang.Math.*;
public class D51kadai {
    /*
    与えられた引数の2番目を実数に変換、切り上げて表示する
    Math.cell()                  = 切り上げ
    Double.parseDouble(String s) = 文字列をdouble型に変換
    */
    public static void main(String[] args) {
        double n = Double.parseDouble(args[1]);
        System.out.println(ceil(n));
    }
}
