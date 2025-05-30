public class D50Q20kadai {
    //三項演算子
    public static void main(String[] args) {
        //三項演算子：条件分岐を1行でシンプルに書く方法
        //条件 ? 真の場合の値 : 偽の場合の値;

        int num = 1234;

        num = 1000; //Narrow になるように追記した行

        String scale = num > 1000 ? "wide" : "Narrow";

        System.out.println(scale);
    }
}
