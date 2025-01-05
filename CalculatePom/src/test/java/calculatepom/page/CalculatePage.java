package calculatepom.page;

import calculatepom.base.BasePage;
import io.appium.java_client.AppiumDriver;
import static calculatepom.constants.Constants.*;

public class CalculatePage extends BasePage {
    AppiumDriver driver;

    public CalculatePage(AppiumDriver driver){
        super(driver);
    }

    public CalculatePage sumNumbers(){
        //click(closeAdvert2);
        click(numberOne);
        click(numberZero);
        click(plus);
        click(numberTwo);
        click(numberZero);
        click(result);
        System.out.println(getTetxt(resultView));
        return this;
    }

    public CalculatePage minusNumbers(){
        click(clearButton);
        click(numberOne);
        click(numberZero);
        click(numberZero);
        click(minus);
        click(numberEight);
        click(numberZero);
        click(result);
        System.out.println(getTetxt(resultView));
        return this;
    }

    public CalculatePage dividedNumbers(){
        click(clearButton);
        click(numberThree);
        click(numberZero);
        click(numberZero);
        click(divided);
        click(numberFour);
        click(result);
        System.out.println(getTetxt(resultView));
        return this;
    }

    public CalculatePage multiplyNumbers(){
        click(clearButton);
        click(numberFive);
        click(numberSix);
        click(multiply);
        click(numberSeven);
        click(numberEight);
        click(result);
        System.out.println(getTetxt(resultView));
        return this;
    }

    public CalculatePage percentNumbers(){
        click(clearButton);
        click(numberNine);
        click(numberZero);
        click(plus);
        click(numberOne);
        click(numberTwo);
        click(minus);
        click(numberFive);
        click(multiply);
        click(numberThree);
        click(divided);
        click(numberNine);
        click(percent);
        click(result);
        System.out.println(getTetxt(resultView));
        return this;
    }

    public CalculatePage mixProblem(){
        click(clearButton);
        click(leftBracket);
        click(numberOne);
        click(numberTwo);
        click(multiply);
        click(leftBracket);
        click(numberFive);
        click(plus);
        click(numberThree);
        click(rightBracket);
        click(rightBracket);
        click(minus);
        click(numberNine);
        click(numberSeven);
        click(divided);
        click(numberTwo);
        click(backSpace);
        click(numberSix);
        click(result);
        System.out.println(getTetxt(resultView));
        return this;
    }
}
