public class Fb {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Facebook login or signup");
	}
	
	
	
	@Test
	public void verifyRadiobtn(WebElement ele)
	{
		System.out.println("check radio button");
	}
	
	@Test
	public void verifyUrl1()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	
	@Test
	public void verifyCheckbox(int a, int b)
	{
		System.out.println("check box");
	}
	
	@Test
	public void verifyDropdown()
	{
		System.out.println("dropdownhanlding");
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
