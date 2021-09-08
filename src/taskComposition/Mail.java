package taskComposition;

import java.util.Scanner;

public class Mail {
    public String login;
    public String password;
    public String site;

    public Mail(String login, String password, String site) {
        this.login = login;
        this.password = password;
        this.site = site;
    }

    public Mail() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
public void logIn(){
    System.out.println("enter LOGIN ");
    String logP=new Scanner(System.in).nextLine();
    System.out.println("enter password ");
    String pswP=new Scanner(System.in).nextLine();
        if(this.login.equals(logP)&&this.password.equals(pswP))
    System.out.println("You logIN");
        else{
            System.out.println("wrong data");
        }
}
    @Override
    public String toString() {
        return "Mail{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
