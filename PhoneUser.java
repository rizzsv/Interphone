public class PhoneUser {
    private xiaomi phone;

    public PhoneUser(xiaomi phone){
        this.phone = phone;
    }

    void turnOnThePhone(){
        this.phone.powerOn();
    }

    void turnOffThePhone(){
        this.phone.powerOff();
    }
    void makePhoneLouder(){
        this.phone.VolumeUp();
    }
    void makePhoneSilent(){
        this.phone.VolumeDown();
    }
}
