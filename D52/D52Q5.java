package D52;
//数値を 5 区切り 1目盛りとして棒グラフで表示する
public class D52Q5 {
    public static void main(String[] args) {
        /*
        数値を 5 区切り 1目盛りとして棒グラフで表示する
        13 = 5 + 5 + 3
        13 : ***
        */
        String majors = "+----";//目盛り
        int LIMIT = 400;        //整数の上限
        if (args.length == 0) return; //引数が無い場合は終了
        int max = 0, i = 0;
        int[] data = new int[args.length];//引数を格納するリスト

        for (String s : args) {
            data[i] = Integer.parseInt(s);//整数に変換
            if (data[i] <= 0 || data[i] >= LIMIT) return;//0以上400未満の整数しか受け付けない
            if (max < data[i]) {
                max = data[i];
            }
            i++;
        }

        //目盛り表示(可視性の為)
        int majormax = (max - 1) / 5 + 1;//目盛りの長さ
        System.out.print("       ");//半角スペース7個分
        for (i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % 5)); // +----+----+ の模様づくり
        }
        System.out.println();

        //グラフ表示
        for (i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = (data[i] - 1) / 5 + 1;
            for (int j = 0; j < n; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
