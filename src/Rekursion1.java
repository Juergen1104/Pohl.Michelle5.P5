public class Rekursion1 {

    public static void r (int n, int k){
        if (n > 1){
            if ((n % k) == 0) {
                System.out.print (k + " ");
                n /= k;
            } else {
                k++;
            }
            r (n,k);
        }
    }

    public static void f (int n){
        r(n,2);
        System.out.println();
    }

    
    /*  Aufgabenteil (c) */

    

    public static void main(String[] args){
        int n = IOTools.readInteger("n = ");
        f (n);
    }
}


/*  Aufgabenteil (a)


 */

/*  Aufgabenteil (b)


 */
