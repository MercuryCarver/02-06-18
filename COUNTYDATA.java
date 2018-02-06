import java.util.Scanner;
public class COUNTYDATA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner data = new Scanner(System.in);
System.out.println("Put in data for the following categories: County Name, County Population, County Year Established, and County Land Volume");
	String name = data.nextLine();
	int population = data.nextInt();
	int year = data.nextInt();
	int volume = data.nextInt();
	
	COUNTY information = new COUNTY(name, population, year, volume);
	System.out.println(information.CountyName + '\n' + "Population:" + information.CountyPopulation + '\n' + "Established in the year of " + information.CountyYearEstablished + " with a Country Land Volume of " + information.CountyLandVolume);
	}

}
