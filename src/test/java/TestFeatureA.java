import org.testng.Assert;
import org.testng.annotations.*;

public class TestFeatureA {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Dieksekusi dari before suite A");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Dieksekusi dari after suite A");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Dieksekusi dari before test A");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Dieksekusi dari after test A");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Dieksekusi dari before method A");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Dieksekusi dari after method A");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Dieksekusi dari before class A");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Dieksekusi dari after class A");
    }



    @Test
    public void testPenjumlahan() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Dieksekusi dari tes penjumlahan A");
        Assert.assertEquals(2+2, 4);
    }

    @Test
    public void testPengurangan() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Dieksekusi dari tes pengurangan A");
        Assert.assertEquals(7 - 2, 5);
    }

}
