package sorting;

import java.util.*;

/**
 * @author p.varchenko
 */
public class StackSort {

    private static Collection<Integer> getRandomCollection(){
        int Low = 0;
        int High = 99;
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            list.add(rnd.nextInt(High - Low) + Low);
        }
        return list;
    }

    private static void sortedInsert(Stack<Integer> stack, Integer element){
        if(stack.empty() || element > stack.peek()){
            stack.push(element);
        } else {
            Integer temp = stack.pop();
            sortedInsert(stack, element);
            stack.push(temp);
        }
    }

    private static void sortStack(Stack<Integer> stack){
        if(!stack.empty()){
            Integer temp = stack.pop();
            System.out.println("Remove element " + temp);
            sortStack(stack);
            System.out.println("Insert now " + temp);
            sortedInsert(stack, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(getRandomCollection());
        System.out.println(stack.toString());

        sortStack(stack);
        System.out.println(stack.toString());
    }
}
