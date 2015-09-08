package com.example.android.justjava;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends Activity {
		
	int quantity = 2;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	    }

	    /**
	     * This method is called when the order button is clicked.
	     */
	    public void submitOrder(View view) {
	    	int price = quantity * 5;
	    	String priceMessage = "Total: $" + price;
	    	String priceMessage2 = priceMessage + "\nThank You!";
	    	
	    	displayMessage(priceMessage2);
	    }

	    /**
	     * This method increments the quantity of cups of coffee the user wants
	     * @param view
	     */
	    public void increment(View view) {
	    	quantity = quantity + 1;
	    	
	    	displayQuantity(quantity);
	    }
	    
	    /**
	     * This method decrements the quantity of cups of coffee the user wants
	     * @param view
	     */
	    public void decrement(View view) {
	    	quantity = quantity - 1;
	    	
	    	displayQuantity(quantity);
	    }

	    /**
	     * This method displays the given quantity value on the screen.
	     */
	    private void displayQuantity(int number) {
	        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
	        
	        quantityTextView.setText("" + number);
	    }

	    /**
	     * This method displays the given text on the screen.
	     */
	    private void displayMessage(String message) {
	        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
	        
	        priceTextView.setText(message);
	    }

}
