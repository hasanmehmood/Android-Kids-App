package com.example.finalkidsapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements OnClickListener{

	Button b1, b2, b3, b4, b5;
	RelativeLayout lay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		
		
		
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		switch(arg0.getId()){
		
		case R.id.button1:
			Intent startNewActivity1 = new Intent("com.example.finalkidsapp.ABC");
			startActivity(startNewActivity1);
			break;
		case R.id.button2:
			Intent startNewActivity = new Intent("com.example.finalkidsapp.ONETWO");
			startActivity(startNewActivity);
			break;
		case R.id.button3:
			Intent startNewActivity2 = new Intent("com.example.finalkidsapp.COLORS");
			startActivity(startNewActivity2);
			break;
		case R.id.button4:
			Intent startNewActivity3 = new Intent("com.example.finalkidsapp.ABOUTUS");
			startActivity(startNewActivity3);
			break;
		case R.id.button5:
			finish();
			break;
		}
	}
}
