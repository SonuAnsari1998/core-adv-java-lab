package jan_01_2026_Collection_Comparable_Comparator;
import module java.base;

public record Employee(Integer id, String name, Double salry) implements Comparable<Employee>{

	@Override
	public int compareTo(Employee e2) {
		return this.id.compareTo(e2.id());
	}
}

