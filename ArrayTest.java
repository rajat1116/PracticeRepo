import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<Integer>();

        //Adding
        number.add(10);
        number.add(100);
        number.add(40);

        //Output
        System.out.println(number.get(0));

        System.out.println("Iteration #1: ");
        for(int i = 0;i < number.size(); i++){
            System.out.println(number.get(i));
        }

        number.remove(number.size()-1); //Remove items

        number.remove(0); //very slow

        System.out.println("Iteration #2");
        for(Integer value : number){
            System.out.println(value);
        }
        //list interface...
        List<String> values = new ArrayList<String>();


    }
}
