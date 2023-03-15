package assignment10;

public class Main {
    public static void main(String[] args) {
        SListIterator<String> iterator= new SListIterator<>();

        var node = iterator.insert("head");
        var a = iterator.insert("a");
        node.next=a;
        var b=iterator.insert("b");
        a.next= b;
        var c= iterator.insert("c");
        b.next = c;
        SList<String> sList= new SList<>();
        sList.toString(iterator.remove(node ,c));
    }
}
