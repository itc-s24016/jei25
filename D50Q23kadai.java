public class D50Q23kadai {
    //オブジェクトの振る舞い

    String code;
    public static void main(String[] args) {
        D50Q23kadai obj = new D50Q23kadai();
        obj.setCode("Code");


        //System.out.println(code);             //NO
        //System.out.println(D50Q23kadai.code); //NO
        System.out.println(obj.code);           //OK
    }
    void setCode(String c) {
        code = c;
    }
}
