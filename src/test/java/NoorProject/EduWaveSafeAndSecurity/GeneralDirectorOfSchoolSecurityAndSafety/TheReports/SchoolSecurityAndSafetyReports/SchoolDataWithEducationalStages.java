/*
 * Created By Rami Alshawabkeh  3/14/18 2:07 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 2:03 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 12:33 PM
 */
//رعد صبيح

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.TheReports.SchoolSecurityAndSafetyReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class SchoolDataWithEducationalStages {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By ReportMenuItemLoactor = By.id("divMenuItem_325");

    private By SearchLinkLocator = By.id("lisearch_list");
    private By TheReportNameLocator = By.linkText("بيانات المدرسة مع المراحل التعليمية");

    private By DDLGenderLocator = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLDistrictLocator = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By DistrictSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By OfficeLocator = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By OfficeSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By btn_search_Locator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By btn_back_Locator = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //
//بيانات المدرسة مع المراحل التعليمية
    @Test
    public void SchoolDataWithEducationalStagesReport() throws InterruptedException {

        WebElement switch_profie_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        switch_profie_LocatorWait.click();

        WebElement general_manager_link_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        general_manager_link_LocatorWait.click();

        WebElement reports_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportMenuItemLoactor));
        reports_LocatorWait.click();

        browserQA.findElement(SearchLinkLocator).click();

        WebElement TheReportNameLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocator));
        TheReportNameLocatorWait.click();




        WebElement ddlLearningGender_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLGenderLocator));
        ddlLearningGender_LocatorWait.click();

        WebElement GenderSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLocator));
        GenderSearchLocatorWait.sendKeys("بنين" , Keys.ENTER);

        try {
            WebElement DDLDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocator));
            DDLDistrictLocatorWait.click();
        } catch (Exception e) {
            WebElement DDLDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocator));
            DDLDistrictLocatorWait.click();
        }

        WebElement DistrictSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DistrictSearchLocator));
        DistrictSearchLocatorWait.sendKeys("الحد الغربي" , Keys.ENTER);

        Thread.sleep(1000);
        WebElement OfficeLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(OfficeLocator));
        OfficeLocatorWait.click();

        WebElement OfficeSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(OfficeSearchLocator));
        OfficeSearchLocatorWait.sendKeys("الخالدية" , Keys.ENTER);


        Thread.sleep(1000);
        WebElement btn_search_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_Locator));
        btn_search_LocatorWait.click();


    }

}
