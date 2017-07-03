package Stack;

/**
 * Created by Robert-PC on 7/2/2017.
 */

//TODO stack impl using linked lists.
public class StackDemo {
    private StackArrayImpl stackArrayImplDemo;

    public StackDemo(int size){
        stackArrayImplDemo = new StackArrayImpl<Integer>(size);

        System.out.println("Push : " + stackArrayImplDemo.push(1).get());
        System.out.println("Push : " + stackArrayImplDemo.push(2).get());
        System.out.println("Push : " + stackArrayImplDemo.push(3).get());

        System.out.println("Popping : " + stackArrayImplDemo.pop().orElse("Empty stack"));
        System.out.println("Top : " + stackArrayImplDemo.top().orElse("Empty stack"));
        System.out.println("Pushing : " + stackArrayImplDemo.push(123).get());
        System.out.println("Pushing(should refuse) : " + stackArrayImplDemo.push(12345).get());
        System.out.println("Top : " + stackArrayImplDemo.top());

        System.out.println("Expression parser using stack : ");

        ExpressionParser expressionParser = new ExpressionParser();
        System.out.println("(2+3){qeqw}[] : " + expressionParser.isCorrect("(2+3){qeqw}[]"));
        System.out.println("(]{}[]() : " + expressionParser.isCorrect("(]{}[]()"));
        System.out.println("){}[] :" + expressionParser.isCorrect("){}[]"));

    }

}
