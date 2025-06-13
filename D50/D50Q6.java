package D50;

public class D50Q6 {
    //
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
        isPrimeNumbers = new boolean[max + 1];
        for (int i = 2; i <= max; i++){
            isPrimeNumbers[i] = true;
        }

        for (int p = 2; p <= Math.sqrt(max); p++){
            if (isPrimeNumbers[p]){
                for (int m = p * 2; m <= max; m += p){
                    isPrimeNumbers[m] = false;
                }
            }
        }
    }

    int[] getPart(int min, int max){
        int count = 0;
        for (int n = min; n <= max; n++){
            if (isPrimeNumbers[n]){
                count++;
            }
        }

        int [] part = new int[count];
        int index = 0;;
        for (int n = min; n <= max; n++){
            if (isPrimeNumbers[n]){
                part[index++] = n;
            }
        }
        return part;
    }
}