package D51;
//float と double の計算が通るように修正する
public class D51Q19 {
    public static void main(String[] args) {
        float f = 4.7f;
        double d = 0.86;
//        float ans = f * d;
        float ans = f * (float)d;
        System.out.println(ans);
    }
}
