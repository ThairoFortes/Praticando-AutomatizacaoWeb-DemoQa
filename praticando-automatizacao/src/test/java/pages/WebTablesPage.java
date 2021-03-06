package pages;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class WebTablesPage {

	SelenideElement webtablesOption = $(By.xpath("//*[@id=\"item-3\"]/span"));
	SelenideElement buttonAdd = $(By.id("addNewRecordButton"));
	SelenideElement fieldFirstName = $(By.id("firstName"));
	SelenideElement fieldLastName = $(By.id("lastName"));
	SelenideElement fieldEmail = $(By.id("userEmail"));
	SelenideElement fieldAge = $(By.id("age"));
	SelenideElement fieldSalary = $(By.id("salary"));
	SelenideElement fieldDepartment = $(By.id("department"));
	SelenideElement btnSubmit = $(By.id("submit"));
	SelenideElement fieldFirstNameTable = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div/div[1]"));
	SelenideElement fieldLastNameTable = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div/div[2]"));
	SelenideElement fieldAgeTable = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div/div[3]"));
	SelenideElement fieldEmailTable = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div/div[4]"));
	SelenideElement fieldSalaryTable = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div/div[5]"));
	SelenideElement fieldDepartmentTable = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div/div[6]"));
	SelenideElement btnEdit = $(By.id("edit-record-4"));
	SelenideElement btnDelete = $(By.id("delete-record-4"));
	SelenideElement fieldSearch = $(By.id("searchBox"));
	SelenideElement fieldFirstNameTableSearch = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]"));
	SelenideElement fieldLastNameTableSearch = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[2]"));
	SelenideElement fieldAgeTableSearch = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[3]"));
	SelenideElement fieldEmailTableSearch = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[4]"));
	SelenideElement fieldSalaryTableSearch = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[5]"));
	SelenideElement fieldDepartmentTableSearch = $(
			By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[6]"));

	public void clickWebtablesOption() throws InterruptedException {
		$(webtablesOption).scrollIntoView(true).click();
	}

	public void clickButtonAdd() throws InterruptedException {
		buttonAdd.click();
	}

	public void setFirstName(String primeiro_nome) throws InterruptedException {
		fieldFirstName.click();
		fieldFirstName.setValue(primeiro_nome);
	}

	public void setLastName(String ultimo_nome) throws InterruptedException {
		fieldLastName.click();
		fieldLastName.setValue(ultimo_nome);
	}

	public void setEmail(String email) throws InterruptedException {
		fieldEmail.click();
		fieldEmail.setValue(email);
	}

	public void setAge(String idade) throws InterruptedException {
		fieldAge.click();
		fieldAge.setValue(idade);
	}

	public void setSalary(String salario) throws InterruptedException {
		fieldSalary.click();
		fieldSalary.setValue(salario);
	}

	public void setDepartment(String departamento) throws InterruptedException {
		fieldDepartment.click();
		fieldDepartment.setValue(departamento);
	}

	public void clickSubmitButton() throws InterruptedException {
		btnSubmit.click();
	}

	public void validateAdd(String primeiro_nome, String ultimo_nome, String idade, String email, String salario,
			String departamento) throws InterruptedException {
		String validateFirstName = fieldFirstNameTable.getText();
		assertEquals(validateFirstName, primeiro_nome);

		String validateLastName = fieldLastNameTable.getText();
		assertEquals(validateLastName, ultimo_nome);

		String validateAge = fieldAgeTable.getText();
		assertEquals(validateAge, idade);

		String validateEmail = fieldEmailTable.getText();
		assertEquals(validateEmail, email);

		String validateSalary = fieldSalaryTable.getText();
		assertEquals(validateSalary, salario);

		String validateDepartment = fieldDepartmentTable.getText();
		assertEquals(validateDepartment, departamento);
	}

	public void clickEditButton() throws InterruptedException {
		btnEdit.click();
	}

	public void clickDeleteButton() throws InterruptedException {
		btnDelete.click();
	}

	public void validateDelete(String primeiro_nome, String ultimo_nome, String email, String idade, String salario,
			String departamento) throws InterruptedException {

		String validateFirstName = fieldFirstNameTable.getText();
		assertNotEquals(validateFirstName, primeiro_nome);

		String validateLastName = fieldLastNameTable.getText();
		assertNotEquals(validateLastName, ultimo_nome);

		String validateAge = fieldAgeTable.getText();
		assertNotEquals(validateAge, idade);

		String validateEmail = fieldEmailTable.getText();
		assertNotEquals(validateEmail, email);

		String validateSalary = fieldSalaryTable.getText();
		assertNotEquals(validateSalary, salario);

		String validateDepartment = fieldDepartmentTable.getText();
		assertNotEquals(validateDepartment, departamento);
	}

	public void setSearchField(String primeiro_nome) throws InterruptedException {
		fieldSearch.setValue(primeiro_nome);
	}

	public void validateSearch(String primeiro_nome, String ultimo_nome, String idade, String email, String salario,
			String departamento) throws InterruptedException {
		String validateFirstName = fieldFirstNameTableSearch.getText();
		assertEquals(validateFirstName, primeiro_nome);
		
		String validateLastName = fieldLastNameTableSearch.getText();
		assertEquals(validateLastName, ultimo_nome);
		
		String validateAge = fieldAgeTableSearch.getText();
		assertEquals(validateAge, idade);
		
		String validateEmail = fieldEmailTableSearch.getText();
		assertEquals(validateEmail, email);
		
		String validateSalary = fieldSalaryTableSearch.getText();
		assertEquals(validateSalary, salario);
		
		String validateDepartment = fieldDepartmentTableSearch.getText();
		assertEquals(validateDepartment, departamento);
	}

}
