package unnathi.assignment.assignment6;

public class Node {
    Node[] alphabets=new Node[26];
    Node(String msg){
        System.out.println(msg);
        for(int i=0;i<26;i++){
            alphabets[i]=null;
        }
    }
}
