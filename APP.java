import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class APP extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Meu Primeiro Programa");
        
        // Criando o botão
        Button botao = new Button("Clica aqui");
        botao.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicou no botão");
            }
        });

        // Definindo o layout
        StackPane root = new StackPane();
        root.getChildren().add(botao);

        // Definindo a cena e adicionando ao stage
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}