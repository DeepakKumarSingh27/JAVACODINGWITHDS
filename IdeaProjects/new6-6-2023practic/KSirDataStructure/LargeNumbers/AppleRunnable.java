package KSirDataStructure.LargeNumbers;

public class AppleRunnable  implements  Runnable{
    Fruit f = new Fruit();
    @Override
    public void run() {
        f.saleApple();
    }
}
