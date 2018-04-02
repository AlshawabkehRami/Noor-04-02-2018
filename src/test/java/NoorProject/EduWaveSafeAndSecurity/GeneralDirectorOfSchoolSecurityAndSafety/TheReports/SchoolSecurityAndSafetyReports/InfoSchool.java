/*
 * Created By Rami Alshawabkeh  3/14/18 2:07 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 2:03 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 12:38 PM
 */

//رعد صبيح

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.TheReports.SchoolSecurityAndSafetyReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class InfoSchool {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By ReportMenuItemLoactor = By.id("divMenuItem_325");
    private By SearchLinkLocator = By.id("lisearch_list");
    private By TheRwportLoactor = By.linkText("بيانات المدرسة");
    private By drop_down_sex_Locator = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By txt_male_Locator = By.xpath("/html/body/span/span/span[1]/input");
    private By drop_down_managements_Locator = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By txt_drop_down_managements_Locator = By.xpath("/html/body/span/span/span[1]/input");
    private By education_office_Locator = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By education_office_Locator_txt = By.xpath("/html/body/span/span/span[1]/input");
    private By btn_search_Locator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By Info_Schools_Locator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/div/span/div/table/tbody/tr[5]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[9]/td[3]/table/tbody/tr/td/div/div/span");
    private By btn_back_Locator = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //
//بيانات المدرسة
    @Test
    public void InfoSchoolReport() {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        WebElement reports_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportMenuItemLoactor));
        reports_LocatorWait.click();

        browserQA.findElement(SearchLinkLocator).click();

        WebElement schools_info_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheRwportLoactor));
        schools_info_LocatorWait.click();

        WebElement drop_down_sex_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_sex_Locator));
        drop_down_sex_LocatorWait.click();

        WebElement txt_male_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_male_Locator));
        txt_male_wait.sendKeys("بنين" , Keys.ENTER);

        try {
            WebElement drop_down_managements_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_managements_Locator));
            drop_down_managements_LocatorWait.click();
        } catch (Exception e) {
            WebElement drop_down_managements_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_managements_Locator));
            drop_down_managements_LocatorWait.click();

        }

        WebElement txt_drop_down_managements_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_drop_down_managements_Locator));
        txt_drop_down_managements_LocatorWait.sendKeys("الحد الغربي" , Keys.ENTER);

        try {
            WebElement education_office_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(education_office_Locator));
            education_office_LocatorWait.click();
        } catch (Exception e) {

            WebElement education_office_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(education_office_Locator));
            education_office_LocatorWait.click();


        }

        WebElement education_office_Locator_txtWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(education_office_Locator_txt));
        education_office_Locator_txtWait.sendKeys("مكتب الخالدية" , Keys.ENTER);

        try {
            WebElement btn_search_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_Locator));
            btn_search_LocatorWait.click();
        } catch (Exception e) {
            WebElement btn_search_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_Locator));
            btn_search_LocatorWait.click();
        }


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(Info_Schools_Locator));
        String s = browserQA.findElement(Info_Schools_Locator).getText();
        String Info_schools_2 = "بيانات المدرسة";
        Assert.assertEquals(s , Info_schools_2 , "البيانات غير صحيحة");

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_back_Locator)).click();


    }
}

