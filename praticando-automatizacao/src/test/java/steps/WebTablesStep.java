package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.WebTablesPage;

public class WebTablesStep {

	WebTablesPage wt = new WebTablesPage();

	@Quando("escolher a opção Web Tables")
	public void escolherAOpçãoWebTables() throws InterruptedException {
		wt.clickWebtablesOption();
	}

	@E("clicar no botão para adicionar um registro")
	public void clicarNoBotãoParaAdicionarUmRegistro() throws InterruptedException {
		wt.clickButtonAdd();
	}

	@E("preencher o campo primeiro nome {string}")
	public void preencherOCampoPrimeiroNome(String primeiro_nome) throws InterruptedException {
		wt.setFirstName(primeiro_nome);
	}

	@E("preencher o campo ultimo_nome {string}")
	public void preencherOCampoUltimoNome(String ultimo_nome) throws InterruptedException {
		wt.setLastName(ultimo_nome);
	}

	@E("preencher o campo email {string}")
	public void preencherOCampoEmail(String email) throws InterruptedException {
		wt.setEmail(email);
	}

	@E("preencher o campo idade {string}")
	public void preencherOCampoIdade(String idade) throws InterruptedException {
		wt.setAge(idade);
	}

	@E("preencher o campo salario {string}")
	public void preencherOCampoSalario(String salario) throws InterruptedException {
		wt.setSalary(salario);
	}

	@E("preencher o campo departamento {string}")
	public void preencherOCampoDepartamento(String departamento) throws InterruptedException {
		wt.setDepartment(departamento);
	}

	@E("clicar no botão para salvar o registro")
	public void clicarNoBotãoParaSalvarORegistro() throws InterruptedException {
		wt.clickSubmitButton();
	}

	@Então("o registro salvo é encontrado na tabela de resultados {string}, {string}, {string}, {string}, {string} e {string}")
	public void oRegistroSalvoÉEncontradoNaTabelaDeResultados(String primeiro_nome, String ultimo_nome, String email,
			String idade, String salario, String departamento) throws InterruptedException {
		wt.validateAdd(primeiro_nome, ultimo_nome, idade, email, salario, departamento);
	}

	/*****************************************************/

	@E("clicar no botão para editar esse registro")
	public void clicarNoBotãoParaEditarEsseRegistro() throws InterruptedException {
		wt.clickEditButton();
	}

	/******************************************************/

	@E("clicar no botão para excluir esse registro")
	public void clicarNoBotãoParaExcluirEsseRegistro() throws InterruptedException {
		wt.clickDeleteButton();
	}

	@Então("o registro excluído não é encontrado na tabela de resultados {string}, {string}, {string}, {string}, {string} e {string}")
	public void oRegistroExcluídoNãoÉEncontradoNaTabelaDeResultadosE(String primeiro_nome, String ultimo_nome,
			String email, String idade, String salario, String departamento) throws InterruptedException {
		wt.validateDelete(primeiro_nome, ultimo_nome, idade, email, salario, departamento);
	}

	/******************************************************/

	@E("pesquiar por {string}")
	public void pesquiarPor(String primeiro_nome) throws InterruptedException {
		wt.setSearchField(primeiro_nome);
	}

	@Então("o registro é encontrado na pesquisa {string}, {string}, {string}, {string}, {string} e {string}")
	public void oRegistroÉEncontradoNaPesquisaE(String primeiro_nome, String ultimo_nome,
			String email, String idade, String salario, String departamento) throws InterruptedException {
		wt.validateSearch(primeiro_nome, ultimo_nome, idade, email, salario, departamento);
	}

}
