package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CheckBoxPage;

public class CheckBoxStep {
	
	CheckBoxPage cb = new CheckBoxPage();

	@Quando("escolher a opção Check Box")
	public void escolherAOpçãoCheckBox() throws InterruptedException {
		cb.clickCheckboxOption();
	}

	@E("expandir a árvore do diretório")
	public void expandirAÁrvoreDoDiretório() throws InterruptedException {
		cb.clickBtnExpand();
	}

	@E("selecionar check box do arquivo Excel File.doc")
	public void selecionarCheckBoxDoArquivo() throws InterruptedException {
		cb.clickExcelFileDocOption();
	}

	@Então("a mensagem {string} {string} é apresentada")
	public void aMensagemÉApresentada(String mensagem1, String mensagem2) throws InterruptedException {
		cb.validateMesageSelectFile(mensagem1, mensagem2);
	}

}
