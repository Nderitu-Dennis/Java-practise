package strings;

public class Main {
    public String matchingInput(String s) {
      /*  if (s.matches("[01]+"))
            System.out.println("valid input");
        else
            System.out.println("invalid input!");
        return s;*/

        //using ternary operator
        System.out.println(s.matches("[01]+") ? "valid input" : "invalid input");
        return s;

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.matchingInput("01141");
        m.matchingInput("011");
        String name = "dennis";
        System.out.println(name);
        System.out.println(name.split("n"));
    }

}
