package io.gstudios.sheetmanager;/**
 * Created by Galbanie on 2016-11-12.
 */

import io.gstudios.sheetmanager.controllers.SheetManagerController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.datafx.controller.flow.Flow;
import org.datafx.controller.flow.FlowException;
import org.datafx.controller.flow.FlowHandler;
import org.datafx.controller.flow.container.DefaultFlowContainer;
import org.datafx.controller.flow.context.FXMLViewFlowContext;
import org.datafx.controller.flow.context.ViewFlowContext;

public class SheetManager extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FlowException {
        /*new Flow(SheetManagerController.class).
                withLink(SheetManagerController.class, "new", NewProjectController.class).
                startInStage(primaryStage);*/

        ViewFlowContext flowContext = new ViewFlowContext();

        Flow flow = new Flow(SheetManagerController.class);

        FlowHandler flowHandler = flow.createHandler(flowContext);

        StackPane pane = flowHandler.start(new DefaultFlowContainer());
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

}
