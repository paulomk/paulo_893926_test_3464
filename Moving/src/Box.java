public class Box {
    final private int boxId;
    Object[] objectsList;

    public Box(int capacity, int boxId){
        this.boxId = boxId;
        this.objectsList = new Object[capacity];
    }

    public void addItem(Object anObject) {
        int index = 0;
        while (true) {
            if (objectsList[index] == null){
                break;
            }
            else {
                index++;
            }
        }
        this.objectsList[index] = anObject;
    }
}
