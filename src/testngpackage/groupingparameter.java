package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class groupingparameter {
	@Parameters("R")
	@Test
	public void main(String R)
	{
		System.out.println("Value="+R);
	}
	}

