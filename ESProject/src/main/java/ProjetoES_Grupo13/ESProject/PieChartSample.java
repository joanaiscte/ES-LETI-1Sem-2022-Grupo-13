package ProjetoES_Grupo13.ESProject;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;


public class PieChartSample extends Application {
	 
		@Override public void start(Stage stage) {
	    	
	    //Criamos um objeto do tipo Scene
	        Scene scene = new Scene(new Group());
	        stage.setTitle("Exemplo");
	        stage.setWidth(500);
	        stage.setHeight(500);
	 
	        ObservableList<PieChart.Data> pieChartData =
	                FXCollections.observableArrayList(
	                new PieChart.Data("Grapefruit", 13),
	                new PieChart.Data("Oranges", 25),
	                new PieChart.Data("Plums", 10),
	                new PieChart.Data("Pears", 22),
	                new PieChart.Data("Apples", 30));
	        final PieChart chart = new PieChart(pieChartData);
	        chart.setTitle("Frutas");

	        ((Group) scene.getRoot()).getChildren().add(chart);
	        chart.setLabelLineLength(20);
	        chart.setLegendSide(Side.LEFT);
	        stage.setScene(scene);
	        stage.show();
	    }
	 
	    public static void main(String[] args) {
	        launch(args);
	    }
}
	
