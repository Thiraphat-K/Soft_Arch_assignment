package behavioral;

import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2){
                return p1.getWeight().compareTo(p2.getWeight());
            }
        });
    }
}
