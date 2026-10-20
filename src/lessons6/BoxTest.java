package lessons6;

public class BoxTest {
    public static void main(String[] args) {

        Box myBox = new Box();
        Box myBox1 = new Box();
        double vol;
        myBox.depth =10;

        myBox.width = 20;

        myBox.height =15;
        //
        myBox1.width =3;
        myBox1.depth = 6;
        myBox1.height =9;
      //
        vol = myBox.width *myBox.height * myBox.depth;

        System.out.println("obyom raven " + vol);
        System.out.println(myBox1.depth);
      //
        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println(" obyom raven " + vol);
    }
}
