/**
 Classe que controla o programa do mercado
 */

package com.example.mercadindofundao;

import com.example.mercadindofundao.MercadoApp;
import com.example.mercadindofundao.More.PopUp;
import com.example.mercadindofundao.More.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class MercadoController {

    private List<Produto> Produtos = new ArrayList<>();
    Produto p1 = new Produto(0, "COCA-COLA 220ml", 3.00);
    Produto p2 = new Produto(1, "ARROZ VASCONCELOS - TIPO 1 - 5 KG", 20.00);
    Produto p3 = new Produto(2, "LEITE PIRACANJUBA - 1L", 6.00);
    Produto p4 = new Produto(3, "CAFÉ CORÉ - EXTRA FORTE - 250g", 6.00);
    Produto p5 = new Produto(4, "''BOLACHA'' RECHEADA NIKITO - 135g", 3.00);
    Produto p6 = new Produto(5, "Salgadinho Keleck Bacon - 150g", 2.00);
    Produto p7 = new Produto(6, "Salgadinho Keleck Cebola - 150g", 2.00);
    Produto p8 = new Produto(7, "Salgadinho Keleck Pizza - 150g", 2.00);
    Produto p9 = new Produto(8, "Salgadinho Keleck Requeijão - 150g", 2.00);
    Produto p10 = new Produto(9, "Salgadinho Keleck Bacon - 150g", 2.00);
    Produto p11 = new Produto(10, "Batata Ruffles Original - 92g", 12.00);
    Produto p12 = new Produto(11, "Batata Ruffles Cebola & Salsa - 92g", 12.00);
    Produto p13 = new Produto(12, "Batata Ruffles Original - 92g", 12.00);
    Produto p14 = new Produto(13, "Doritos Queijo Nacho - 84g", 8.00);
    Produto p15 = new Produto(14, "Hamburger Rezende Caixa - C/30 Unidades", 30.00);
    Produto p16 = new Produto(15, "Lasanha à Bolonhesa Seara", 14.00);
    Produto p17 = new Produto(665+1,"O B A I D <---", 615.00+1);

    private double total = 0;
    private double troco = 0;
    private Produto produto;

    private List<Produto> produtosCompra = new ArrayList<>();
    private int quantidade;

    private int codigoNumero;
    private int j = 0;

    private ObservableList<Produto> obsLista;

    @FXML
    private TableColumn<Produto, Integer> QTD;

    @FXML
    private Button RemoverProduto;

    @FXML
    private Button CancelarCompra;

    @FXML
    private TextField Codigo;

    @FXML
    private Label NomeProduto;

    @FXML
    private Button AlterarQuantidade;

    @FXML
    private Label Subtotal;

    @FXML
    private Label Troco;

    @FXML
    private Label ValorTotal;

    @FXML
    private Button AdicionarProduto;

    @FXML
    private Button AdmProdutos;

    @FXML
    private TextField Quantidade;

    @FXML
    private Label ValorUnitario;

    @FXML
    private Button Pagar;

    @FXML
    private TableColumn<Produto, Double> Total;

    @FXML
    private TextField TotalRecebido;

    @FXML
    private TableView<Produto> Tabela;

    @FXML
    private TableColumn<Produto, Integer> codTabela;

    @FXML
    private TableColumn<Produto, String> Nome;

    void calculaTroco(){
        troco = Double.parseDouble(TotalRecebido.getText()) - total;
        Troco.setText(Double.toString(troco));
    }

    @FXML
    void AdicionarProdutos(ActionEvent event){  // Para adicionar produtos, primeiro se pega do programa, a
        /*String codigo = Codigo.getText();       // o código do produto e a quantidade desejada dele.
        String quantidade = Quantidade.getText()/   // A seguir, se verifica o nome do produto que deve ser
        int codigoNumero = Integer.parseInt(Codigo.getText());// exibido na tela, e seu preço. Os preços dos produtos
        int quantidadeNumero = Integer.parseInt(Quantidade.getText()); // são somados até o final*/
        if(j == 0){

            Produtos.add(p1);Produtos.add(p2);Produtos.add(p3);Produtos.add(p4);Produtos.add(p5);Produtos.add(p6);
            Produtos.add(p7);Produtos.add(p8);Produtos.add(p9);Produtos.add(p10);Produtos.add(p11);Produtos.add(p12);
            Produtos.add(p13);Produtos.add(p14);Produtos.add(p15);Produtos.add(p16);Produtos.add(p17);

        }

        try{
            codigoNumero = Integer.parseInt(Codigo.getText());
        }catch(NumberFormatException e){
            PopUp.MostrarPopUp("ERRO!", null,
                    "INSIRA O CÓDIGO VÁLIDO!!!",
                    Alert.AlertType.ERROR);
        }
        if(Quantidade.getText() == ""){
            quantidade = 1;
            for (int i = 0; i < Produtos.size(); i++) {
                if(Produtos.get(i).getCodigo() == codigoNumero){
                    NomeProduto.setText(Produtos.get(i).getNome().toUpperCase());
                    ValorUnitario.setText(Double.toString(Produtos.get(i).getPreco()));
                    ValorTotal.setText(Double.toString(Produtos.get(i).getPreco()));
                    produtosCompra.add(Produtos.get(i));
                    total += Produtos.get(i).getPreco();
                    Subtotal.setText(Double.toString(total));
                    calculaTroco();


                }
            }

        }else if(Integer.parseInt(Quantidade.getText()) == 0){

        }else{
            for (int i = 0; i < Produtos.size(); i++) {
                if(Produtos.get(i).getCodigo() == codigoNumero){
                    NomeProduto.setText(Produtos.get(i).getNome().toUpperCase());
                    ValorUnitario.setText(Double.toString(Produtos.get(i).getPreco()));
                    ValorTotal.setText(Double.toString(Produtos.get(i).getPreco() * Integer.parseInt(Quantidade.getText())));
                    produtosCompra.add(Produtos.get(i));


                    total += Double.parseDouble(Quantidade.getText()) * Produtos.get(i).getPreco();


                    Subtotal.setText(Double.toString(total));
                    calculaTroco();

                    codTabela.setCellValueFactory(new PropertyValueFactory<>(Codigo.toString()));
                    Nome.setCellValueFactory(new PropertyValueFactory<>(Produtos.get(i).getNome()));
                    QTD.setCellValueFactory(new PropertyValueFactory<>(Quantidade.toString()));
                    Total.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(total)));



                }
            }
        }
    }


    @FXML
    void RemoverProdutos(ActionEvent event) {

    }

    @FXML
    void AlterarQuantidades(ActionEvent event) {

    }

    @FXML
    void CancelaCompras(ActionEvent event) {

    }

    @FXML
    void RealizarPagamento(ActionEvent event) {

    }

    @FXML
    void AdministrarProdutos(ActionEvent event) {

    }

}
