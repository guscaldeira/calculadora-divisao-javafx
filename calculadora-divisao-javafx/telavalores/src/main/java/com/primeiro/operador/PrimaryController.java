package com.primeiro.operador;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button bntDividir;
    @FXML
    private TextField txtNu;
    @FXML
    private TextField txtDen;
    @FXML
    private Label lblDiv;
    @FXML
    private Label lblResto;
    @FXML
    private void clicouBotao () {

        try {
             String valor1 = txtNu.getText();
             String valor2 = txtDen.getText();
            double n1 = Double.parseDouble(valor1);
            double n2 = Double.parseDouble(valor2);
            double resultadoDiv = n1 / n2;
            lblDiv.setText(String.valueOf(resultadoDiv));
            double resutadoResto = n1 % n2;
            lblResto.setText(String.valueOf(resutadoResto));   
        }catch (NumberFormatException eFormatException) {
            bntDividir.setText("Erro Digite apenas números ");
        }
    }
}
