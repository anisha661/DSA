package dsa.Maths;
/**
 * Count the number of prime numbers less than a non-negative number, n.
 * */
public class CountPrimes {

    public int noOfPrimes(int n){
        boolean[] primes = new boolean[n];

        for(int i = 2; i*i<primes.length;i++){
            if(!primes[i]){
                for(int j =i;j*i<primes.length;j++){
                    primes[i*j] = true;
                }
            }
        }

        int primeCount = 0;
        for(int i=2;i<primes.length;i++){
            if(!primes[i]){
                primeCount++;
            }
        }
        return primeCount;
    }
}
