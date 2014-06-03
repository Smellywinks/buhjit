package com.smellywinks.buhjit;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {
	private TextView titleView;
	private TextView listingNumber;
	private TextView data;
	private Button getNewData;
	private StringBuilder listingNumberString;
	private StringBuilder dataString;
	private int count = 0;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		titleView = (TextView)findViewById(R.id.titleText);
		listingNumber = (TextView)findViewById(R.id.listingNumber);
		data = (TextView)findViewById(R.id.listingData);
		getNewData = (Button)findViewById(R.id.add_new_data);
		getNewData.setEnabled(true);
		getNewData.setOnClickListener(getNewDataListener);
		
		listingNumberString = new StringBuilder();
		dataString = new StringBuilder();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private OnClickListener getNewDataListener = new OnClickListener(){
		@Override
		public void onClick(View arg0){
			listingNumberString.append(++count + "\n");
			listingNumber.setText(listingNumberString.toString());
			dataString.append("TEST\n");
			data.setText(dataString.toString());
		}
	};

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
