import Stack.StackApplications.Conversion;

public class Main {

    public static void main(String args[]){
        Conversion stackConvertions = new Conversion();
        String infix = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("Given Infix Expression : "+infix);
        String result = stackConvertions.infixToPostfix(infix);

        if(result==null){
            System.out.println("Check your infix string.There is a missing of closing bracket");
        }else{
            System.out.println("Corresponding Postfix String : "+result);
        }
    }
}
