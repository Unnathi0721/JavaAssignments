package unnathi.assignment.assignment10;

public class SList<T>{
    SList next;
    T data;
    SList(T value){
        this.next=null;
        this.data=value;
    }
//    @Override
//    public String toString(){
//        StringBuilder sb=new StringBuilder();
//        SList temp=this;
//        while(temp!=null){
//            sb.append(String.valueOf(this.data)+" ");
//            temp=temp.next;
//        }
//        return sb.toString();
//    }
}
