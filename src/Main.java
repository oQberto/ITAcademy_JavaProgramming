import by.itacademy.homework2.task5_9.RegEx;

public class Main {
    public static void main(String[] args) {
        String text = "acceptance, accomplice, accordance, accountancy, accuracy, acquiescence, " +
                "acyclic, adrenocorticotrophic, anticlimactic, anticyclonic, calcification, capacitance, " +
                "cappuccino, carcinogenic, catac-lysmiC, characteristic, chiccory, chocoholic, circumcised, " +
                "circumference, circumlocution, circumspect, circumstance, coalescence, coccyx, cockchafer, " +
                "cockroaches, cocksucker, coincidence, colchicine, complacency, concentric, concoction, " +
                "concordance, concupiscence, concurrence, conductance, conscience, convalescence, copacetic, " +
                "crosscheck, cyclic, eccentric, ecclesiastical, echocardiographic, eclectic, encyclopaedic, " +
                "gonococcal, iconoclastic, inaccuracy, microscopic, occupancy, pneumococcal, saccadic, scirocco," +
                "spectroscopic, staphylococcus, succinct, uncharacteristic, Cat_catc";

        System.out.println("Words with \"c\": " + RegEx.countWords(text));
    }
}