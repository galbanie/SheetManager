package io.gstudios.sheetmanager;/**
 * Created by Galbanie on 2016-11-12.
 */

import io.datafx.controller.flow.Flow;
import io.datafx.controller.flow.FlowException;
import io.datafx.controller.flow.FlowHandler;
import io.datafx.controller.flow.container.DefaultFlowContainer;
import io.datafx.controller.flow.context.FXMLViewFlowContext;
import io.datafx.controller.flow.context.ViewFlowContext;
import io.gstudios.sheetmanager.controllers.SheetManagerController;
import io.gstudios.sheetmanager.controllers.projects.NewProjectController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SheetManager extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @FXMLViewFlowContext
    private ViewFlowContext context;

    @Override
    public void start(Stage primaryStage) throws FlowException {
        /*new Flow(SheetManagerController.class).
                withLink(SheetManagerController.class, "new", NewProjectController.class).
                startInStage(primaryStage);*/

        Flow flow = new Flow(SheetManagerController.class);

        FlowHandler flowHandler = flow.createHandler();

        StackPane pane = flowHandler.start(new DefaultFlowContainer());
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

}
