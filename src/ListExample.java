import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList(10);
        list.add(100);
 //       list.add("INFP");

        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
