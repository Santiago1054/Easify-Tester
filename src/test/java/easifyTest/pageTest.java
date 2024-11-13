package easifyTest;
import java.nio.file.WatchEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageTest {
		
		WebDriver driver;
		
		@FindBy(name = "Registrate") WebElement pf_registerBtt;
		@FindBy(name = "Inicio Sesión") WebElement pf_logInBtt;
		@FindBy(name = "Agregar propiedad") WebElement pf_addProp;
		@FindBy(name = "departamento") WebElement pf_departamento;
	
		@FindBy(name = "propietario") WebElement pf_propietario;
		@FindBy(name = "propietarioNumero") WebElement pf_propietarioNumero;
		@FindBy(name = "propietarioEmail") WebElement pf_propietarioEmail;
		@FindBy(name = "inquilinos") WebElement pf_inquilinos;
		@FindBy(name = "inquilinosNumero") WebElement pf_inquilinosNumero;
		@FindBy(name = "inquilinosEmail") WebElement pf_inquilinosEmail;
		@FindBy(name = "historial") WebElement pf_historial;
		@FindBy(id = "imagen") WebElement pf_imagen;
		@FindBy(id = "doc") WebElement pf_doc;
		@FindBy(id = "certify") WebElement pf_certify;
		@FindBy(name = "municipio") WebElement pf_municipio;
		@FindBy(name = "barrio") WebElement pf_barrio;
		@FindBy(name = "direccionHogar") WebElement pf_direccionHogar;
		@FindBy(name = "/html/body/div/div/div/main/div/form/div[6]/button") WebElement pf_save;
		@FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/div/div/div/div/button[2]/span") WebElement pf_delete;
		@FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/div/div/div[2]/div/div[2]/button[2]") WebElement pf_confirmDelete;
		@FindBy(xpath = "/html/body/div[3]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3") WebElement pf_click_ucp;
		@FindBy(name = "ver detalles") WebElement pf_details;
		@FindBy(xpath = "/html/body/div/div/div/main/div/div[2]/div/div[1]/div[2]/div/div[2]/a/span") WebElement pf_edit;
		@FindBy(linkText = "Estudiantes") WebElement pf_students;
		@FindBy(linkText = "Moodle") WebElement pf_moodle;
		
		@FindBy(name = "username") WebElement pf_userName;
		@FindBy(name = "email") WebElement pf_email;
		@FindBy(name = "password") WebElement pf_password;
		@FindBy(xpath = "/html/body/div/div/div/main/div/div/div/form/div/button") WebElement pf_submit;
		
		@FindBy(xpath = "/html/body/div[4]/nav/div/div[2]/nav/ul/li[4]/a") WebElement pf_cursos;
		@FindBy(xpath = "/html/body/div[4]/div[4]/div/div/div[2]/div/section/div/aside/section/div/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[3]/div[2]/div[2]/a") WebElement pf_optativa;
		
		@FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div[3]/div/section/div/div/ul/li[1]/div/ul/li[2]/div/div[1]/div/div[1]/div/div/div[2]/div[2]/a") WebElement pf_plan_curso;
		
		public void IniciaDriver(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void FinalizarDriver(WebDriver driver) {
			driver.close();
		}
		
		public void EntrarWeb() {
			pf_registerBtt.click();
		}
		public void logIn() {
			pf_logInBtt.click();
		}
		public void EscribirUserName(String user) {
			pf_userName.sendKeys(user);
		}
		
		public void EscribirEmail(String user) {
			pf_email.sendKeys(user);
		}
		
		public void EscribirPass(String pass) {
			pf_password.sendKeys(pass);
		}
		
		public void AccionBoton() {
			pf_submit.submit();
		}
		public void createNewProp() {
			pf_addProp.click();
		}
		public void departamento(String dep) {
			pf_departamento.sendKeys(dep);
		}

		public void municipio(String municipio) {
			pf_municipio.sendKeys(municipio);
		}
		
		public void barrio(String barrio) {
			pf_barrio.sendKeys(barrio);
		}
		
		public void direction(String direction) {
			pf_direccionHogar.sendKeys(direction);
		}
		
		public void nombreProp(String propietario) {
			pf_propietario.sendKeys(propietario);
		}
		public void numberPropietario(String numberPropietario) {
			pf_propietarioNumero.sendKeys(numberPropietario);
		}
		public void emailPropietario(String emailPropietario) {
			pf_propietarioEmail.sendKeys(emailPropietario);
		}
		public void nombreInquilino(String nombreInquilino) {
			pf_inquilinos.sendKeys(nombreInquilino);
		}
		public void numberInquilino(String numberInquilino) {
			pf_inquilinosNumero.sendKeys(numberInquilino);
		}
		public void emailIquilino(String emailIquilino) {
			pf_inquilinosEmail.sendKeys(emailIquilino);
		}
		public void notes(String  notes) {
			pf_historial.sendKeys(notes);
		}
		public void img(String  path) {
			pf_imagen.sendKeys( path);
		}
		public void doc(String  path) {
			pf_doc.sendKeys( path);
		}
		public void certify(String  path) {
			pf_certify.sendKeys( path);
		}
		public void saveBoton() {
			pf_save.submit();
		}
		public void deleteBtt() {
			pf_delete.click();
		}
		public void confirmDelete() {
			pf_confirmDelete.click();
		}
		public void viewDetail() {
			pf_details.click();
		}
		public void edit() {
			pf_edit.click();
		}
		
		
		
}
