package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import sample.model.JobModel;
import java.net.URL;

import javax.annotation.Resource;
import java.util.ResourceBundle;


public class JobController implements Initializable {
    public JobModel jobModel = new JobModel();

    @FXML
    private Label isConnected;
    @Override
    public void initialize(URL location, ResourceBundle resource){
        if (jobModel.isDbConnected()){
            isConnected.setText("Connected");
        }
        else{
            isConnected.setText("Not Connected");
        }
    }
}
