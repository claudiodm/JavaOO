import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //ForEach
        list.forEach(n -> System.out.println(n));
        System.out.println("-------------------------");

//        //RemoveIF
//        list.removeIf(n -> n%2==0);
//        list.forEach(n-> System.out.println(n));
//        System.out.println("-------------------------");
//
//        //ReplaceAll
//        list.replaceAll(n->n*2);
//        list.forEach(n-> System.out.println(n));
//        System.out.println("-------------------------");

        HashMap<Integer, String> map = new HashMap<>();
        list.forEach(n-> map.put(n,"teste"));
        map.forEach((x,y)-> System.out.println(x + y));
        System.out.println("-------------------------");

        //Merge
        map.merge(6, "teste", (x , y)-> x);
        map.forEach((x,y)-> System.out.println(x + y));
        System.out.println("-------------------------");

        //ReplaceALL
        map.replaceAll((x,y)-> y + " shit");
        map.forEach((x,y)-> System.out.println(x + y));

    }
}