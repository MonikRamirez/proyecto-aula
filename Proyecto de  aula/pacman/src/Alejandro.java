import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Alejandro extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane=new Pane();

		//				Image image=new Image("monis.png",192,128,true, true);
		//				ImageView imageview=new ImageView(image);
		//				pane.getChildren().add(imageview);

/////////////////////////////////////////////////////////////////////////////////////////		

		ArrayList<ImageView>ims=new ArrayList<>();
		double aux=0;
		double aux2=0;
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 10; j++) {
				Image im=new Image("ladrillo2.png",32,32,true,true);
				ImageView vie=new ImageView(im);
				vie.setX(aux2);
				vie.setY(aux);
				aux2+=32;
				ims.add(vie);
			}
			aux2=0;
			aux+=32;
		}
		double num=160;
		double num2=0;
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 10; j++) {
				Image im=new Image("giphy.gif",32,32,true,true);
				ImageView vie=new ImageView(im);
				vie.setX(num2);
				vie.setY(num);
				num2+=32;
				ims.add(vie);
			}
			num2=0;
			num+=32;
		}

		pane.getChildren().addAll(ims);

/////////////////////////////////////////////////////////////////////////////////////////		


		Scene scene= new Scene(pane,320,320, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
