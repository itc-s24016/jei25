package D53;
//== と equals の違い
public class D53Q25kadai {
    /*
        「true true」が表示されるコードを作成してください
     */
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C'};
        String s1 = new String("ABC");
        String s2 = new String(ch);

        //格納されているアドレスが異なるので == で正しく比較ができない
        boolean b1 = s1 == s2; //false

        boolean b2 = s1.equals(s2); //true
        boolean b3 = b2;

        System.out.println(b2 + " " + b3);
    }
}
