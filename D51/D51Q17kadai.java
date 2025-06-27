package D51;
//条件分岐の漏れを else で補う
public class D51Q17kadai {
    public static void main(String[] args) {
        /*
        「just 4」と表示されるコードを作成する
        ただし、変数(int x = 4)は変更してはいけない
        */

        int x = 4;
        if (x > 4){
            System.out.println("over 4");
        }else if (x < 4){
            System.out.println("under 4");
        }else{
            System.out.println("just 4");
        }
    }
}
