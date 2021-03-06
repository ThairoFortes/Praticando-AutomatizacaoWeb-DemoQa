package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.RadioButtonPage;

public class RadioButtonStep {

	RadioButtonPage rb = new RadioButtonPage();

	@Quando("escolher a opção Radio Button")
	public void escolherAOpçãoRadioButton() throws InterruptedException {
		rb.clickRadiobuttonOption();
	}

	@E("selecionar a opção Yes")
	public void selecionarAOpçãoYes() throws InterruptedException {
		rb.clickYesOption();
	}
	
	@Então("a mensagem {string} é exibida")
	public void aMensagemÉApresentada(String mensagem) throws InterruptedException {
		rb.validateYesOption(mensagem);
	}

}
