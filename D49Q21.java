public class D49Q21 {
    //ｘ進数の計算
    public static void main(String[] args) {
        //int n1 = 080;  // 8進数?
        int n2 = 0x10; //16進数 ※10進数:16

        //System.out.println(n1 + n2);
        /*
        java: ';'がありません
        本当の原因は、
        0 で始まる数値において 0x 以外で始まると
        ８進数としてみなされるが、８進数の数値は
        0-7までしか無いのに 8 が含まれていることが
        原因。
         */

        //出力結果が 80 になるように修正してください
        int m1 = 0100;
        int m2 = 0x10;
        //64 + 16 = 80
        System.out.println(m1 + m2);

    }
}
