public class InterpretExample {
    public String interpret(String command) {
        String result = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result += "G";
            }
            else if (command.charAt(i) == '(') {
                result += "(";
            } else if (command.charAt(i) == ')') {
                result += ")";
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        InterpretExample interpretExample = new InterpretExample();
        interpretExample.interpret("G()(al)");
    }
}
