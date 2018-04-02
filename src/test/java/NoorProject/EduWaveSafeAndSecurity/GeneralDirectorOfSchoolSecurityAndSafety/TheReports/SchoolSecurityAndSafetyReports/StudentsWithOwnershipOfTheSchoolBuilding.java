/*
 * Created By Rami Alshawabkeh  3/14/18 2:07 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 4:26 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.TheReports.SchoolSecurityAndSafetyReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class StudentsWithOwnershipOfTheSchoolBuilding {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By ReportMenuItemLoactor = By.id("divMenuItem_325");
    private By SearchLinkLocator = By.id("lisearch_list");
    private By TheRwportLoactor = By.linkText("عدد الطلاب مع ملكية مبنى المدرسة");
    private By GenderLocator = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By Femalelocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlDistrictLocator = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By ddlDistrictSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlSupervisionCenteLocator = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By ddlSupervisionCenteSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ibtnSearchLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");


    @Test
    public void StudentsWithOwnershipOfTheSchoolBuildingReport() throws InterruptedException {


        browserQA.findElement(SwitchProfileLocator).click();
        browserQA.findElement(UserNameLabelLocator).click();

        //for (int i=0;i<10;i++) {
        browserQA.findElement(ReportMenuItemLoactor).click();

        browserQA.findElement(SearchLinkLocator).click();

        WebElement TheRwportLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheRwportLoactor));
        TheRwportLoactorWait.click();

        WebElement GenderLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocator));
        GenderLocatorWait.click();
        browserQA.findElement(Femalelocator).sendKeys("بنات" , Keys.ENTER);


        try {
            WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocator));
            ddlDistrictLocatorWait.click();
        } catch (Exception e) {
            WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocator));
            ddlDistrictLocatorWait.click();
        }

        browserQA.findElement(ddlDistrictSearchLocator).sendKeys("عمان" , Keys.ENTER);

        Thread.sleep(1000);
        try {
            WebElement ddlSupervisionCenteLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSupervisionCenteLocator));
            ddlSupervisionCenteLocatorWait.click();
        } catch (Exception e) {
            WebElement ddlSupervisionCenteLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSupervisionCenteLocator));
            ddlSupervisionCenteLocatorWait.click();
        }

        browserQA.findElement(ddlSupervisionCenteSearchLocator).sendKeys("عمان" , Keys.ENTER);

        Thread.sleep(1000);
        WebElement ibtnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ibtnSearchLocator));
        ibtnSearchLocatorWait.click();

        By ReportTitleInsidLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");

        WebElement ReportTitleInsidLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleInsidLoactor));

        String ReportTitleInsidLoactorElement = browserQA.findElement(ReportTitleInsidLoactor).getText();
        String ReportTitleInsidString = " عدد الطلاب مع ملكية مبنى المدرسة";

        Assert.assertEquals(ReportTitleInsidLoactorElement , ReportTitleInsidString , "لايمكن عرض التقرير المطلوب");
        //}

    }
}

