package sdacademy.java7krk;

import java.util.Date;

public class Guest extends User {
    private Date loginTime;

    public Date getLoginTime() {
        return loginTime;
    }

    @Override
    void printMyRole() {
        System.out.println("JESTEM GUEST");
    }
}
