package com.banismo.certificacion.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

public class UrlDocument implements Question<Boolean> {
    private final WebDriver driver;
    private final String url;

    public UrlDocument(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String URL = driver.getCurrentUrl();
        return URL.equals(url);
    }

    public static UrlDocument isCorrect(WebDriver driver, String url){
        return new UrlDocument(driver, url);
    }
}
