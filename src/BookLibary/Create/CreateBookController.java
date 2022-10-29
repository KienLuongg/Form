package BookLibary.Create;

import BookLibary.Book;
import BookLibary.List.ListBookController;
import BookLibary.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CreateBookController implements Initializable {

    public TextField txtCode;
    public TextField txtName;
    public TextField txtAuthor;
    public TextField txtPrice;
    public TextField txtQty;
    public ComboBox<String> cbPublisher;
    public ComboBox<String> cbType;

    public void backToList() throws Exception {
        Parent listSceneB = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../list/ListBook.fxml")));
        Scene sc = new Scene(listSceneB, 800, 600);
        Main.rootStages.setScene(sc);
    }

    public void submit(ActionEvent actionEvent){

        try {
            Integer p = Integer.parseInt(txtPrice.getText());
            Integer q = Integer.parseInt(txtQty.getText());
            if (p <= 0)
                throw new Exception("Enter Price > 0");
            if (q<=0)
                throw new Exception("Enter Amount >0");
            Book s =new Book(txtCode.getText(),txtName.getText(),txtAuthor.getText(),cbPublisher.getValue(),cbType.getValue(),p,q);
            ListBookController.ls2.add(s);
            backToList();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!!");
            alert.setHeaderText(e.getMessage());
            alert.show();


        }


    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> type = FXCollections.observableArrayList();
        type.add("Tiểu Thuyết");
        type.add("Văn Học");
        type.add("Khác");
        cbType.setItems(type);
        ObservableList<String> nxb = FXCollections.observableArrayList();
        nxb.add("Hoa Mai");
        nxb.add("Hồng Bàng");
        nxb.add("Khác");
        cbPublisher.setItems(nxb);
    }



}