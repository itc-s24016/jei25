package D48;

public class D48Q21 {
    //四則演算の優先順位
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
