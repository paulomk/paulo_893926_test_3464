public interface Storage {
    /**
     * Gets the next empty index in the array
     * @param objectsList
     * @return
     */
    public default int getIndex(Object[] objectsList) {
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
