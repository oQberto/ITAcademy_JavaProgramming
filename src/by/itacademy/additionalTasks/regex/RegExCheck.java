package by.itacademy.additionalTasks.regex;

public class RegExCheck {
    public static void main(String[] args) {
        System.out.println(RegEx.getHexColor("""
                <body>

                  <p style="color: #FF9F35">Career Karma</p>

                </body#FF1F35>"""));
    }
}
