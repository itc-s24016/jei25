package D51;
//信号記の色を出力するオリジナルコード
public class D51Q27kadai {
    //「青」を出力する
    enum TrafficLight {RED, YELLOW, BLUE}

    public static void main(String[] args) {
        TrafficLight color = TrafficLight.BLUE;
        String c = "";
        switch (color) {
            case RED:
                c = "赤";
                break;
            case YELLOW:
                c = "黄色";
                break;
            case BLUE:
                c = "青";
                break;
        }
        System.out.println("🚥:"+c);
    }
}
