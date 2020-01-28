package algorithm;

public class QueueHandler {
    public Queue queue;
    public int queueCount = 0;

    public QueueHandler(){
        queue = new Queue();
    }

    public void addToQueueCount(int count){
        queueCount += count;
    }

    public void handleQueue(int round, int seat){
        int total = 0;
        int earn = 0;
        algorithm.Queue temp=new algorithm.Queue();
        for (int i = 0; i < round; i++) {
            while (total <= seat && !queue.isEmpty()) {
                algorithm.Node headNode = queue.getHeadNode();
                total += headNode.data;
                if (total <= seat) {
                    temp.enQueue(queue.deQueue());
                } else {
                    total = total - headNode.data;
                    break;
                }
            }
            while(!temp.isEmpty())
            {
                queue.enQueue(temp.deQueue());
            }
            earn = earn + total;
            total = 0;
        }
    }
}
