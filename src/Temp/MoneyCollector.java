package Temp;

public class MoneyCollector {
//    private int earn;
//    public  void setEarning(int earn) {
//        this.earn = earn;
//    }
//
//    public void collectMoney(Game selectedGame, operator.Operator operators, Temp.VisitorsRegistration visitorsRegistration) {
//        algorithm.Queue queue = visitorsRegistration.queue;
//        int round = operators.getNumberOfRounds();
//        int seat = selectedGame.getSeat();;
//        int total = 0;
//        int earn = 0;
//        algorithm.Queue temp=new algorithm.Queue();;
//        for (int i = 0; i < round; i++) {
//            while (total <= seat && !queue.isEmpty()) {
//                algorithm.Node headNode = queue.getHeadNode();
//                total += headNode.data;
//                if (total <= seat) {
//                    //queue.enQueue(queue.deQueue());
//                    temp.enQueue(queue.deQueue());
//
//
//                } else {
//                    total = total - headNode.data;
//                    break;
//                }
//            }
//            while(!temp.isEmpty())
//            {
//                queue.enQueue(temp.deQueue());
//            }
//            earn = earn + total;
//            total = 0;
//        }
//        setEarning(earn);
//        operators.recordBook.add(new operator.RecordBook(round, seat, earn));
//        System.out.println("Total Earning - " + earn);
//        System.out.println("If you see rider list ?");
//        System.out.println("1) Yes");
//        System.out.println("2) Otherwise continue ride");
//        int option = util.ThemParkUtil.getInstance().checkAndReturnValidInput();
//        if (option == 1)
//            visitorsRegistration.showVisitors();
//        System.out.println("If you see earning ?");
//        System.out.println("1) Yes");
//        System.out.println("2) Otherwise continue ride");
//        option = util.ThemParkUtil.getInstance().checkAndReturnValidInput();
//        if (option == 1)
//            operators.showRollerCoastEarning();
//    }
}
