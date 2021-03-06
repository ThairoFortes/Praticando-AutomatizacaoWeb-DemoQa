package pages;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class TextBoxPage {

	SelenideElement elementsOption = $(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]"));
	SelenideElement textboxOption = $(By.id("item-0"));
	SelenideElement fieldName = $(By.id("userName"));
	SelenideElement fieldEmail = $(By.id("userEmail"));
	SelenideElement fieldCurrentAddress = $(By.id("currentAddress"));
	SelenideElement fieldPermanentAddress = $(By.id("permanentAddress"));
	SelenideElement btnSubmit = $(By.id("submit"));
	SelenideElement fieldNameValidate = $(By.id("name"));
	SelenideElement fieldEmailValidate = $(By.id("email"));
	SelenideElement fieldCurrentAddressValidate = $(By.xpath("//*[@id='currentAddress'][@class='mb-1']"));
	SelenideElement fieldPermanentAddressValidate = $(By.xpath("//*[@id='permanentAddress'][@class='mb-1']"));

	public void clickElementsOption() throws InterruptedException {
		elementsOption.click();
	}

	public void clickTextBoxOption() throws InterruptedException {
		textboxOption.click();
	}

	public void setName(String nome) throws InterruptedException {
		fieldName.click();
		fieldName.setValue(nome);
	}

	public void setEmail(String email) throws InterruptedException {
		fieldEmail.click();
		fieldEmail.setValue(email);
	}

	public void setCurrentAddress(String endereco_atual) throws InterruptedException {
		fieldCurrentAddress.click();
		fieldCurrentAddress.setValue(endereco_atual);
	}

	public void setPermanentAddress(String endereco_permanente) throws InterruptedException {
		fieldPermanentAddress.click();
		fieldPermanentAddress.setValue(endereco_permanente);
	}

	public void clickSubmitButton() throws InterruptedException {
		$(btnSubmit).scrollIntoView(true).click(); // scroll que o elemente fica no topo da pagina e clica
	}

	public void validateTextBox(String nome, String email, String endereco_atual, String endereco_permanente)
			throws InterruptedException {
		String Nome = fieldNameValidate.getText();
		assertEquals(Nome, "Name:" + nome);

		String Email = fieldEmailValidate.getText();
		assertEquals(Email, "Email:" + email);

		String EnderecoAtual = fieldCurrentAddressValidate.getText();
		assertEquals(EnderecoAtual, "Current Address :" + endereco_atual);

		String EnderecoPermanente = fieldPermanentAddressValidate.getText();
		assertEquals(EnderecoPermanente, "Permananet Address :" + endereco_permanente);
	}

}
