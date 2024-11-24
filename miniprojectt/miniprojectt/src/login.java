import java.util.Scanner;

    class login {

    //enkapsulasi
    private String username; //String
    private String password;
    public login (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validasi(){
        return username.equals("azis") && password.equals("123");
    }
}
