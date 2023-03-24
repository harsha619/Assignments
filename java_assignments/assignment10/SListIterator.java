package assignment10;

public class SListIterator <T>{
    public  SListIterator(){

    }
    public Node<T> insert(T data){
        return new Node<T>(data);
    }
    public  Node<T> remove (Node<T> node, Node<T> head) {
        Node<T> tempNode= node;
        Node<T> prevNode= node;

        while(tempNode!=null){
            if(tempNode==head){
                prevNode.next=tempNode.next;
                return node;
            }
            prevNode=tempNode;

            tempNode=tempNode.next;
        };
        return  node;
    };
}
