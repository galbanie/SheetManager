package io.gstudios.sheetmanager.controllers;


import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.Flow;
import io.datafx.controller.flow.FlowException;
import io.datafx.controller.flow.FlowHandler;
import io.datafx.controller.flow.action.ActionMethod;
import io.datafx.controller.flow.action.ActionTrigger;
import io.datafx.controller.flow.context.ActionHandler;
import io.datafx.controller.flow.context.FXMLViewFlowContext;
import io.datafx.controller.flow.context.ViewFlowContext;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * Created by Galbanie on 2016-11-12.
 */
@FXMLController(value = "../views/sheetManagerMaster.fxml", title = "Sheet Manager")
public class SheetManagerController {

    @FXML
    @ActionTrigger("new")
    private MenuItem newProject;
    @FXML
    private MenuItem openProject;
    @FXML
    private MenuItem closeProject;

    @FXML
    private TreeView<File> fileTreeView;

    @FXML
    private TabPane tabPane;

    @FXMLViewFlowContext
    private ViewFlowContext context;

    private FlowHandler flowHandler;

    @PostConstruct
    public void init() throws FlowException {
        System.out.println("sheetManagerMaster.init");

        Flow flow = new Flow(HomeController.class);

        flowHandler = flow.createHandler();

        //System.out.println(flowHandler.startInTab());

        tabPane.getTabs().add(flowHandler.startInTab());

    }

    @ActionMethod("new")
    public void createNewProject(){
        System.out.println("sheetManagerMaster.createNewProject");
    }

}
