public interface Phone {
    void powerOn();
    void callNumber(String pNumber);
    boolean ansCall();
    void receivedCall( String phoneNumm);
    boolean isRinging();
}
