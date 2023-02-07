package by.itacademy.additionalTasks.phone;

public class Phone {
    private String number;
    private PhoneModel phoneModel;
    private int weight;

    public Phone(String number, PhoneModel phoneModel, int weight) {
        this.number = number;
        this.phoneModel = phoneModel;
        this.weight = weight;
    }

    public String receiveCall(String name) {
        return name + " is calling";
    }

    public String receiveCall(String name, String phoneNumber) {
        return name + " is calling\n" + phoneNumber;
    }

    public static void sendMessage(String... phoneNumbers) {
        System.out.println("Message will be sent: ");
        for (String str : phoneNumbers) {
            System.out.println(str);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", phoneModel=" + phoneModel +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneModel getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(PhoneModel phoneModel) {
        this.phoneModel = phoneModel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
