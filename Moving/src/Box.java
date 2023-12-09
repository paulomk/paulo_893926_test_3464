public class Box implements Storage{
    final private int boxId;
    Object[] objectsList;

    public Box(int capacity, int boxId){
        this.boxId = boxId;
        this.objectsList = new Object[capacity];
    }

    public void addItem(Object anObject) {
        int index = getIndex(this.objectsList);
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

    @Override
    public String toString(){
        String result = "";
        for (Object o : objectsList) {
            //System.out.println(o);
            result += o + "\n";
        }
        return result.trim();
    }
}
