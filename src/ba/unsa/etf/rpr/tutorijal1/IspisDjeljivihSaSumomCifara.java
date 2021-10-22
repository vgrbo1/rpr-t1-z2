package ba.unsa.etf.rpr.tutorijal1;
import java.util.Scanner;
public class IspisDjeljivihSaSumomCifara {
    private static int sumaCifara(int n){
        int s=0;
        while(n!=0){
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args) {
	    Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj");
        int n = ulaz.nextInt();
        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0) System.out.println(i);
        }

    }
}
