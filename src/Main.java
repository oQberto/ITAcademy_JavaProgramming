import by.itacademy.homework2.task5_9.RegEx;

public class Main {
    public static void main(String[] args) {
        String text = "авернякаархаикаадресаткаактивистка, армадаалчбааферисткааделаида," +
                " алискааккадаавантёЁюристкааэробика, а, аар, ааааа, АлискааккадаавантюристкааэробикА";
        System.out.println(RegEx.showWordsThatStartAndEndWithA(text));
    }
}