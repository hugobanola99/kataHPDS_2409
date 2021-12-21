public class SuperPrime {
    public int[] analizeSuperPrime(int lowerBound, int higherBound) {
        int[] res = new int[2];
        int invertido = 0;
        for(int i = lowerBound; i <= higherBound; i++){
            if(esPrimo(i) && i > 10){
                invertido = invertir(i);
                if(i != invertido && esPrimo(invertido)){
                    res[1] += i;
                    res[0] += 1;
                }
            }
        }
        return res;
    }

    public boolean esPrimo(int n){
        if(n == 0 || n == 1 || n == 4) {
            return false;
        }
        for (int x = 2; x < n / 2; x++) {
            if (n % x == 0)
                return false;
        }
        return true;

    }

    public int invertir(int n){
        int resto,inv = 0;
        while(n > 0){
            resto = n % 10;
            inv = inv*10+resto;
            n /= 10;
        }
        return inv;
    }
}
