package sdacademy.java7krk;

public class Developer extends User {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    void printMyRole() {
        System.out.println("JESTEM DEVELOPEREM");
    }
}
