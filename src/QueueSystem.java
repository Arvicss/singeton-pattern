import java.util.LinkedList;
import java.util.Queue;

public class QueueSystem {
  private static QueueSystem instance;
  private final Queue<Integer> queue;
  private Integer currentNumber;
  private Integer servingNumber;

  private QueueSystem(){
    this.queue = new LinkedList<>();
    this.currentNumber = 1;
  }

  public static synchronized QueueSystem getInstance() {
    if (instance == null)
      instance = new QueueSystem();
    return instance;
  }

  public synchronized Integer getQueueNumber(){
    Integer currentNumber = this.currentNumber;
    this.currentNumber++;
    this.queue.add(currentNumber);

    return currentNumber;
  }

  public synchronized Integer serveNextInLine(){
    this.servingNumber = this.queue.poll();

    return this.servingNumber;
  }

  public synchronized Integer getServingNumber(){
    return this.servingNumber;
  }

  public synchronized Integer getNextNumberInline(){
    return this.queue.peek();
  }

  public synchronized void resetNumber(Integer newQueueNumber) {
    if (newQueueNumber <= 0) {
      throw new IllegalArgumentException("Queue number must be greater than 0");
    }

    this.currentNumber = newQueueNumber;

    System.out.println("Queue number has been reset to: " + this.currentNumber);
  }
}
