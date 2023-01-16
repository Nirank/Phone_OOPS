public class LandLine implements Phone{

    private String phoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        isRinging = false;
        isPowerOn= true;


    }


    @Override
    public void powerOn() {
        this.isPowerOn= true;
    }

    @Override
    public void callNumber(String pNumber) {
        if(isPowerOn){
            System.out.println("You are dialing the Number: " + pNumber);
        }else{
            System.out.println("Your Landline is Off.");
        }
        return ;

    }

    @Override
    public boolean ansCall() {
        if(isRinging){
            System.out.println("Call Answered.");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public void receivedCall(String phoneNum) {
        if(isPowerOn && phoneNum.equals(phoneNumber)){
            this.isRinging = true;
            System.out.println("Hey.."+ phoneNum+" You are receiving a call");

        }else{
            System.out.println("Call Not Received. ");
        }

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
