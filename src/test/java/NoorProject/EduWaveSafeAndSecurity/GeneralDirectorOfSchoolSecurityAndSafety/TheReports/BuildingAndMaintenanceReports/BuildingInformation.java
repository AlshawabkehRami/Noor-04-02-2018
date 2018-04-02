/*
 * Created By Rami Alshawabkeh  3/14/18 2:19 PM
 */

/*
 * Created By Rami Alshawabkeh  3/14/18 2:07 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 1:00 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 12:08 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 12:07 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 12:07 PM
 */

/*
 * Created By Rami Alshawabkeh  3/13/18 12:05 PM
 */

/*
 * Created By Rami Alshawabkeh  3/12/18 2:18 PM
 */
//بيانات المباني

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.TheReports.BuildingAndMaintenanceReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class BuildingInformation {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By ReportsMainMenuLocator = By.id("divMenuItem_325");
    private By SearchBTNLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/ul/li[2]/a/i");
    private By SearchTXTLocator = By.id("myInput");
    private By TheReportLocator = By.linkText("بيانات المباني");
    private By GenderLocator = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlDistrictLocator = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By ddlDistrictSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By btnBackLoactor = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //التقارير_تقارير المباني والصيانة
    //بيانات المباني
    @Test
    public void BuildingInformationReport() throws InterruptedException {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();

        WebElement SearchBTNLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchBTNLocator));
        SearchBTNLocatorWait.click();

        WebElement SearchTXTLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchTXTLocator));
        SearchTXTLocatorWait.sendKeys("بيانات المباني");

        WebElement TheReportLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportLocator));
        TheReportLocatorWait.click();

        WebElement GebderWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocator));
        GebderWait.click();

        browserQA.findElement(GenderSearchLocator).sendKeys("بنين", Keys.ENTER);

        Thread.sleep(2000);
        WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocator));
        ddlDistrictLocatorWait.click();

        browserQA.findElement(ddlDistrictSearchLocator).sendKeys("الحد الغربي", Keys.ENTER);

        try {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocator));
            btnSearchLocatorWait.click();
        } catch (Exception e) {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocator));
            btnSearchLocatorWait.click();
        }

        By ReportTitleLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/table/tbody/tr/td/div");

        WebElement ReportTitleWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactor));
        String TitleForTheReport = browserQA.findElement(ReportTitleLoactor).getText();
        String Title = "بيانات المباني";
        Assert.assertEquals(TitleForTheReport, Title, "التقرير المطلوب غير موجود");

        Thread.sleep(1000);
        browserQA.findElement(btnBackLoactor).click();


    }


}
