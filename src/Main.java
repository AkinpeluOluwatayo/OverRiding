public class Main {
    public static void main(String[] args) {

        Dog d = new GermanShepard();  //overiding here is when we use the Dog class here
                                      // to create the other GermanShepard class and the german shepard method printed overides the dog here after extended
        d.bark();

        //GermanShepard g = new GermanShepard();
       // g.bark();
    }
}