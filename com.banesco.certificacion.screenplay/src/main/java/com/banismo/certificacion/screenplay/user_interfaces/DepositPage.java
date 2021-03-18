package com.banismo.certificacion.screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DepositPage {
    public static Target SAVINGS_ACCOUNT = Target.the("Option of the deposits")
            .locatedBy("//a[contains(text(),'Cuenta de Ahorro Comercial')]");

    public static Target DOCUMENTS = Target.the("Option to view the documents")
            .locatedBy("//a[contains(text(),'Documentos')]");

    public static Target NAME_DOCUMENT = Target.the("Option to view the documents")
            .locatedBy("(//strong[contains(text(),'Contrato Único de Productos y Servicios Bancarios')])[1]");

    public static Target OPEN_PDF = Target.the("PDF icon that redirects to view the document")
            .locatedBy("(//a[@title='Contrato Único de Productos y Servicios Bancarios']/img)[1]");


}
