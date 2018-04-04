/*
 * Created By Rami Al Shawabkeh 4/3/18 11:34 AM
 */

/*
 * Created By Rami Al Shawabkeh 4/3/18 10:23 AM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.ExternalItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class AddExternalItems {


    @Test

    public void addExternalItems() {


//
//        By ExternalLikLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
//
//        browserQA.findElement(ExternalLikLocator).click();
//
//
//
//        // for (int i = 0; i < 20; i++) {
//        List TabelSizeList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
//
//        int TabelSizeInt = TabelSizeList.size();
//
//
//        System.out.println("TabelSizeIntEX::" + TabelSizeInt);
//
//
//        if (TabelSizeInt == 1) {
//
//
//            int TableSizeAdd = TabelSizeList.size() + 2;
//            String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
//
//            System.out.println("TableSizeAddEX::" + TableSizeAdd);
//            System.out.println("TableSizeAddFormatEX::" + TableSizeAddFormat);
//
//            By EXItemDescLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
//
//            Random rand = new Random();
//            int randnum = rand.nextInt(1000);
//
//            Thread.sleep(1000);
//
//            WebElement EXItemDescLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(EXItemDescLocator));
//            EXItemDescLocatorWait.sendKeys("Rami" + randnum);
//
//            By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
//
//            WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator));
//            AddLinkLocatorWait.click();
//
//            By MessageLoctor = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
//
//            WebElement MessageLoctorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageLoctor));
//
//            String ActualResult = browserQA.findElement(MessageLoctor).getText();
//            String ExpectedResult = "تم إضافة البند الخارجي بنجاح.";
//
//            Assert.assertEquals(ActualResult , ExpectedResult , "تم إضافة البند  الخارجي بنجاح");
//        } else {
//
//
//            int TableSizeAdd = TabelSizeList.size() + 1;
//            String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
//
//            System.out.println("TableSizeAddEX::" + TableSizeAdd);
//            System.out.println("TableSizeAddFormatEX::" + TableSizeAddFormat);
//
//            By EXItemDescLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
//
//            Random rand = new Random();
//            int randnum = rand.nextInt(1000);
//
//            Thread.sleep(1000);
//
//            try {
//                WebElement EXItemDescLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(EXItemDescLocator));
//                EXItemDescLocatorWait.sendKeys("Rami" + randnum);
//            } catch (Exception e) {
//                WebElement EXItemDescLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(EXItemDescLocator));
//                EXItemDescLocatorWait.sendKeys("Rami" + randnum);
//            }
//
//            By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
//
//            WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator));
//            AddLinkLocatorWait.click();
//
//            By MessageLoctor = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
//
//            WebElement MessageLoctorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageLoctor));
//
//            String ActualResult = browserQA.findElement(MessageLoctor).getText();
//            String ExpectedResult = "تم إضافة البند الخارجي بنجاح.";
//
//            Assert.assertEquals(ActualResult , ExpectedResult , "تم إضافة البند  الخارجي بنجاح");
//            // }


        }


    }
