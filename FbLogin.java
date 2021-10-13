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
	public void verifyRadiobtn()
	{
		System.out.println("check radio button");
	}
	
	@Test
	public void verifyUrl1()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	
	@Test
	public void verifyCheckbox()
	{
		System.out.println("check box");
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
