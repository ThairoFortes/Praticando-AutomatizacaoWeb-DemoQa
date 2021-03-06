package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.TextBoxPage;

public class TextBoxStep {

	TextBoxPage tb = new TextBoxPage();

	@Dado("que o usuário clique na opção Elements")
	public void queOUsuárioCliqueNaOpçãoElements() throws InterruptedException {
		tb.clickElementsOption();
	}

	@Quando("escolher a opção Text Box")
	public void escolherAOpçãoTextBox() throws InterruptedException {
		tb.clickTextBoxOption();
	}

	@E("preencher o nome completo {string}")
	public void preencherONomeCompleto(String nome) throws InterruptedException {
		tb.setName(nome);
	}

	@E("preencher o email {string}")
	public void preencherOEmail(String email) throws InterruptedException {
		tb.setEmail(email);
	}

	@E("preencher o endereço atual {string}")
	public void preencherOEndereçoAtual(String endereco_atual) throws InterruptedException {
		tb.setCurrentAddress(endereco_atual);
	}

	@E("preencher o endereço permanente {string}")
	public void preencherOEndereçoPermanente(String endereco_permanente) throws InterruptedException {
		tb.setPermanentAddress(endereco_permanente);
	}

	@E("clicar no botão para enviar o retório")
	public void clicarNoBotãoParaEnviarORetório() throws InterruptedException {
		tb.clickSubmitButton();
	}

	@Então("é apresentado o que foi preenchido {string}, {string}, {string}, {string}")
	public void éApresentadoOQueFoiPreenchido(String string, String string2, String string3, String string4) {
		
	}

}
