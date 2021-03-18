package com.banismo.certificacion.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchWindow implements Interaction {
    private final WebDriver driver;

    public SwitchWindow(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String originalWindow = driver.getWindowHandle();

        driver.close();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

    }

    public static SwitchWindow andClose(WebDriver driver){
        return instrumented(SwitchWindow.class, driver);
    }
}
