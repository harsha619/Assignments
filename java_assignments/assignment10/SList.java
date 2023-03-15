package assignment10;

public class SList<T>{

    public  SListIterator<T> iterator(){
        return  new SListIterator<>();
    }
    public  void toString(Node<T> node ){
        System.out.println("[");
        Node<T> tempNode= node;
        while(tempNode!=null){
            System.out.println(tempNode.data);
            tempNode= tempNode.next;
        }
        System.out.println("]");
    }

}
