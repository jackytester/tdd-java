package tddjavanewbie;

public class Sum {

	public int calculate(int... numbers) {
		int result = 0;
		for (int n : numbers) result += n;
		return result;
	}

}
