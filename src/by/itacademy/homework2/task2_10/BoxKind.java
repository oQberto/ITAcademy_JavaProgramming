package by.itacademy.homework2.task2_10;

public enum BoxKind {
    COMMON_BOX("Common box"),
    CUBE("Cube"),
    ENVELOPE("Envelope");
    private final String boxKind;

    BoxKind(String boxKind) {
        this.boxKind = boxKind;
    }

    public String getBoxKind() {
        return boxKind;
    }
}
