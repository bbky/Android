package com.example.twoactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	String tag = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(tag, "MainActivity1's protected void onCreate()");
		setContentView(R.layout.activity_main);
		
		
		Button button1_1 = (Button)this.findViewById(R.id.button1_1);
		
		button1_1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intentRef = new Intent();
				intentRef.setClass(MainActivity.this, MainActivity2.class);
				startActivity(intentRef);
				MainActivity.this.finish();
				
			}
			
		});
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



	@Override
	protected void onPause() {
		// TODO Auto-generated method stub

		super.onPause();
		
		Log.v(tag, "MainActivity1's protected void onPause()");
	}



	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.v(tag, "MainActivity1's protected void onResume()");
	}



	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.v(tag, "MainActivity1's protected void onStart()");
	}



	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.v(tag, "MainActivity1's protected void onStop()");
	}



	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.v(tag, "MainActivity1's protected void onDestroy()");
	}



	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.v(tag, "MainActivity1's protected void onRestart()");
	}

}
