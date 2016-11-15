package io.gstudios.sheetmanager.controllers.projects;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import org.datafx.controller.FXMLController;

import javax.annotation.PostConstruct;

/**
 * Created by Galbanie on 2016-11-13.
 */
@FXMLController(value = "../../views/projects/newProject.fxml", title = "Create a new project")
public class NewProjectController {

    @PostConstruct
    public void init(){
        System.out.println("NewProjectController.init");
    }

}
