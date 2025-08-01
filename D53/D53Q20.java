package D53;

public class D53Q20 {
    public static void main(String[] args) {
        int i = 8;
        float f = 3.27f;

//        int n = i + f;
        //これではエラーになってしまう
        /*
        　Javaの演算結果は表現可能な範囲が広い方に型を合わせるようになっている
        int  : 整数のみ表現可能
        float: 小数点、整数(1.0等)が表現可能
        　この場合、floatのほうが表現可能な幅が広いので
        floatに合わせなければならない
        */
        float n = i + f;
        System.out.println(n);
    }
}
