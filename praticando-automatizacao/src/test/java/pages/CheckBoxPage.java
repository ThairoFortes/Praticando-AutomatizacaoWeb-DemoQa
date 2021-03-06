package pages;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class CheckBoxPage {

	SelenideElement checkboxOption = $(By.xpath("//*[@id=\"item-1\"]/span"));
	SelenideElement btnExpand = $(By.xpath("//button[@class='rct-option rct-option-expand-all']"));
	SelenideElement excelFileDocOption = $(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label"));
	SelenideElement mesage1File = $(By.xpath("//*[@id='result']/span[1]"));
	SelenideElement mesage2File = $(By.xpath("//*[@id='result']/span[2]"));

	public void clickCheckboxOption() throws InterruptedException {
		checkboxOption.click();
	}

	public void clickBtnExpand() throws InterruptedException {
		btnExpand.click();
	}

	public void clickExcelFileDocOption() throws InterruptedException {
		$(excelFileDocOption).scrollIntoView(true).click(); // scroll pro elemento ficar no topo e clica
	}

	public void validateMesageSelectFile(String mensagem1, String mensagem2) throws InterruptedException {
		String mesage1 = mesage1File.getText();
		assertEquals(mesage1, mensagem1);

		String mesage2 = mesage2File.getText();
		assertEquals(mesage2, mensagem2);
	}

}
