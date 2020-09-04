public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Enter operator and two integers.");
        } else {
            for (int i = 0; i < args.length; ++i) {
                System.out.print(args[i] + " " );
            }
            System.out.println();

            int x = Integer.valueOf(args[1]);
            int y = Integer.valueOf(args[2]);
            int result = 0;
            switch (args[0]) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "x":
                    result = x * y;
                    break;
                case "/":
                    result = x / y;
                    break;
                default:
                    System.out.println("Invalid operator " + args[0]);
            }
            System.out.println(result);
        }
    }
}

