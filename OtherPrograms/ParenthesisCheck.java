package OtherPrograms;
public class ParenthesisCheck {
    public static void main(String[] args) {
        String input = "((]))[";
        System.out.println(isValidString(input));
    }
    private static boolean isValidString(String input) {
        if(input.isEmpty()) return true;
        if(input.length() == 1) return false;
        char[] stack = new char[input.length()];
        int top = -1;
        for(char c: input.toCharArray()){
            if(!isClosing(c))
                stack[++top] = c;
            else{
                if(top ==-1 || c!=getClosing(stack[top])) return false;
                top--;
            }
        }
        return top == -1;
    }
    static boolean isClosing(char c){
        if(c==')' || c== ']' || c=='}') return true;
        return false;
    }
    static char getClosing(char c){
        return switch (c){
                case '(' -> ')';
                case '[' -> ']';
                default -> '}';
        };
    }
}
