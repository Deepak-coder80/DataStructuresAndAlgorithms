package Stack.problems;

import Stack.Base.MyIntStack;

import java.util.Scanner;

public class DecToBin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyIntStack stack = new MyIntStack(20);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        while(num>0){

            int rem = num%2;
            stack.push(rem);
            num /= 2;
        }

        System.out.print("Binary Equivalent : ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        scan.close();
    }
}
