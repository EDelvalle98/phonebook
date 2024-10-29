package homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Kyle","1234567890");
        phonebook.add("Jimmy","9876543210");
        phonebook.addAll("Nick", "1111111111","2222222222");

        phonebook.remove("Jimmy");

        boolean quickCheck = phonebook.hasEntry("Kyle");
        System.out.println(quickCheck);

        List<String> lookup = phonebook.lookup("Jimmy");
        System.out.println(lookup);
    }
}
