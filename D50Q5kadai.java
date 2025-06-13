public class D50Q5kadai {
    //配列のソート過程を表示
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
                display(num);
            }
        }System.out.println("--------------------");
        display(num);
    }

    static void display(int[] num){
        System.out.print("ソート途中:");
        for (int val : num){
            System.out.print(val + " ");
        }System.out.println();
    }
}
