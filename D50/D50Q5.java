package D50;

public class D50Q5 {
    //入力値を配列として受け取る
    public static void main(String[] args) {
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        for (int i = 1; i < num.length; i++){
            for (int j = i -1; j >= 0 && num[j] > num[j + 1]; j--){
                int tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
            }
        }

        for (int val : num) System.out.println(val + " ");
    }
}
