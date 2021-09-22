
public class LinkedQueue <T>{
    private MyLinkedList<T> list;

    public LinkedQueue() {
        list = new MyLinkedList<>();
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(T item) {
        list.insertFirst(item);
    }

    public T pop() {
        return list.removeLast();
    }




}
