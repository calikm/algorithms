package pckg;

public class CodilityLesson35100 {
	
    public int solution(int A[], int B[]) {
        int result = 0;

        for (int i = 0; i < A.length; i++){

            int gcdOfAAndB = gcd(A[i], B[i]);

            if (
                factorsOfRemainderAreTheSameOfGCD(A[i], gcdOfAAndB) &&
                factorsOfRemainderAreTheSameOfGCD(B[i], gcdOfAAndB)
            ) {
                result++;
            }

        }

        return result;
    }

    public boolean factorsOfRemainderAreTheSameOfGCD(int input, int gcdOfAAndB) {
        int factorsNotInGCD = input / gcdOfAAndB;

        while (gcdOfAAndB % factorsNotInGCD != 0){

            int gcd = gcd(gcdOfAAndB, factorsNotInGCD);

            if (gcd == 1)
                return false;

            factorsNotInGCD /= gcd;

        }

        return true;
    }

    public int gcd(int a, int b) {
        if (a % b == 0){
            return b;
        }

        return gcd(b, a % b);
    }
}

