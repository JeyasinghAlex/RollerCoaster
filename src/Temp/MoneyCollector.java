package Temp;

import Games.Game;

public class MoneyCollector {
//    private int earn;
//    public  void setEarning(int earn) {
//        this.earn = earn;
//    }
//
//    public void collectMoney(Game selectedGame, Temp.Operator operators, Temp.VisitorsRegistration visitorsRegistration) {
//        Temp.Queue queue = visitorsRegistration.queue;
//        int round = operators.getNumberOfRounds();
//        int seat = selectedGame.getSeat();;
//        int total = 0;
//        int earn = 0;
//        Temp.Queue temp=new Temp.Queue();;
//        for (int i = 0; i < round; i++) {
//            while (total <= seat && !queue.isEmpty()) {
//                Temp.Node headNode = queue.getHeadNode();
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
//        operators.recordBook.add(new Temp.RecordBook(round, seat, earn));
//        System.out.println("Total Earning - " + earn);
//        System.out.println("If you see rider list ?");
//        System.out.println("1) Yes");
//        System.out.println("2) Otherwise continue ride");
//        int option = Temp.ThemParkUtil.getInstance().checkAndReturnValidInput();
//        if (option == 1)
//            visitorsRegistration.showVisitors();
//        System.out.println("If you see earning ?");
//        System.out.println("1) Yes");
//        System.out.println("2) Otherwise continue ride");
//        option = Temp.ThemParkUtil.getInstance().checkAndReturnValidInput();
//        if (option == 1)
//            operators.showRollerCoastEarning();
//    }
}
