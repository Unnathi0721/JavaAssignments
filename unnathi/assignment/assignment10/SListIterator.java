package unnathi.assignment.assignment10;

public class SListIterator<T>{
    SList<T> head;
    private int length=0;
    SListIterator(SList<T> head ){
        this.head=head;
    }
    void add(T data) {
        SList<T> temp = new SList<>(data);
        if (this.head == null) {
            head = temp;
        }
        else {
            SList<T> X = head;
            while (X.next != null) {
                X = X.next;
            }
            X.next = temp;
        }
        length++;
    }
    void insert(int position, T data) {
        if (position > length + 1) {
            System.out.println("Position Unavailable in LikedList");
            return;
        }
        if (position == 1) {
            SList<T> temp = head;
            head = new SList<T>(data);
            head.next = temp;
            return;
        }
        SList<T> temp = head;
        SList<T> prev = new SList<T>(null);
        while (position - 1 > 0) {
            prev = temp;
            temp = temp.next;
            position--;
        }
        prev.next = new SList<T>(data);
        prev.next.next = temp;
    }

    void remove(T key) {
        SList<T> prev = new SList<>(null);
        prev.next = head;
        SList<T> next = head.next;
        SList<T> temp = head;
        boolean exists = false;
        if (head.data == key) {
            head = head.next;
            exists = true;
        }
        while (temp.next != null) {
            if (String.valueOf(temp.data).equals(String.valueOf(key))) {
                prev.next = next;
                exists = true;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;
        }
        if (exists == false && String.valueOf(temp.data).equals(String.valueOf(key))) {
            prev.next = null;
            exists = true;
        }
        if (exists) {
            length--;
        }
        else {
            System.out.println("Given Value is not present in linked list");
        }
    }
    public SListIterator<T> Iterator(SList<T>  head)
    {
        this.head=head;
        return this;
    }
    public String toString(){
        String list="";
        SList<T> temp=head;
        while(temp.next!=null){
            list=list+temp.data;
        }
        return list;
    }
    // returns false if next element does not exist
    public boolean hasNext()
    {
        return this.head != null;
    }

    // return current data and update pointer
    public T next()
    {
        T data = head.getData();
        head = head.getNext();
        return data;
    }
}
