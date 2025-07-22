import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkSiteTests {

    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testdata.csv", numLinesToSkip = 1)
        void checkLinksOfChapterTest(){
        String navLink = "navigation1.html";
        driver.findElement(By.xpath("//a[@href='navigation1.html']")).click();

        WebElement navigationTitle = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Navigation example", navigationTitle.getText());
        Assertions.assertEquals(BASE_URL + navLink, driver.getCurrentUrl());
    }

    @Test
    @Tag("Navigation")
    public void openNavigationTest(){
        String navLink = "navigation1.html";
        driver.findElement(By.xpath("//a[@href='navigation1.html']")).click();

        WebElement navigationTitle = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Navigation example", navigationTitle.getText());
        Assertions.assertEquals(BASE_URL + navLink, driver.getCurrentUrl());
    }

    @Test
    @Tag("DropDownMenu")
    public void openDropDownMenuTest(){
        String dropAndDownLink = "dropdown-menu.html";
        driver.findElement(By.xpath("//a[@href='dropdown-menu.html']")).click();

        WebElement dropDownMenuTitle = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Dropdown menu", dropDownMenuTitle.getText());
        Assertions.assertEquals(BASE_URL + dropAndDownLink, driver.getCurrentUrl());

    }

    @Test
    @Tag("MouseOver")
    public void openMouseOverTest(){
        String mouseOverLink = "mouse-over.html";
        driver.findElement(By.xpath("//a[@href='mouse-over.html']")).click();

        WebElement mouseOverTitle = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Mouse over", mouseOverTitle.getText());
        Assertions.assertEquals(BASE_URL + mouseOverLink, driver.getCurrentUrl());
    }

    @Test
    @Tag("DragAndDrop")
    public void openDragAndDropTest(){
        String dragAndDropLink = "drag-and-drop.html";
        driver.findElement(By.xpath("//a[@href='drag-and-drop.html']")).click();

        WebElement dragAndDropTitle = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Drag and drop", dragAndDropTitle.getText());
        Assertions.assertEquals(BASE_URL + dragAndDropLink, driver.getCurrentUrl());
    }

    @Test
    @Tag("DrawInCanvas")
    public void openDrawInCanvasTest(){
        String drawInCanvasLink = "draw-in-canvas.html";
        driver.findElement(By.xpath("//a[@href='draw-in-canvas.html']")).click();

        WebElement drawInCanvasTitle = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Drawing in canvas", drawInCanvasTitle.getText());
        Assertions.assertEquals(BASE_URL + drawInCanvasLink, driver.getCurrentUrl());
    }

    @Test
    @Tag("LoadingImages")
    public void openLoadingImagesTest(){
        String loadingImagesLink = "loading-images.html";
        driver.findElement(By.xpath("//a[@href='loading-images.html']")).click();

        WebElement loadingImagesTitle = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Loading images", loadingImagesTitle.getText());
        Assertions.assertEquals(BASE_URL + loadingImagesLink, driver.getCurrentUrl());
    }

    @Test
    @Tag("SlowCalculator")
    public void openSlowCalculatorTest() {
        String slowCalculator = "slow-calculator.html";
        driver.findElement(By.xpath("//a[@href='slow-calculator.html']")).click();

        WebElement slowCalculatorTitle = driver.findElement(By.xpath("//h1[@class='display-6']"));
        Assertions.assertEquals("Slow calculator", slowCalculatorTitle.getText());
        Assertions.assertEquals(BASE_URL + slowCalculator, driver.getCurrentUrl());
    }


}
