public interface Addable {
    public default int getIndex(Object anObject, Object[] objectsList) {
        int index = 0;
        while (true) {
            if (objectsList[index] == null) {
                break;
            } else {
                index++;
            }
        }
        return index;
    }
}
