package KSirDataStructure.StackAndQueue;
public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }
    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
             // temp[i] = data[(front+1)%data.length];
            }
        }
        return super.insert(item);
    }
}
