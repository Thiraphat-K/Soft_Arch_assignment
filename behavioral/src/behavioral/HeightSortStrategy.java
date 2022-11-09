package behavioral;


import java.util.Comparator;
import java.util.List;

public class HeightSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2){
                return p1.getHeight().compareTo(p2.getHeight());
            }
        });
    }

}
