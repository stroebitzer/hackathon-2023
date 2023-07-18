public class Functions {

    public static void main(String... args) {

        Integer a = Integer.parseInt(args[0]);
        String operation = args[1];
        Integer b = Integer.parseInt(args[2]);

        if (operation.equals("und")) {
            System.out.println(add(a, b));
        } else if (operation.equals("weniga")) {
            System.out.println(minus(a, b));
        } else if (operation.equals("moi")) {
            System.out.println(multiply(a, b));
        } else if (operation.equals("duach")) {
            System.out.println(divide(a, b));
        }

    }

    public static Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static Integer minus(Integer a, Integer b) {
        return a - b;
    }

    public static Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public static Integer divide(Integer a, Integer b) {
        return a / b;
    }

}
