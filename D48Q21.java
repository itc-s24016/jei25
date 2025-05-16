public class D48Q21 {
    public static void main(String[] args) {
        int x, y = 25;
        x = y /= 4 + 3;
        System.out.printf("x:%d y:%d", x, y);
    }
    /*
    【 順序 】
    4 + 3  -> 7
    y /= 7 ->(int)y = 3
    x = 3  ->x = 3
     */
}
