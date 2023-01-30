public class Main {
    public static void main(String[] args) {

        ITelephone timsPhone; //implement Interface
        timsPhone = new DeskPhone(123456); //seems that all objects created under an interface have the
        // same variable name
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

        ITelephone timPhone;
        timPhone = new DeskPhone(123456);
        timPhone.powerOn();
        timPhone.callPhone(123456);
        timPhone.answer();

        timPhone = new MobilePhone(24565);
        timPhone.powerOn();
        timPhone.callPhone(24565);
        timPhone.answer();
    }
}