/*
 * Created By Rami Alshawabkeh  3/14/18 2:14 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.MyProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class MyProfile {


    private By my_profile_link_Locator = By.xpath("/html/body/form/div[6]/div/div[1]/div/ul/li[1]/a");
    private By change_password_Locator = By.id("ctl00_PlaceHolderMain_lbtnChangePassword");
    private By btn_cancel_Locator = By.id("ctl00_PlaceHolderMain_ibtnCancel");


    @Test
    public void MyProfileClick() {

        browserQA.findElement(my_profile_link_Locator).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(change_password_Locator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_cancel_Locator)).click();
    }

}

