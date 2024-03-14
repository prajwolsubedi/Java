import java.util.ArrayList;

public class Array {
    public static void main(String args[]){
        ArrayList<String> name = new ArrayList<String>();
        name.add("Prajwol");
        name.add("Ranish");

        name.set(0,"Sahin");
        name.add(2,"prajwol");
        name.remove(1);
        name.clear();

        for(int i=0; i<name.size(); i++){
            System.out.println(name.get(i));
        }


        //2d array

        ArrayList<String> books = new ArrayList<String>();
        books.add("Atomic Habits");
        books.add("Dale Carnegie");

        ArrayList<String> ratings = new ArrayList<String>();
        ratings.add("very good");
        ratings.add("good");

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        result.add(books);
        result.add(ratings);

        System.out.println(result);


        System.out.println(books.get(1));

    }
}
