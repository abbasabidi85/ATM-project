package atmmachine;

public class AtmDetails{

    private int cardNo;
    private int pin;
    private String expDate;
    private int cvv;
    private int IFSC;

    

    //Constructor
    AtmDetails (int cardNo, int cvv, String expDate, int pin, int IFSC){
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.expDate = expDate;
        this.pin = pin;
        this.IFSC = IFSC;
    }

    //Getters and Setters

    public int getCardNo() {
        return cardNo;
    }
    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public int getIFSC() {
        return IFSC;
    }
    public void setIFSC(int iFSC) {
        IFSC = iFSC;
    }

}