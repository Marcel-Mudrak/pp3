public class Counter {

  private int value = 0; // data encapsulation: private attributes, and getter and setter methods below

  // methods
  public void increase() {
    this.value += 1;
  }

  public void decrease() {
    this.value -= 1;
  }

  public void increase(int amount) {
    this.value += amount;
  }

  public void decrease(int amount) {
    this.value -= amount;
  }

  public int value() {
    return this.value;
  }
}