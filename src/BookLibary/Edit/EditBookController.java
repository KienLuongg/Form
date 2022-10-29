package BookLibary.Edit;
import BookLibary.Book;
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

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
public class EditBookController implements Initializable {
    public static Book editedBook;
    public TextField txtCode;
    public TextField txtName;
    public TextField txtAuthor;
    public TextField txtPrice;
    public TextField txtQty;
    public ComboBox<String> cbPublisher;
    public ComboBox<String> cbType;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtCode.setText(editedBook.getCode());
        txtAuthor.setText(editedBook.getAuthor());
        txtName.setText(editedBook.getName());
        txtQty.setText(editedBook.getQty().toString());
        txtPrice.setText(editedBook.getPrice().toString());
        ObservableList<String> type = FXCollections.observableArrayList();
        type.add("Tiểu Thuyết");
        type.add("Văn Học");
        type.add("Khác");
        cbType.setItems(type);
        cbType.setValue(editedBook.getType());
        ObservableList<String> nxb = FXCollections.observableArrayList();
        nxb.add("Hoa Mai");
        nxb.add("Hồng Bàng");
        nxb.add("Khác");
        cbPublisher.setItems(nxb);
        cbPublisher.setValue(editedBook.getNxb());

    }
    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent listScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../list/ListBook.fxml")));
        Scene sc = new Scene(listScene, 800, 600);
        Main.rootStages.setScene(sc);
    }

    public void submit(ActionEvent event) {
        try{
            Integer p = Integer.parseInt(txtPrice.getText());
            Integer q = Integer.parseInt(txtQty.getText());
            if (p < 0)
                throw new Exception("Enter Price > 0");
            editedBook.setCode(txtCode.getText());
            editedBook.setName(txtName.getText());
            editedBook.setAuthor(txtAuthor.getText());
            editedBook.setPrice(p);
            editedBook.setQty(q);
            editedBook.setNxb(cbPublisher.getValue());
            editedBook.setType(cbType.getValue());
            backToList(null);

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }

    }




}