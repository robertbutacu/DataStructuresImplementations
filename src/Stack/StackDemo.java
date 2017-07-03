package Stack;

/**
 * Created by Robert-PC on 7/2/2017.
 */

//TODO stack impl using linked lists.
public class StackDemo {
    private StackArrayImpl stackArrayImplDemo;

    public StackDemo(int size){
        stackArrayImplDemo = new StackArrayImpl<Character>(size);

        System.out.println("Push : " + stackArrayImplDemo.push("a"));
        System.out.println("Push : " + stackArrayImplDemo.push("b"));
        System.out.println("Push : " + stackArrayImplDemo.push("c"));

        System.out.println("Popping : " + stackArrayImplDemo.pop());
        System.out.println("Top : " + stackArrayImplDemo.top());
        System.out.println("Pushing : " + stackArrayImplDemo.push("abc"));
        System.out.println("Pushing(should refuse) : " + stackArrayImplDemo.push("abasd"));
        System.out.println("Top : " + stackArrayImplDemo.top());

        System.out.println("Expression parser using stack : ");

        ExpressionParser expressionParser = new ExpressionParser();
        System.out.println("(2+3){qeqw}[] : " + expressionParser.isCorrect("(2+3){qeqw}[]"));
        System.out.println("(]{}[]() : " + expressionParser.isCorrect("(]{}[]()"));
        System.out.println("){}[] :" + expressionParser.isCorrect("){}[]"));
    }

}
