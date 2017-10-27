package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        String s = "{{{(){[]}{{}}}";
        boolean everythingIsCorrect = true;
        for (int i = 0; i < s.length() && everythingIsCorrect ; i++) {
            char symbol = s.charAt(i);
            String stringBracket = String.valueOf(symbol);
            if (stringBracket.equals("(") ||
                    stringBracket.equals("[") ||
                    stringBracket.equals("{")) {
                stack.push(stringBracket);
            } else {
                String openingBracket = stack.pop(); //переменную переименовал
                if (openingBracket.equals("(") & stringBracket.equals(")") ||
                        openingBracket.equals("[") & stringBracket.equals("]") ||
                        openingBracket.equals("{") & stringBracket.equals("}")){
                } else {
                    everythingIsCorrect = false;
                }
            }
        }
        int counter = stack.size();

        if ((everythingIsCorrect) && (counter==0) ) {       //условие дописал
            System.out.println("Последовательность норм");
        } else {
            System.out.println("WARNING!!! The sequence is NOT correct!");
        }
    }
}
