class Move implements Storage{
    /* *************************************** */
    // write your code here
    private Box[] boxArray;
    public Move(int size){ //constructs the defined capacity of the move (using array)
        this.boxArray = new Box[size];
        System.out.println("The objects of my move are:");
    }
    public void addBox(Box aBox) {
        int index = getIndex(this.boxArray);
        this.boxArray[index] = aBox;
    }

    public Box find(String objectIdentifier){ //this return will be fixed in the ToString in Box
        //implement this
        return new Box(1,2); //placeholder
    }

    public void print(){
        for (Box b: boxArray) {
            System.out.println(b);
        }
    }

    /* *************************************** */

    public static void main(String[] args) {
        // We create a move that will hold 2 main boxes
        Move move = new Move(2);

        /*
         * We create and then fill 3 boxes
         * Arguments of the constructor of Box:
         * argument 1: number of items (simple items/objects or box) that the box can hold
         * argument 2: box number
         */

        // box 1 contains scissors
        Box box1 = new Box(1, 1);
        box1.addItem(new SingleObject("scissors"));

        // box 2 contains one book
        Box box2 = new Box(1, 2);
        box2.addItem(new SingleObject("book"));

        // box 3 contains one compass
        // and one box containing one scarf
        Box box3 = new Box(2, 3);
        box3.addItem(new SingleObject("compass"));
        Box box4 = new Box(1, 4);
        box4.addItem(new SingleObject("scarf"));
        box3.addItem(box4);

        // We add the three boxes to the first box of move - see below
        Box box5 = new Box(3, 5);
        box5.addItem(box1);
        box5.addItem(box2);
        box5.addItem(box3);

        // We add one box containing 3 objects to move
        Box box6 = new Box(3, 6);
        box6.addItem(new SingleObject("pencils"));
        box6.addItem(new SingleObject("pens"));
        box6.addItem(new SingleObject("rubber"));

        // We add the two most external boxes to the move
        move.addBox(box5);
        move.addBox(box6);

        // We print all the contents of the move
        move.print();

        // We print the number of the outermost cardboard containing the item "scarf"
        System.out.println("The scarf is in the cardboard number " + move.find("scarf"));

        //MY TESTING AREA
        //System.out.println(box5);
    }
}
