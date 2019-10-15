import java.util.Scanner;
import java.util.Stack;

class infix_to_postfix
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE EXPRESSION:");
        String exp=input.nextLine();
        //String exp="a+b)";
        exp=exp+')';
        String ans="";
        Stack<Character> stack=new Stack<Character>();
        stack.push('(');
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i)=='(')
            {stack.push('(');}
            else if(exp.charAt(i)==')')
            {
                while(stack.peek()!='(')
                {
                    ans=ans+stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else if(exp.charAt(i)=='-'||exp.charAt(i)=='+')
            {
                while(stack.peek()!='(')
                {
                    ans=ans+stack.peek();
                    stack.pop();
                }
                stack.push(exp.charAt(i));
            }
            else if(exp.charAt(i)=='*'||exp.charAt(i)=='/')
            {
                while(stack.peek()!='('&&stack.peek()!='-'&&stack.peek()!='+')
                {
                    ans=ans+stack.peek();
                    stack.pop();
                }
                stack.push(exp.charAt(i));
            }
            else if(exp.charAt(i)=='^')
            {
                while(stack.peek()!='('&&stack.peek()!='-'&&stack.peek()!='+'&&stack.peek()!='*'&&stack.peek()!='/')
                {
                    ans=ans+stack.peek();
                    stack.pop();
                }
                stack.push('^');
            }
            else
            {ans=ans+exp.charAt(i);}
        }
        System.out.print("Infix expression is:"+ans);
        input.close();
    }
}