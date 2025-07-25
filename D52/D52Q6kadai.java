package D52;
//自動販売機のお釣りの払い出しをシミュレートする(改良版)
public class D52Q6kadai {
    /*
    テストケースの追加や変更がしやすいように、コマンドを配列にまとめるアレンジをしてください
    ・"i 100" のようなコマンドを要素とする String[] scenario 配列を main メソッド内に定義すること
    ・配列 scenario に格納されたコマンドを、順に execCom メソッドで処理すること
    */
    public static void main(String[] args) {
        //商品のラインナップ
        Drink[] dr = {
                new Drink("GomaCola ", 150),
                new Drink("MrPepper ", 130),
                new Drink("SaltWater", 320)
        };
        //商品をセット済みの自販機を生成
        VendingMachine vm = new VendingMachine(dr);

        //実行コマンドのリスト
        String[] scenario = {
                "i 100",
                "p 2",
                "i 500",
                "p 3",
                "c 0"
        };
        vm.display();                //商品を表示
        for (String s : scenario) {
            vm.execCom(s);
        }
    }
}

//ドリンクのクラス
class Drink2 {
    private String name;//ドリンクの商品名
    private int price;  //ドリンクの値段

    //コンストラクタ
    Drink2(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {return name;}
    public int getPrice() {return price;}
    public String toString() {
        return "[ " + name + " ] " + price + "円";
    }
}

//自動販売機のクラス
class VendingMachine2 {
    private Drink[] drinks;//商品ラインナップのリスト
    private int cash = 0;  //投入金額の初期値
    private int[] coins = {500, 100, 50, 10};//対応している硬貨

    //コンストラクタ
    VendingMachine2(Drink[] drinks) {
        this.drinks = drinks;
    }
    //商品を表示する
    public void display() {
        int idx = 1;
        for (Drink drink : drinks) {
            System.out.println("〔" + idx + "〕" + drink);//〔番号〕ドリンク名
            idx++;
        }
    }
    //自動販売機を操作する
    public void execCom(String command){
        String[] s = command.split(" "); //コマンド␣引数の数値
        switch(s[0]) {
            case "i": // In
                //お金を投入金額にセットする
                if (isCoin(s[1])) cash += Integer.parseInt(s[1]);
                break;
            case "p": // Pay
                int idx = Integer.parseInt(s[1]) - 1;//選択された番号とリストのインデックスを合わせる
                if (idx < 0 || idx >= drinks.length) return;//その際、リストのインデックスに収まらなくなったら終了する
                int price = drinks[idx].getPrice(); //ドリンクの値段
                //お支払い成功の場合
                if (price <= cash) {
                    eject(idx);
                    cash -= price;
                    payChange();
                }
                //お支払い失敗の場合
                else {
                    System.out.println("お金が足りません");
                }
                break;
            case "c": //Change
                payChange();
                break;
            default:
                break;
        }
    }
    //投入されたお金が対応硬貨かチェックする
    private boolean isCoin(String s){
        int c = Integer.parseInt(s);
        for (int coin :coins) {
            if (c == coin) return true;
        }
        return false;
    }
    //商品を渡すメッセージを表示する
    private void eject(int idx) {
        System.out.println(drinks[idx] + " が排出されました");
    }
    //お釣りを返すメッセージを表示する
    private void payChange() {
        //お釣りがない場合
        if (cash == 0){
            System.out.println("お釣り なし");
            return;
        }
        String s = "お釣り ";
        for (int coin : coins) {
            if (cash / coin > 0){
                s += coin + "円:" + (cash / coin) + "枚 ";
                cash %= coin;
            }
        }
        System.out.println(s);
    }
}