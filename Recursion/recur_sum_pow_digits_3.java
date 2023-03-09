package Recursion;

public class recur_sum_pow_digits_3 {
    static int SumDigitsInRecur (int n) {
     //Base case
        if (n >= 0 && n <= 9) {
            return n;
        }
        //recursive Work ---> Small ans
//        int smallAns = SumDigitsInRecur(n/10);
        //Self Work
//        int ans = smallAns + n%10;
//        return ans;
        return SumDigitsInRecur(n/10) + n%10;
    }
    static int CountDigitsInRecur (int n) {
        //Base case
         if (n >= 0 && n <= 9) return n;

        //recursive Work ---> Small ans
//        int smallAns = CountDigitsInRecur(n/10);
        //Self Work
//        return smallAns + 1;

        return CountDigitsInRecur(n/10) + 1;

    }
    static int pow (int p, int q) {
        //Base case
        if (q==0) return 1;
        //recursive Work ---> Small ans
//         int smallAns = pow(p,q-1);
         //Self work
//         return smallAns * p;
        return pow(p,q-1) * p;
    }
    static int secondWayOfPow (int p, int q) {
        if(q==0) {
            return 1;
        }
        int smallPow = secondWayOfPow(p,q/2);
        if (q % 2 == 0) {
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }

    public static void main(String[] args) {
//        int sumAns = SumDigitsInRecur(92975545);
//        System.out.println("The sum is :) " + sumAns);

//        int countAns = CountDigitsInRecur(10);
//        System.out.println("The number of Count is :) " + countAns);


//        int powAns = pow(5,4);
//        System.out.println("The number of Count is :) " + powAns);

        int secondWayPowAns = pow(2,5);
        System.out.println("The number of Count is :) " + secondWayPowAns);


    }
}
