package CollectionFramework;
import java.util.Stack;
public class LearnStack
{
public static void main(String[] args){
    Stack<String> names=new Stack<>();
    names.push("waseem");
    names.push("malav");
    names.push("aamir");

    names.push("vimal");
    System.out.println("stack "+names);
    for(int i=0;i<names.size();i++){
        System.out.println("elements are "+names.get(i));
    }
    System.out.println(names.peek());
//    names.clear();
    System.out.println(names.pop());
    System.out.println(names);
    System.out.println(names.removeFirst());
    System.out.println(names.removeLast());

}
}


