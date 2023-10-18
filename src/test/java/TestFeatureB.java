import org.testng.Assert;
import org.testng.annotations.*;

public class TestFeatureB {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Dieksekusi dari before suite B");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Dieksekusi dari after suite B");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Dieksekusi dari before test B");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Dieksekusi dari after test B");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Dieksekusi dari before method B");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Dieksekusi dari after method B");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Dieksekusi dari before class B");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Dieksekusi dari after class B");
    }



    @Test
    public void testPenjumlahan() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Dieksekusi dari tes penjumlahan B");
        Assert.assertEquals(2+2, 4);
    }

    @Test
    public void testPengurangan() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Dieksekusi dari tes pengurangan B");
        Assert.assertEquals(7 - 2, 5);
    }

}
