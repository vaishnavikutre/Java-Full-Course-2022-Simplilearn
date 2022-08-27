package calculator;

public class Substract implements Operate {

	@Override
	public Double getResults(Double... numbers) {
		double res=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			res-=numbers[i];
		}
		return res;
	}

}
