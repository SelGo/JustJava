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
            createOrderSummary(calculatePrice());
	    }

        /**
        *
        * @param price of coffee
        */
        private void createOrderSummary(int price){
            String priceMessage = "Name: Peter Tsampakiouris\n";
            String priceMessage2 = priceMessage + "Quantity:" + quantity + "\n";
			String priceMessage3 = priceMessage2 + "Total: $" + price + "\nThank you!";
            displayMessage(priceMessage3);
        }

        /**
        * Calculates the price of the order.
        */
        private int calculatePrice() {
            int pr = quantity * 5;
            return pr;
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
	    private void displayQuantity(int num) {
	        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
	        
	        quantityTextView.setText("" + num);
	    }

        /**
        * This method displays the given price on the screen.
        */
        private void displayPrice(int number) {
            TextView OrderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);

            OrderSummaryTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        }

	    /**
	     * This method displays the given text on the screen.
	     */
	    private void displayMessage(String message) {
	        TextView OrderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);

			OrderSummaryTextView.setText(message);
	    }

}
