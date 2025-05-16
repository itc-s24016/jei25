public class D48Q23 {
    public static void main(String[] args) {
        int i = 1;
        /*
        （基本）for (i = 3; i > 0; i--)
        初期値　　　　：3
        ループの継続　：0になるまで
        ループ後の処理：iを-1

        （今回）for で while(true) を再現
        初期値　　　　：無し
        ループの継続　：常に継続する
        ループ後の処理：無し
         */
        for (;;){
            i += 3;
            if (i < 10){
                System.out.println(i);
                continue;
            }else{
                break;
            }
            //到達不能なのでコンパイルエラーになる
            //System.out.println(i);
        }
    }
}
