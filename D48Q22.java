//列挙型
enum Connection {OFFLINE, ONLINE}
//列挙の宣言の仕方
public class D48Q22 {
    public static void main(String[] args) {
        /*
        この記述ではコンパイル出来ないので、
        列挙型名.列挙定数で記述すること！
        error:シンボルを見つけられません
         */
        //Connection s = OFFLINE;
        Connection s = Connection.OFFLINE;
        if(s == Connection.OFFLINE){
            s = Connection.ONLINE;
        }
        System.out.println("system:"+s);
    }
}
