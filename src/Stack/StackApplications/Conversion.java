package Stack.StackApplications;

import Stack.Base.MyStack;

public class Conversion{
    //precedence
    public int prec(char symbol){
        switch (symbol){
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return -1;
    }
    //infix to postfix
    public String infixToPostfix(String infix){

        //define stack with length of infix string
        MyStack stack = new MyStack(infix.length());

        //declare a postfix string
        String postfix =new String("");

        //iterate through the infix string
        for(int i=0;i<infix.length();i++){
            //get character by character
            char symbol = infix.charAt(i);

            //if character is a letter then directly append to postfix string
            if(Character.isLetter(symbol)){
                postfix+=symbol;
            }else if(symbol=='('){
                //if it is open bracket then directly push into the stack
                stack.push(symbol);
            }else if(symbol==')'){
                //if it is close bracket then pop and append characters to postfix string
                //from stack
                while(!stack.isEmpty() && stack.peek()!='('){
                    postfix+=stack.pop();
                }
                //pop out open bracket
                stack.pop();
            }else{
                //an operator is encountered
                //check the precedence if it is equal then pop the operators from stack
                //when the incoming operator becomes higher precedence.
                while(!stack.isEmpty()&&prec(symbol)<=prec(stack.peek())){
                    postfix += stack.pop();
                }
                //then push it
                stack.push(symbol);
            }
        }
        //check whether stack is Empty or not if not empty append contents to postfix string
        while (!stack.isEmpty()){
            if(stack.peek()=='('){
                return null;
            }
            postfix +=stack.pop();
        }
        return  postfix;
    }
    //infix to prefix

    // prefix to postfix

   //postfix evaluation
}