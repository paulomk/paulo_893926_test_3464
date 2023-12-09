public class SingleObject {
    String name;

    public SingleObject(String aString){
        this.name = aString;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
