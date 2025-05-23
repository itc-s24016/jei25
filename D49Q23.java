public class D49Q23 {
    //ファイル実行時に引数を渡して表示させる
    public static void main(String[] args) {
        double n = Double.parseDouble(args[2]) * 1.5;
        System.out.println("n:"+n);

        /*
        15.0 と表示させてください
        答え     ：java D49Q23 2 8 10 を実行
        引数の意味：args[2, 8, 10] -> args[2] = 10
        計算内容  ：10 * 1.5 = 15.0
         */

        //実行結果を 30.0 になるように修正してください
        double m = Double.parseDouble(args[0]) * 1.5;
        System.out.println("m:"+m);
        /*
        回答     ：一度で表示させたかったため、
         　　　　　 java D49Q23 20 0 10 を実行
         */
    }
}
