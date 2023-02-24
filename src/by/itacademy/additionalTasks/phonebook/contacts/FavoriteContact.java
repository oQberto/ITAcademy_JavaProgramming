package by.itacademy.additionalTasks.phonebook.contacts;

import java.util.Set;

public class FavoriteContact extends Contact {
    private int fastCall;
    private String number;

    public FavoriteContact(String name,
                           Set<String> workNumbers,
                           Set<String> personalNumbers,
                           int fastCall,
                           String number) {
        super(name, workNumbers, personalNumbers);
        this.fastCall = fastCall;
        this.number = number;
    }

    public int getFastCall() {
        return fastCall;
    }

    public String getNumber() {
        return number;
    }
}
