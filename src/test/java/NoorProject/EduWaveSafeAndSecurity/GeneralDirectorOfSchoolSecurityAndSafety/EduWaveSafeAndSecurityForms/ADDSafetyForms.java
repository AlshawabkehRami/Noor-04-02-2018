/*
 * Created By Rami Alshawabkeh  3/18/18 11:06 AM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class ADDSafetyForms {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FromDayFooterLocator = By.xpath("/html/body/div/table/tbody/tr[4]/td[2]");
    private By ToDayFooterLocator = By.xpath("/html/body/div/table/tbody/tr[5]/td[1]");
    private By AddValidationMessageLoactor = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

    @Test
    public void AddForms() throws InterruptedException {


        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserLabelLocatorWait.click();

        WebElement FormMainMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait.click();

       // for (int i = 0; i < 50; i++) {

            List<WebElement> Paging = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/table[1]/tbody/tr[23]/td/table/tbody/tr/td"));
            int PagingPrametre = Paging.size();

            System.out.println("NumberOfThePages::" + PagingPrametre);

            By Paginglink = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/table[1]/tbody/tr[23]/td/table/tbody/tr/td[" + PagingPrametre + "]/a");

            WebElement PaginglinkWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(Paginglink));
            PaginglinkWait.click();
            Thread.sleep(1000);

            List NumberOfRows = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
            int TableSize = NumberOfRows.size();

            System.out.println("NumberOfRows::" + TableSize);

            String TableSizeParameterADD = String.format("%02d" , TableSize);

            System.out.println("NumberOfRowsAfterEditing::" + String.format("%02d" , TableSize));

            //int AddParametre = Integer.parseInt(TableSizeParameterADD);
            //System.out.println("Parametre" + AddParametre);

            By AddFormDescLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + TableSizeParameterADD + "_tbAddFormDesc");


            Random Rand = new Random();
            int RandomNumber = Rand.nextInt(1000000);

            Thread.sleep(2000);
            WebElement AddFormDescLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormDescLocator));
            AddFormDescLocatorWait.sendKeys("Rami" + RandomNumber);

            By FromDateFooterLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + TableSizeParameterADD + "_clrFromDateFooter_ibtnOpenCalendar");
            WebElement FromDateFooterLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDateFooterLocator));
            FromDateFooterLocatorWait.click();

            WebElement FromDayFooterLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDayFooterLocator));
            FromDayFooterLocatorWait.click();

            By ToDateFooterLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + TableSizeParameterADD + "_clrToDateFooter_ibtnOpenCalendar");

            WebElement ToDateFooterLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ToDateFooterLocator));
            ToDateFooterLocatorWait.click();

            WebElement ToDayFooterLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ToDayFooterLocator));
            ToDayFooterLocatorWait.click();

            By AddLinkLOcator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + TableSizeParameterADD + "_lbtnAddFormDesc");
            WebElement AddLinkLOcatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLOcator));
            AddLinkLOcatorWait.click();

            WebElement AddValidationMessageLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddValidationMessageLoactor));

            String AddValidationMessageLoactorString = browserQA.findElement(AddValidationMessageLoactor).getText();
            String message = "تم إضافة النموذج بنجاح";

            Assert.assertEquals(message , AddValidationMessageLoactorString , "لم تتم الاضافة بنجاح");


          //Thread.sleep(2000);

         // browserQA.findElement(By.xpath("/html/body/form/div[6]/div/div[1]/div/ul/li[6]/a")).click();



        }

    }






