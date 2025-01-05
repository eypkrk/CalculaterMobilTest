package calculatepom.test;

import calculatepom.base.BaseTest;
import calculatepom.page.CalculatePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculateTest extends BaseTest {

    CalculatePage calculatePage;

    @BeforeClass
    public void before(){//basetest ile aynı olamaz yoksa null acception döner
        calculatePage = new CalculatePage(getAppiumDriver());
    }

    @Test
    public void test(){
        calculatePage.sumNumbers()
                .minusNumbers()
                .dividedNumbers()
                .multiplyNumbers()
                .percentNumbers()
                .mixProblem();
    }

    @AfterClass
    public void after(){
        teardown();
    }
}
