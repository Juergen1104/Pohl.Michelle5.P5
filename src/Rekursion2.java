public class Rekursion2 {

    /* *** Aufgabenteil (a) *** */
    public static int quadratRek(int a){

        return 0;  // Dummy return
    }

    /* *** Aufgabenteil (b) *** */

    public static int treppen(int n, String s){
       
        return 0;  // Dummy return    
    }

    /* *** Aufgabenteil (c) *** */
    public static int naechstesElement(int a_i){
        
	return 0;  // Dummy return
    }

    public static void collatz(int a, int count){
	
    }



    public static void main(String[] args){

	/* *** Test  Aufgabenteil (a) *** */
        System.out.println("(a)");
	int z;
	do {
	    z = IOTools.readInteger("z = ");
	} while (z < 0);
	System.out.println("z^2 = " + quadratRek(z));
        
	/* *** Test  Aufgabenteil (b) *** */
	System.out.println("\n(b)");
        int n = IOTools.readInteger("n = ");
        int count = treppen(n,"");
        System.out.println("Anzahl der Möglichkeiten: " + count);  

	/* *** Test  Aufgabenteil (c) *** */
	System.out.println("\n(c)");
	int a0 = IOTools.readInteger("a_0 = ");
	collatz(a0,1);

   }
}
