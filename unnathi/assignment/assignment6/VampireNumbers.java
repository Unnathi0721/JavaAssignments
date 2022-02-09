package unnathi.assignment.assignment6;
import java.util.*;
public class VampireNumbers {
    public static String splitIntoDigits(int a,int b){
        ArrayList<Integer> digits = new ArrayList<>();
        while (a > 0) {
            digits.add(a%10);
            a /= 10;
        }
        while (b > 0) {
            digits.add(b%10);
            b/= 10;
        }
        Collections.sort(digits);
        return digits.toString();
    }
    public static boolean isVampireNumber(int a,int b){
        String multiplicationDigits = splitIntoDigits(a*b,0);
        String factorDigits = splitIntoDigits(a,b);

        return multiplicationDigits.equals(factorDigits);
    }
    public static void main(String[] args){
        int ct=0;
        for(int i=10;ct!=100;i++){
            for(int j=i;j<i*10 && ct!=100;j++){
                if(!(i%10==0 && j%10==0)){
                    if(isVampireNumber(i,j)){
                        ct+=1;
                        System.out.println("["+(ct)+"]"+i+" * "+j+" = "+(i*j));
                    }
                }
            }
        }
    }
}
