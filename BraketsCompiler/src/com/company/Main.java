package com.company;

public class Main {

    public static void main(String[] args) {
        int OpenBracket1=0;
        int OpenBracket2=0;
        int OpenBracket3=0;


	    Stack stack = new Stack(10);
        String s = "[({)}]";
        boolean ThingIsCorrect = true;
        for(int i=0;i<s.length()  ;i++) {
            char symbol = s.charAt(i);
            String StrBrackets = String.valueOf(symbol);
            if (StrBrackets.equals("(") ){
                stack.push(StrBrackets);
                OpenBracket1++;
            }
                else if (StrBrackets.equals("[")) {
                stack.push(StrBrackets);
                OpenBracket2++;
            }
                    else if (StrBrackets.equals("{")) {
                        stack.push(StrBrackets);
                OpenBracket3++;
            }
            else {
                stack.SortBracket (StrBrackets);
                String openingBrackets = stack.pop();
                    if ((openingBrackets.equals("(") && StrBrackets.equals(")")) ||
                            (openingBrackets.equals("[") && StrBrackets.equals("]")) ||
                                    (openingBrackets.equals("{") && StrBrackets.equals("}"))) {

                    }
                        else {
                        ThingIsCorrect = false;
                    }


            }
        }
        int counter = stack.size();
        int  CloseBrack1=stack.return1();
        int  CloseBrack2=stack.return2();
        int CloseBrack3=stack.return3();
        if (( ThingIsCorrect) && (counter==0)) {
            System.out.println("Все норм");
        }
        else if (( OpenBracket3== CloseBrack3) && ( OpenBracket2== CloseBrack2) && ( OpenBracket1== CloseBrack1)) {
            System.out.println("Исправлено:");
            for(int i=0;i<OpenBracket3;i++) {
                System.out.print("{");
            }
            for(int i=0;i< OpenBracket2;i++) {
                System.out.print("[");
            }
            for(int i=0;i<OpenBracket1;i++) {
                System.out.print("(");
            }
            for(int i=0;i<OpenBracket1;i++) {
                System.out.print(")");
            }
            for(int i=0;i< OpenBracket2;i++) {
                System.out.print("]");
            }
            for(int i=0;i<OpenBracket3;i++) {
                System.out.print("}");
            }


        }
        else {
            System.out.println("Warning!!! Fix yourself!!!");
        }
    }
}
