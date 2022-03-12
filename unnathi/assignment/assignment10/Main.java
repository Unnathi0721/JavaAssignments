package unnathi.assignment.assignment10;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        SList<Integer> node=new SList<>(1);
        SListIterator<Integer> ListIterator=new SListIterator<>(node);
        ListIterator.add(5);
        ListIterator.add(4);
        ListIterator.add(-1);
        ListIterator.insert(1,25);
        ListIterator.remove(5);
        SListIterator<Integer> iterator=ListIterator.Iterator(node);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}



/*def div(l1,nm):
   for i in l1:
      if(nm%i==0){
         return 1
      }
   return 0
n1=int(input())
l=list(map(int,input().split()))
k=int(input())
t=0
l=sorted(l)
j=0
for i in range(1,k+1):
    while(j<n1):
       if(l[j]%i==0):
         t=t+1
       else
          j=j+1
    j=0
print(t)*/