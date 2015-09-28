package com.example.android.justjava;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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
	    	CheckBox whippedCream = (CheckBox) findViewById(R.id.whipped_cream);
	    	boolean hasWhippedCream = whippedCream.isChecked();
	    	
	    	CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
	    	boolean hasChocolate = chocolate.isChecked();
	    	
            createOrderSummary(calculatePrice(), hasWhippedCream, hasChocolate);
	    }

        /**
        *
        * @param price of coffee
        * @param a boolean to check whenever user has chosen the Whipped Cream choice
        */
        private void createOrderSummary(int price, boolean addwhippedCream, boolean addChocolate){
            String priceMessage = "Name: Peter Tsampakiouris";
            priceMessage += "\nAdded Whipped Cream? " + addwhippedCream;
            priceMessage += "\nAdded Chocolate? " + addChocolate;
            priceMessage += "\nQuantity:" + quantity;
			priceMessage += "\nTotal: $" + price + "\nThank you!";
            displayMessage(priceMessage);
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
