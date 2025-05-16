public class D48Q24 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++){
            if (i % 3 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
