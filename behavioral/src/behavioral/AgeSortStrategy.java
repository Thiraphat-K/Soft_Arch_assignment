package behavioral;

import java.util.Comparator;
import java.util.List;

public class AgeSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2){
                return p1.getAge().compareTo(p2.getAge());
            }
        });
    }

}
