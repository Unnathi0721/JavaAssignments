import java.util.*;
public class Assignment1 {
    public static boolean checkAllAlphabets(String s){
        boolean[] array=new boolean[26];
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                if(Character.isLowerCase(s.charAt(i))){
                    array[s.charAt(i)-'a']=true;
                }

                else{
                    array[s.charAt(i)-'A']=true;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(array[i]==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        if(checkAllAlphabets(input)){
            System.out.println("All alphabets are present");
        }
        else{
            System.out.println("All alphabets are not present");
        }
    }
}


//Space Complexity=O(n)
//Time Complexity=O(n)
