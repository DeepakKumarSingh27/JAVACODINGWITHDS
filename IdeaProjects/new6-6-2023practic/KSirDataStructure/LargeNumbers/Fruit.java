package KSirDataStructure.LargeNumbers;

public class Fruit {
    public void saleApple() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Apple");
            if (i == 5) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
    public void saleorange() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " orange");
        }
    }
}
