package calculator;

public class Add implements Operate {

	@Override
	public Double getResults(Double... numbers) {
		double sum=0.0;
		for(Double num : numbers)
		{
			sum+=num;
		}
		return sum;
	}

}
