package D50;

public class D50Q6 {
    //入力値の範囲の素数を表示
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        if (max < min){
            int tmp = max;
            max = min;
            min = tmp;
        }

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNumbers(max);
        int[] part = primeNumbers.getPart(min, max);

        for (int prime : part) {
            System.out.println(prime);
        }
    }
}

class PrimeNumbers{
    boolean[] isPrimeNumbers;

    void initializePrimeNumbers(int max){
        //==== 素数？ はい/いいえ の配列を作成=====
        //現在中身は [true true true ...] の状態
        isPrimeNumbers = new boolean[max + 1];
        for (int i = 2; i <= max; i++){
            isPrimeNumbers[i] = true;
        }//====================================
        //==== ここで true/false に分けていく ============
        /* max = 25 なら p は 2 ..< 5 まで続ける */
        for (int p = 2; p <= Math.sqrt(max); p++){
            if (isPrimeNumbers[p]){
                for (int m = p * 2; m <= max; m += p){
                    isPrimeNumbers[m] = false;
                }
            }
        }
    }//================================================

    int[] getPart(int min, int max){
        //==== 素数が何個あったか数える =======
        int count = 0;
        for (int n = min; n <= max; n++){
            if (isPrimeNumbers[n]){
                count++;
            }
        }//===============================
        //==== 素数を配列で返す =============
        int [] part = new int[count]; //素数専用配列
        int index = 0;;
        for (int n = min; n <= max; n++){
            if (isPrimeNumbers[n]){
                part[index++] = n;
            }
        }
        return part;
    }//====================================
}