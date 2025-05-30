public class D50Q27kadai {
    //switch 文
    public static void main(String[] args) {
        int control = 1;
        String mode;

        switch (control){
            case 1:
                mode = "Warm";
                break;         //正しく動作するために追記
            case 2:
                mode = "Cool";
                break;         //正しく動作するために追記
            default:
                mode = "Wind";
                break;
        }
        System.out.println(mode);
    }
}
