/*
 * Created By Rami AlShawabkeh 3/29/18 2:29 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.waitQA;

public class ExternalItems {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By SearchLoactor = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By BTNSectionsLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnSections");
    private By ExternalItemsLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
    private By BTNBack1 = By.id("ctl00_PlaceHolderMain_ibtnBack");
    private By BTNBack2 = By.id("ctl00_PlaceHolderMain_ibtnBack");

//عرض اقسام الاستمارة/البنود الخارجية
    @Test
    public void ViewExternalItems() throws InterruptedException {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

        //for (int i = 0; i < 5; i++) {
        WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait.click();

        Thread.sleep(1000);
        WebElement SearchLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLoactor));
        SearchLoactorWait.click();

        WebElement BTNSectionsLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSectionsLocator));
        BTNSectionsLocatorWait.click();

        WebElement ExternalItemsLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalItemsLocator));
        ExternalItemsLocatorWait.click();

        WebElement BTNBackWait1 = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBack1));
        BTNBackWait1.click();

        WebElement BTNBackWait2 = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBack2));
        BTNBackWait2.click();



       // }
    }
}
