package D51;
//case と fallthrough について
public class D51Q26kadai {
    //「one」と表示されるコードを作成する
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch (n) {
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
                break;
            default:
                s += "?";
        }
        System.out.println(s);
    }
    /*
    【case-break】
    ・case  = caseの値に一致すると処理がおこなわれる　
    ・break = 実行されるとブロックを抜け、次の処理(今回はswitchの外)へ移る

    【fallthrough】
    ・switch文における、意図的にbreakを省略する記法のこと

    fallthroughできる言語
    # C
    # C++
    # Java
    # JavaScript
    # PHP
    # Perl (明示的に指定：next)
    # Swift(明示的に指定：fallthrough)
    # Go   (明示的に指定：fallthrough)

    fallthrough出来ない言語（近い構文はある）
    # Ruby  (case)
    # Scala (match)
    # Kotlin(when)

    fallthrough出来ない言語
    # C#
    */
}
