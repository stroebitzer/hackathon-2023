public class Calculator {

    public static void main(String... args) {

        Integer a = Integer.parseInt(args[0]);
        String operation = args[1];
        Integer b = Integer.parseInt(args[2]);

        if (operation.equals("und")) {
            System.out.println(a + b);
        } else if (operation.equals("weniga")) {
            System.out.println(a - b);
        } else if (operation.equals("moi")) {
            // TODO implement multiply
        } else if (operation.equals("duach")) {
            System.out.println(a / b);
        }

    }

}
