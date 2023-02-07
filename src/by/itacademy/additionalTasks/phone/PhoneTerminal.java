package by.itacademy.additionalTasks.phone;

public class PhoneTerminal {
    public static void main(String[] args) {
        Phone samsung = new Phone("+375(29) 123-45-67", PhoneModel.SAMSUNG, 123);
        Phone nokia = new Phone("+375(29) 987-65-43", PhoneModel.NOKIA, 150);
        Phone iphone = new Phone("+375(29) 456-78-12", PhoneModel.IPHONE, 100);
        Phone[] phones = new Phone[] {samsung, nokia, iphone};

        for (Phone phone : phones) {
            System.out.println(phone.receiveCall("Alex") + "\n" +
                                phone.getNumber());
        }

        System.out.println();
        for (Phone phone : phones) {
            System.out.println(phone.receiveCall("Alex", phone.getNumber()));
        }

        System.out.println();
        Phone.sendMessage(samsung.getNumber(), nokia.getNumber(), iphone.getNumber());
    }
}
