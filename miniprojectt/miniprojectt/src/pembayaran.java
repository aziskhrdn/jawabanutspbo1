import java.util.Scanner;
    class pembayaran{

    private String pin;
    public pembayaran (String pin) {
        this.pin = pin;
    }

    public boolean validpin(){
        return pin.equals("592421");
    }
}
