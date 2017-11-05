package sdacademy.java7krk;

public class Admin extends User {
    private int experience;

    public int getExperience() {
        return experience;
    }

    @Override
    void printMyRole() {
        System.out.println("JESTEM ADMINEM");
    }
}
