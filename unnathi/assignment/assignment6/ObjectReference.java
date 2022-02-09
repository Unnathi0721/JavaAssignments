package unnathi.assignment.assignment6;
import java.util.*;
public class ObjectReference {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String message=scanner.nextLine();
        Node root=new Node(message);
        for(int i=0;i<26;i++){
            root.alphabets[i]=new Node(message+(i+1));
        }
    }
}
