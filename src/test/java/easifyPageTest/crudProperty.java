package easifyPageTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import easifyTest.pageTest;

public class crudProperty{
	public static void main(String[] args) throws InterruptedException {
	pageTest home = new pageTest();
    	
        WebDriver driver;
        
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\crist\\OneDrive\\Documents\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        driver = new ChromeDriver();
        
        driver.get("https://easifyview.onrender.com");
        Thread.sleep(3000);
		driver.manage().window().maximize();
		
		home.IniciaDriver(driver);
		//home.AccionBuscar();
		Thread.sleep(3000);
		home.logIn();
		
        Thread.sleep(3000);
        
        //Se va a la pagina del moodle        
       // home.ClickEstudiantes();
       // home.ClickMoodle();
        
       // Thread.sleep(3000);

        
        //Cambia de pestaña
       // Set<String> windows = driver.getWindowHandles();
       // List<String> allWindows = new ArrayList<String>(windows);
        //driver.switchTo().window(allWindows.get(1));
        
        //Se inicia sesion

        home.EscribirEmail("test1@gmail.com");
        Thread.sleep(3000);
        home.EscribirPass("test123");
        Thread.sleep(3000);
        
        home.AccionBoton();
        Thread.sleep(3000);
        home.createNewProp();
        Thread.sleep(3000);
        home.departamento("Risaralda");
        Thread.sleep(3000);
        home.municipio("Pereira");
        Thread.sleep(3000);
        home.barrio("Poblado 2");
        Thread.sleep(3000);
        home.direction("Manzana 16 Casa 14");
        Thread.sleep(3000);
        home.nombreProp("Juan David Sanchez");
        Thread.sleep(3000);
        home.numberPropietario("305 2327361");
        Thread.sleep(3000);
        home.emailPropietario("Juan123@gmail.com");
        Thread.sleep(3000);
        home.nombreInquilino("Miguel angel arboleda");
        Thread.sleep(3000);
        home.numberInquilino("305 3387201");
        Thread.sleep(3000);
        home.emailIquilino("Migue321@gmail.com");
        Thread.sleep(3000);
        home.notes("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales vel enim sed commodo. Nam elementum tellus vel ex euismod, ut pharetra magna fringilla. Donec blandit, quam non ornare malesuada, risus nunc posuere ex, sit amet tristique lorem mauris ac leo. Pellentesque volutpat vitae orci pulvinar accumsan. In lobortis nisi enim, posuere placerat massa sodales tempus. Nullam sed tortor at metus efficitur viverra. Nullam in faucibus erat, sed euismod neque. Sed mollis dui at turpis cursus egestas dignissim et libero. Fusce condimentum at nulla non auctor. Suspendisse vestibulum eros et maximus auctor. Praesent scelerisque nulla ac eros ultricies, non venenatis magna blandit. Phasellus felis magna, interdum sed arcu nec, dapibus gravida turpis. Suspendisse iaculis felis purus. Sed in lectus fringilla, ornare urna in, auctor neque. Phasellus tempus lorem sed lorem fringilla, congue consequat justo varius. Suspendisse ultrices, ex at ullamcorper suscipit, magna lacus congue ipsum, eget ullamcorper lectus turpis fermentum ex.\r\n"
        		+ "\r\n"
        		+ "Etiam vel iaculis ligula. Maecenas fermentum nibh nunc, eget suscipit massa ultricies a. Vivamus odio tortor, elementum a mi a, sollicitudin congue orci. Phasellus volutpat arcu quis enim vestibulum, at pulvinar ipsum lobortis. Aliquam erat volutpat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Ut pellentesque mattis interdum. Duis orci nulla, interdum in sollicitudin vitae, fringilla non enim. Maecenas dolor diam, sodales vitae auctor sit amet, euismod eu lectus. Etiam a consequat nisi, vel ullamcorper risus. Proin orci ex, mollis a erat nec, ultricies euismod odio. Mauris eget dui tempor, vestibulum augue a, laoreet dui. Cras lorem nisi, accumsan eu odio eget, viverra aliquet lectus. Maecenas odio risus, scelerisque vitae dictum sed, varius vitae sem. Cras nec finibus odio, eget malesuada urna. Aliquam sit amet maximus odio, sit amet tincidunt dolor.");
        Thread.sleep(3000);
     
     // Sube la imagen
        home.img("C:\\Users\\crist\\OneDrive\\Imágenes\\a.webp");
        Thread.sleep(3000);

        // Sube el documento PDF
        home.doc("C:\\Users\\crist\\Downloads\\Hoja Membretada de Contrato Servicios de Marketing Moderno Verde.pdf");
        Thread.sleep(3000);

        // Sube el certificado
        home.certify("C:\\Users\\crist\\Downloads\\Certificado Diploma de Reconocimiento Profesional Moderno Verde y Blanco.pdf");
        Thread.sleep(5000);

        // Guardar cambios
        home.saveBoton();
        Thread.sleep(3000);
        home.deleteBtt();
        Thread.sleep(3000);
        home.confirmDelete();
        Thread.sleep(3000);
        home.viewDetail();
        Thread.sleep(3000);
        home.edit();
        Thread.sleep(3000);
        home.departamento("Caldas");
        Thread.sleep(3000);
        home.municipio("Manizales");
        Thread.sleep(3000);
        home.barrio("La sultana");
        Thread.sleep(3000);
        home.direction("Manzana 12 Casa 1");
        Thread.sleep(3000);
       
       
     
     // Sube la imagen
        home.img("C:\\Users\\crist\\OneDrive\\Imágenes\\xd.jpg");
        Thread.sleep(3000);

        // Guardar cambios
        home.saveBoton();
        
        
        //Se va a los cursos
        //home.AccionCursos();
        
       // Thread.sleep(2000);
        
        //Se busca la asignatura Optativa III
       // home.AccionOptativa();
        
      //  Thread.sleep(2000);
        
       // home.DescargarPlanCurso();
        
        //Thread.sleep(10000);
        
        //driver.quit();
	}
}