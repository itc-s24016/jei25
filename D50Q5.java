public class D50Q5 {
    //入力値を配列として受け取る
    public static void main(String[] args) {
        /*
        【 実行例 】コピペ可
        cd ~/IdeaProjects/jei25/out/production/jei25/
        java D50Q5 2 1 3

        >>> 1
        >>> 2
        >>> 3
        */
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        for (int i = 1; i < num.length; i++){
            for (int j = i -1; j >= 0 && num[j] > num[j + 1]; j--){
                tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
            }
        }

        for (int val : num){
            System.out.println(val + " ");
        }
    }
}
