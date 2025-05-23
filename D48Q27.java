public class D48Q27 {
    //while内での計算時の注意
    public static void main(String[] args) {
        int i = 0;
        while (i <= 6){
            //このままだと無限ループになる
            //System.out.println(i);
            System.out.println(i++);
        }
    }
}
