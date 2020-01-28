public class Queue implements QueueInterface{

    LinkedList linkedList = new LinkedList();
    @Override
    public void enQueue(int data) {
        linkedList.pushDataAtBack(data);
    }

    @Override
    public int deQueue() {
        return linkedList.popDataAtFront();
    }

    @Override
    public void disply() {
        linkedList.displyData();
    }

    public Node getHeadNode(){
        return linkedList.getHeadNode();
    }

    public boolean isEmpty()
    {
        return linkedList.isEmpty();
    }
}