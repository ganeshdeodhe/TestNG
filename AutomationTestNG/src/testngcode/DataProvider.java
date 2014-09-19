package testngcode;

import org.testng.annotations.Test;

public class DataProvider {
  
	@Test(dataProvider="movieList")
  public void PrintMovie(String mv, String act, String actr) {
  
	System.out.println("Movie List : "+mv+","+"act"+","+actr);
	}
@org.testng.annotations.DataProvider(name="movieList")
public Object[][] list(){
	Object[][] movies=new Object[3][3];
	
	movies[0][0]="Robot";
	movies[0][1]="Ranjnikanth";
	movies[0][2]="Ashwarya";
	
	movies[1][0]="Welcome";
	movies[1][1]="Akshay K";
	movies[1][2]="Kaitrina";

	movies[2][0]="DDLJ";
	movies[2][1]="Ajay D";
	movies[2][2]="Kajol";

	return movies;
}
}



