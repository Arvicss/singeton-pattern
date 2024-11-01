public class PagIbigApp {
  public static void main(String[] args) {
    QueueOnlineMonitoring queueOnlineMonitoring = new QueueOnlineMonitoring(QueueSystem.getInstance());

    HelpDesk helpDesk1 = new HelpDesk(QueueSystem.getInstance(), 1);
    HelpDesk helpDesk2 = new HelpDesk(QueueSystem.getInstance(), 2);
    HelpDesk helpDesk3 = new HelpDesk(QueueSystem.getInstance(), 3);

    helpDesk1.getQueueNumber();
    helpDesk1.getQueueNumber();
    helpDesk3.getQueueNumber();
    helpDesk2.getQueueNumber();

    helpDesk2.serveNextLine();
    helpDesk3.serveNextLine();

    queueOnlineMonitoring.checkCurrentNumber();
    queueOnlineMonitoring.nextNumberInline();

    helpDesk1.serveNextLine();
    helpDesk2.serveNextLine();
    helpDesk3.serveNextLine();

    helpDesk2.resetNumber();

    helpDesk1.getQueueNumber();
    helpDesk2.serveNextLine();
  }
}
