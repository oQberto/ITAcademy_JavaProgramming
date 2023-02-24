package by.itacademy.additionalTasks.phonebook.contacts;

import java.util.Set;

public class Contact {
    private String name;
    private final Set<String> workNumbers;
    private final Set<String> personalNumbers;

    public Contact(String name,
                   Set<String> workNumbers,
                   Set<String> personalNumbers) {
        this.name = name;
        this.workNumbers = workNumbers;
        this.personalNumbers = personalNumbers;
    }

    public void addNumber(String number, NumberType type) {
        if (type == NumberType.WORK) {
            workNumbers.add(number);
        } else {
            personalNumbers.add(number);
        }
    }

    public void removeNumber(String number, NumberType type) {
        if (type == NumberType.WORK) {
            workNumbers.remove(number);
        } else {
            personalNumbers.remove(number);
        }
    }

    public String updateNumber(String number, NumberType type) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getWorkNumbers() {
        return workNumbers;
    }

    public Set<String> getPersonalNumbers() {
        return personalNumbers;
    }
}
