public class D49Q18kadai {
    //キャストのタイミングについて
    public static void main(String[] args) {
        int total = 75;
        int capacity = 30;
        int cargo = 2;

        //(double)(式)
        System.out.println((double)(total / capacity * cargo));
        //(double)式
        System.out.println((double)total / capacity * cargo);

        //結果が 40.0 になるようにアレンジ
        System.out.println((double)total / capacity * cargo * 8);

    }
}
