package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By make = By.xpath("//select[@id='make']/option[@value='Audi']");
	public By model = By.xpath("//select[@id='model']/option[@value='Scooter']");
	public By cylinder = By.xpath("//input[@id='cylindercapacity']");
	public By engine = By.xpath("//input[@id='engineperformance']");
	public By dateManufacture = By.xpath("//input[@id='dateofmanufacture']");
	public By numberSeats = By.xpath("//*[@id=\"numberofseats\"]/option[2]");
	public By rightHandDrive = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span");
	public By numberSeats2 = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[2]");
	public By fuelType = By.xpath("//*[@id=\"fuel\"]/option[2]");
	public By payLoad = By.xpath("//*[@id=\"payload\"]");
	public By totalW = By.xpath("//*[@id=\"totalweight\"]");
	public By listP = By.xpath("//*[@id=\"listprice\"]");
	public By license = By.xpath("//*[@id=\"licenseplatenumber\"]");
	public By annual = By.xpath("//*[@id=\"annualmileage\"]");
	public By next1 = By.xpath("//button[@id='nextenterinsurantdata']");
	
	public By firstN = By.xpath("//input[@name='First Name']");
	public By lastN = By.xpath("//input[@name='Last Name']");
	public By dateB = By.xpath("//input[@name='Date of Birth']");
	public By gender = By.xpath("//*[text()='Male']");
	public By street = By.xpath("//input[@name='Street Address']");
	public By country = By.xpath("//select[@name='Country']/option[@value='Brazil']");
	public By zip = By.xpath("//input[@name='Zip Code']");
	public By city = By.xpath("//input[@name='City']");
	public By occupation = By.xpath("//select[@name='Occupation']/option[@value='Employee']");
	public By hobbies = By.xpath("//label[text()=' Speeding']");
	public By website = By.xpath("//input[@name='Website']");
	public By next2 = By.xpath("//button[@name='Next (Enter Product Data)']");

	public By startData = By.xpath("//input[@name='Start Date']");
	public By insuranceSun = By.xpath("//select[@name='Insurance Sum']/option[@value='3000000']");
	public By meritR = By.xpath("//select[@name='Merit Rating']/option[@value='Super Bonus']");
	public By damageI = By.xpath("//select[@name='Damage Insurance']/option[@value='No Coverage']");
	public By optional = By.xpath("//label[text()='Euro Protection']");
	public By courtesy = By.xpath("//select[@name='Courtesy Car']/option[@value='Yes']");
	public By next3 = By.xpath("//button[@name='Next (Select Price Option)']");
	
	public By selectP = By.xpath("//th[@colspan='4']//label[4]");
	public By next4 = By.xpath("//button[@name='Next (Send Quote)']");          
	
	public By email = By.xpath("//input[@name='E-Mail']");
	public By phone = By.xpath("//input[@name='Phone']");
	public By username = By.xpath("//input[@name='Username']");
	public By passwoard = By.xpath("//input[@name='Password']");
	public By confirmPasswoard = By.xpath("//input[@name='Confirm Password']");
	public By coments = By.xpath("//textarea[@name='Comments']");
	public By btnSend = By.xpath("//button[@name='Send E-Mail']");  
	
			}
