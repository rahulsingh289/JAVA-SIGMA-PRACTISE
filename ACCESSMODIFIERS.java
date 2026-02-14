
// use of access specifiers
public class ACCESSMODIFIERS {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Rahul";
        myAcc.setPassword("abcdefgh");
        System.out.println(myAcc.username);
    }
}


class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}