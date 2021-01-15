package Project_C_C_Convertor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main_Screen extends Application
{
	public static void main(String[]args)
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		
		Text t=new Text("Crypto Currency Convertor");
		t.setFont(Font.font(30));
		t.setFill(Color.DARKBLUE);
		
		Button b=new Button("BTC to Usd");
		Button b1=new Button("BTC to Pkr");
		Button b2=new Button("Eth to Usd");
		Button b3=new Button("Eth to Pkr");
		Button b4=new Button("Btc to Eth");
		
		VBox vb=new VBox(20);
		vb.setAlignment(Pos.CENTER);
		vb.getChildren().addAll(t,b,b1,b2,b3,b4);
		

		
		//set action on b
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Label l=new Label("Btc value");
				Label l1=new Label("Usd value");
				
				TextField t=new TextField();
				TextField t1=new TextField();
				
				Button c=new Button("Convert");
				Button r=new Button("Reset");
				r.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) {
						t.clear();
						t1.clear();
						
					}
				});
				
				
				GridPane gp=new GridPane();
				gp.add(l, 0, 1);
				gp.add(t, 1, 1);
				gp.add(l1, 0, 2);
				gp.add(t1, 1, 2);
				gp.add(c, 0, 3);
				gp.add(r, 1, 3);
				gp.setHgap(30);
				gp.setVgap(30);
				gp.setAlignment(Pos.CENTER);

				Scene sc=new Scene(gp,300,200);
				stage.setScene(sc);
				stage.show();
				
				c.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) 
					{
					
						if(t.getText().isEmpty())
						{
							double usd=Double.parseDouble(t1.getText());
							
							currency_rates n=new currency_rates();
							double btc=n.usd_to_btc(usd);
							t.setText(String.valueOf(btc));
							
						}
						else
						{
							double btc=Double.parseDouble(t.getText());
							currency_rates n=new currency_rates();
							double usd=n.btc_to_usd(btc);
							t1.setText(String.valueOf(usd));
						}
					}
				});
			
			}
			
		});
		
		//set action on b1
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Label l=new Label("Btc value");
				Label l1=new Label("pkr value");
				
				TextField t=new TextField();
				TextField t1=new TextField();
				
				Button c=new Button("Convert");
				Button r=new Button("Reset");
				
				
				
				
				GridPane gp=new GridPane();
				gp.add(l, 0, 1);
				gp.add(t, 1, 1);
				gp.add(l1, 0, 2);
				gp.add(t1, 1, 2);
				gp.add(c, 0, 3);
				gp.add(r, 1, 3);
				gp.setHgap(30);
				gp.setVgap(30);
				gp.setAlignment(Pos.CENTER);

				Scene sc=new Scene(gp,300,200);
				stage.setScene(sc);
				stage.show();

				c.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) 
					{
					
						if(t.getText().isEmpty())
						{
							double pkr=Double.parseDouble(t1.getText());
							
							currency_rates n=new currency_rates();
							double btc=n.pkr_to_btc(pkr);
							t.setText(String.valueOf(btc));
							
						}
						else
						{
							double btc=Double.parseDouble(t.getText());
							currency_rates n=new currency_rates();
							double pkr=n.btc_to_pkr(btc);
							t1.setText(String.valueOf(pkr));
							
						}
					}
				});
			r.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					t.clear();
					t1.clear();
				}
			});
			
			}
		});
		//set action on b2
		b2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Label l=new Label("eth value");
				Label l1=new Label("usd value");
				
				TextField t=new TextField();
				TextField t1=new TextField();
				
				Button c=new Button("Convert");
				Button r=new Button("Reset");
				
				
				
				
				GridPane gp=new GridPane();
				gp.add(l, 0, 1);
				gp.add(t, 1, 1);
				gp.add(l1, 0, 2);
				gp.add(t1, 1, 2);
				gp.add(c, 0, 3);
				gp.add(r, 1, 3);
				gp.setHgap(30);
				gp.setVgap(30);
				gp.setAlignment(Pos.CENTER);

				Scene sc=new Scene(gp,300,200);
				stage.setScene(sc);
				stage.show();

				c.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) 
					{
					
						if(t.getText().isEmpty())
						{
							double usd=Double.parseDouble(t1.getText());
							
							currency_rates n=new currency_rates();
							double eth=n.usd_to_eth(usd);
							t.setText(String.valueOf(eth));
							
						}
						else
						{
							double eth=Double.parseDouble(t.getText());
							currency_rates n=new currency_rates();
							double usd=n.eth_to_usd(eth);
							t1.setText(String.valueOf(usd));
							
						}
					}
				});
			r.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					t.clear();
					t1.clear();
				}
			});
			
			}
		});
		//set action on b3
		b3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Label l=new Label("Eth value");
				Label l1=new Label("Pkr value");
				
				TextField t=new TextField();
				TextField t1=new TextField();
				
				Button c=new Button("Convert");
				Button r=new Button("Reset");
				
				
				
				
				GridPane gp=new GridPane();
				gp.add(l, 0, 1);
				gp.add(t, 1, 1);
				gp.add(l1, 0, 2);
				gp.add(t1, 1, 2);
				gp.add(c, 0, 3);
				gp.add(r, 1, 3);
				gp.setHgap(30);
				gp.setVgap(30);
				gp.setAlignment(Pos.CENTER);

				Scene sc=new Scene(gp,300,200);
				stage.setScene(sc);
				stage.show();

				c.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) 
					{
					
						if(t.getText().isEmpty())
						{
							double pkr=Double.parseDouble(t1.getText());
							
							currency_rates n=new currency_rates();
							double eth=n.pkr_to_eth(pkr);
							t.setText(String.valueOf(eth));
							
						}
						else
						{
							double eth=Double.parseDouble(t.getText());
							currency_rates n=new currency_rates();
							double pkr=n.eth_to_pkr(eth);
							t1.setText(String.valueOf(pkr));
							
						}
					}
				});
			r.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					t.clear();
					t1.clear();
				}
			});
			
			}
		});
		//set action on b4
		b4.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Label l=new Label("Btc value");
				Label l1=new Label("Eth value");
				
				TextField t=new TextField();
				TextField t1=new TextField();
				
				Button c=new Button("Convert");
				Button r=new Button("Reset");
				
				
				
				
				GridPane gp=new GridPane();
				gp.add(l, 0, 1);
				gp.add(t, 1, 1);
				gp.add(l1, 0, 2);
				gp.add(t1, 1, 2);
				gp.add(c, 0, 3);
				gp.add(r, 1, 3);
				gp.setHgap(30);
				gp.setVgap(30);
				gp.setAlignment(Pos.CENTER);

				Scene sc=new Scene(gp,300,200);
				stage.setScene(sc);
				stage.show();

				c.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) 
					{
					
						if(t.getText().isEmpty())
						{
							double eth=Double.parseDouble(t1.getText());
							
							currency_rates n=new currency_rates();
							double btc=n.eth_to_btc(eth);
							t.setText(String.valueOf(btc));
							
						}
						else
						{
							double btc=Double.parseDouble(t.getText());
							currency_rates n=new currency_rates();
							double eth=n.btc_to_eth(btc);
							t1.setText(String.valueOf(eth));
							
						}
					}
				});
			r.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					t.clear();
					t1.clear();
				}
			});
			
			}
		});

		
		Scene sc=new Scene(vb,500,400);
		stage.setTitle("Convertor");
		stage.setScene(sc);
		stage.show();
	}

}
