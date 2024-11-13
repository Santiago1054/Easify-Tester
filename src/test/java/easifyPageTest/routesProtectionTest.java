package easifyPageTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import easifyTest.pageTest;

public class routesProtectionTest{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		
		pageTest home = new pageTest();
    	
        WebDriver driver;
        
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\crist\\OneDrive\\Documents\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        driver = new ChromeDriver();
        
        driver.get("http://localhost:5173/");
        Thread.sleep(3000);
		driver.manage().window().maximize();
		
		home.IniciaDriver(driver);
		//home.AccionBuscar();
		Thread.sleep(3000);
		
		driver.get("http://localhost:5173/tasks");
        Thread.sleep(3000);
        driver.get("http://localhost:5173/tasks/new");
        
        //Se va a la pagina del moodle        
       // home.ClickEstudiantes();
       // home.ClickMoodle();
        
       // Thread.sleep(3000);

        
        //Cambia de pestaña
       // Set<String> windows = driver.getWindowHandles();
       // List<String> allWindows = new ArrayList<String>(windows);
        //driver.switchTo().window(allWindows.get(1));
        
        //Se inicia sesion

  
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