package D53;
/*
    次の10進数の値を、指定された形式の数値リテラルを使って byte 型の変数に格納してください。
    10進数の 63 →  2進数リテラル（0b）で byte a に代入
    10進数の 64 →  8進数リテラル（0 ）で byte b に代入
    10進数の 65 → 16進数リテラル（0x）で byte c に代入
*/
public class D53Q21kadai {
    public static void main(String[] args) {
        byte a = 0b00111111; // 2進数で 63
        byte b = 0100;       // 8進数で 64
        byte c = 0x41;       // 16進数で 65
        System.out.printf(" a:%d %n b:%d %n c:%d", a, b, c);
    }
}