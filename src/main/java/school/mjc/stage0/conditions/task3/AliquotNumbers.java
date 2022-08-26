package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (getSum(first) == second){
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }

    static int getSum(int n)
    {
        int sum = 0; // 1 is a proper divisor

        // Note that this loop runs till
        // square root of n
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                // If divisors are equal, take only one
                // of them
                if (n / i == i)
                {
                    sum = sum + i;
                }
                else // Otherwise take both
                {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }

        // calculate sum of all proper divisors only
        return sum - n;
    }
}
