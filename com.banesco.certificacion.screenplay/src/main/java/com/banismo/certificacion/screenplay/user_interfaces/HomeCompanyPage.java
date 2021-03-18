package com.banismo.certificacion.screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/empresas/")
public class HomeCompanyPage extends PageObject {

    public static final Target PRODUCTS_SERVICES = Target.the("Menu of navigation bar")
            .locatedBy("//a[contains(text(),'Productos & Servicios')]");

    public static final Target DEPOSITS = Target.the("Option of menu products and services")
            .locatedBy("//a[contains(text(),'Depósitos')]");
}
