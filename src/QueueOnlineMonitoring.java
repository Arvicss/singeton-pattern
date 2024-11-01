public class QueueOnlineMonitoring {
  private final QueueSystem queueSystem;

  public QueueOnlineMonitoring(QueueSystem queueSystem) {
    this.queueSystem = queueSystem;
  }

  public void checkCurrentNumber() {
    System.out.println("\n[Online Monitoring] Serving Number: " + this.queueSystem.getServingNumber());
  }

  public void nextNumberInline() {
    Integer nextNumberInline = this.queueSystem.getNextNumberInline();

    if (nextNumberInline == null) {
      System.out.println("\n[Online Monitoring] No more numbers in queue");
    }

    System.out.println("\n[Online Monitoring] Next number inline: " + nextNumberInline);
  }
}
