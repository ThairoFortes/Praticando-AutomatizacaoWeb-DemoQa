package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class ButtonsPage {

	SelenideElement buttonsOption = $(By.id("item-4"));

	public void clickButtonsOption() throws InterruptedException {
		$(buttonsOption).scrollIntoView(true).click();
	}

}
