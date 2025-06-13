package D49;

public class D49Q24kadai {
    //配列の要素数とループ回数
    public static void main(String[] args) {
        int values[] = {10, 20, 30, 40};
        int sum = 0;

        // < or <=
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        //要素数     : 1, 2, 3, 4
        //インデックス: 0, 1, 2, 3

        System.out.printf("合計値:%d%n要素数:%d%n" ,sum, values.length);
        System.out.println(sum / values.length);
    }
}
