package Stack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Robert-PC on 7/3/2017.
 */
public class ExpressionParser {

    private Map separators ;
    private Map reversedSeparators;

    public ExpressionParser(){

        separators = new HashMap();
        reversedSeparators = new HashMap();
        separators.put('(',')');
        reversedSeparators.put(')','(');

        separators.put('{','}');
        reversedSeparators.put('}','{');

        separators.put('[',']');
        reversedSeparators.put(']','[');
    }

    public boolean isCorrect(String expression){
        StackArrayImpl stackArray = new StackArrayImpl<Character>(expression.length());

        for(char current : expression.toCharArray()){
            if(separators.containsKey(current)){
                stackArray.push(current);
            }

            if(separators.containsValue(current) && (reversedSeparators.get(current) != stackArray.top()))
                return false;

        }
        return true;

    }
}
