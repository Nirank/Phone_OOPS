public class Main {
    public static void main(String[] args) {



        LandLine l1 = new LandLine( "123");
        LandLine l2 = new LandLine( "456");

        l1.callNumber("456");
        l2.receivedCall("123");
        System.out.println( l2.ansCall());

    }
}