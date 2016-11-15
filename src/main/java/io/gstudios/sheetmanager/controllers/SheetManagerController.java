package io.gstudios.sheetmanager.controllers;



import io.gstudios.sheetmanager.controllers.projects.NewProjectController;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.datafx.controller.FXMLController;
import org.datafx.controller.flow.Flow;
import org.datafx.controller.flow.FlowException;
import org.datafx.controller.flow.FlowHandler;
import org.datafx.controller.flow.action.ActionMethod;
import org.datafx.controller.flow.action.ActionTrigger;
import org.datafx.controller.flow.action.FlowAction;
import org.datafx.controller.flow.context.ActionHandler;
import org.datafx.controller.flow.context.FXMLViewFlowContext;
import org.datafx.controller.flow.context.FlowActionHandler;
import org.datafx.controller.flow.context.ViewFlowContext;
import org.datafx.controller.util.VetoException;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * Created by Galbanie on 2016-11-12.
 */
@FXMLController(value = "../views/sheetManagerMaster.fxml", title = "Sheet Manager")
public class SheetManagerController {

    // Section Menu
    @FXML
    @ActionTrigger("new")
    private MenuItem menuItemNewProject;
    @FXML
    private MenuItem menuItemOpenProject;
    @FXML
    private MenuItem menuItemCloseProject;

    //Section Toolbar
    @FXML
    //@ActionTrigger("newProject")
    private Button buttonNewProject;

    @FXML
    private TreeView<File> fileTreeView;

    @FXML
    private TabPane tabPane;

    @FXMLViewFlowContext
    private ViewFlowContext context;

    @ActionHandler
    private FlowActionHandler actionHandler;

    private FlowHandler flowHandler;

    @PostConstruct
    public void init() throws FlowException, VetoException {

        System.out.println("sheetManagerMaster.init");
        Flow flow = new Flow(HomeController.class).withGlobalLink("new",NewProjectController.class);
        flowHandler = flow.createHandler();



        menuItemNewProject.setOnAction(event -> {
            System.out.println("sheetManagerMaster.menuItemNewProject clicked!");
            try {
                flowHandler.handle("new");
            } catch (VetoException e) {
                e.printStackTrace();
            } catch (FlowException e) {
                e.printStackTrace();
            }
        });

        tabPane.getTabs().add(flowHandler.startInTab());

    }

}
