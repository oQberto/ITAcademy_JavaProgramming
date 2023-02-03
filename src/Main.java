import by.itacademy.homework2.task5_9.RegEx;

public class Main {
    public static void main(String[] args) {
        String text = "acceptancea, accomplice, accordance, accountancy, accuracy, acquiescencea, " +
                "acyclic, adrenocorticotrophic, anticlimactic, anticyclonic, calcification, capacitance, " +
                "cappuccino, 4255-1901-7415-3489, carcinogenic, catac-lysmiC, characteristic, chiccory, chocoholic, circumcised, " +
                "circumference, circumlocutioncircumspectcircumspect, circumspect, circumstance, coalescence, coccyx, cockchafer, " +
                "cockroaches, cocksucker, coincidence, colchicine, complacency, concentric, concoction, " +
                "concordance, concupiscence, concurrence, aconductancea, conscience, convalescence, copacetic, " +
                "crosscheck, cyclic, eccentric, ecclesiastical, 8255-1901-7415-3489, echocardiographic, eclectic, encyclopaedic, " +
                "gonococcal, iconoclastic, inaccuracy, microscopic, occupancy, pneumococcal, saccadic, scirocco," +
                "spectroscopic, staphylococcus, succinct, uncharacteristic, Cat_catc, aa";

        System.out.println("Words with \"c\": " + RegEx.countWords(text));
        System.out.println("The longest word: " + RegEx.getLongestWord(text));
        System.out.println("Words: " + RegEx.showWordsThatStartAndEndWithA(text));
        System.out.println("Card num:\n" + RegEx.getCreditCardNumber(text));
    }
}