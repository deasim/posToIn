
package postoin;

import java.util.Stack;

/**
 *
 * @author asim
 */
public class PosToIn 
{
    public static String posToIn(String exp)
    {
        Stack<String> stack=new Stack<>();
        
        for (int i = 0; i < exp.length(); i++) 
        {
            char c=exp.charAt(i);
            if(Character.isLetterOrDigit(c))
                stack.push(c+"");
            else
            {
                String opnd1=stack.pop();
                String opnd2=stack.pop();
                String infix="("+opnd2+c+opnd1+")";
                stack.push(infix);
            }
            
        }
        return stack.pop();
    }
}
