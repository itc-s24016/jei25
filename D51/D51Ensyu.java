package D51;
//学生番号と氏名を管理するクラス
public class D51Ensyu {// メインクラス
    public static void main(String[] args) {
        D51Student student = new D51Student(args[0], args[1]);

        System.out.println(student.getId());
        System.out.println(student.getName()+"\n");

        D51Student2 student2 = new D51Student2(args[0], args[1]);

        System.out.println(student2.id());
        System.out.println(student2.name());
    }
}
class D51Student{
    private String id;  // 学生番号
    private String name;// 氏名

    public D51Student(String id, String name) {// コンストラクタ
        this.id = id;
        this.name = name;
    }
    public String getId()   {return id;}  // ゲッター
    public String getName() {return name;}// ゲッター
}

//record を使用すると、コンストラクタ・ゲッター が自動生成される ※セッターはできない
record D51Student2(String id, String name) {}