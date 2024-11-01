public class HelpDesk {
  private final QueueSystem queueSystem;
  private final Integer helpDeskNumber;

  public HelpDesk(QueueSystem queueSystem, Integer helpDeskNumber) {
    this.queueSystem = queueSystem;
    this.helpDeskNumber = helpDeskNumber;
  }

  public void getQueueNumber() {
    System.out.println("\n[Help Desk " + this.helpDeskNumber +
            "] Your queue number is: " + this.queueSystem.getQueueNumber());
  }

  public void serveNextLine() {
    System.out.println(serviceHelper(this.queueSystem.serveNextInLine()));
  }

  public void resetNumber() {
    System.out.print("\n[Help Desk " + this.helpDeskNumber +
            "] ");
    this.queueSystem.resetNumber(1);
  }

  private String serviceHelper(Integer nextNumber) {
    if (nextNumber == null) {
      return "\n[Help Desk " + this.helpDeskNumber +
              "] No users in queue";
    }

    return "\n[Help Desk " + this.helpDeskNumber + "] is now serving number: " + nextNumber;
  }

}
