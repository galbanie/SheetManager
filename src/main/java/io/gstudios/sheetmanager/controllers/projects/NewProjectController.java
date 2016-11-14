package io.gstudios.sheetmanager.controllers.projects;

import io.datafx.controller.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

import javax.annotation.PostConstruct;

/**
 * Created by Galbanie on 2016-11-13.
 */
@FXMLController(value = "../../views/projects/newProject.fxml", title = "Create a new project")
public class NewProjectController {

    @FXML
    private StackPane root;

    @PostConstruct
    public void init(){
        System.out.println("NewProjectController.init");
    }

}
