package io.gstudios.sheetmanager.controllers;

import org.datafx.controller.FXMLController;

import javax.annotation.PostConstruct;

/**
 * Created by Galbanie on 2016-11-14.
 */
@FXMLController(value = "../views/home.fxml", title = "Home")
public class HomeController {

    @PostConstruct
    public void init(){
        System.out.println("HomeController.init");
    }
}
