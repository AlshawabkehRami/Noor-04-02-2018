
/*
 * Created By Rami Alshawabkeh  3/14/18 2:07 PM
 */

/*
 * Created By Rami Alshawabkeh  3/12/18 10:04 AM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.TheReports.SchoolReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

//توزيع الطلاب على الفصول

public class DistributeStudentsToClasses {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By ReportsMainMenuLocator = By.id("divMenuItem_325");
    private By SearchLinkLocator = By.id("lisearch_list");
    private By TheReportLocator = By.linkText("توزيع الطلاب على الفصول");
    private By ddlLearningGenderLocator = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By ddlLearningGenderSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlDistrictLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/span[1]/span[1]/span/span[2]");
    private By ddlDistrictSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlStudylevelLocator = By.id("select2-ctl00_PlaceHolderMain_ddlStudylevel-container");
    private By ddlStudylevelSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlSchoolCategorizationLocator = By.id("select2-ctl00_PlaceHolderMain_ddlSchoolCategorization-container");
    private By ddlSchoolCategorizationSearchLoactor = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");


    //التقارير_تقارير المدارس
    //توزيع الطلاب على الفصول
    @Test
    public void ViewDistributeStudentsToClassesReport() {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        // for (int i = 0; i < 20; i++) {
        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();


        browserQA.findElement(SearchLinkLocator).click();

        WebElement DistributeStudentsToClassesReportLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportLocator));
        DistributeStudentsToClassesReportLocatorWait.click();

        WebElement ddlLearningGenderWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGenderLocator));
        ddlLearningGenderWait.click();
        browserQA.findElement(ddlLearningGenderSearchLocator).sendKeys("بنين" , Keys.ENTER);


        try {
            WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocator));
            ddlDistrictLocatorWait.click();
        } catch (Exception e) {
            WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocator));
            ddlDistrictLocatorWait.click();
        }

        WebElement ddlDistrictSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictSearchLocator));
        ddlDistrictSearchLocatorWait.sendKeys("الحد الغربي" , Keys.ENTER);


        try {
            WebElement ddlStudylevelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelLocator));
            ddlStudylevelLocatorWait.click();
        } catch (Exception e) {

            WebElement ddlStudylevelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelLocator));
            ddlStudylevelLocatorWait.click();
        }

        browserQA.findElement(ddlStudylevelSearchLocator).sendKeys("الثانوية" , Keys.ENTER);


        try {
            WebElement ddlSchoolCategorizationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationLocator));
            ddlSchoolCategorizationLocatorWait.click();
        } catch (Exception e) {
            WebElement ddlSchoolCategorizationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationLocator));
            ddlSchoolCategorizationLocatorWait.click();
        }
        browserQA.findElement(ddlSchoolCategorizationSearchLoactor).sendKeys("حكومي" , Keys.ENTER);

        try {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocator));
            btnSearchLocatorWait.click();
        } catch (Exception e) {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocator));
            btnSearchLocatorWait.click();
        }


        // }


    }


}
