package com.example.finalkidsapp;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Colors extends Activity implements OnClickListener{

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	RelativeLayout lay;
	MediaPlayer med;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.color);
		
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		
		lay = (RelativeLayout) findViewById(R.id.lay1);
		med = MediaPlayer.create(Colors.this, R.raw.white1);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		
		case R.id.button1:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.white1);
			med.start();
			Intent newAct1 = new Intent("com.example.finalkidsapp.WHITECLASS");
			startActivity(newAct1);
			break;
		case R.id.button2:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.blue1);
			med.start();
			Intent newAct2 = new Intent("com.example.finalkidsapp.BLUECLASS");
			startActivity(newAct2);
			break;
		case R.id.button3:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.pink1);
			med.start();
			Intent newAct3 = new Intent("com.example.finalkidsapp.PINKCLASS");
			startActivity(newAct3);
			break;
		case R.id.button4:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.green1);
			med.start();
			Intent newAct4 = new Intent("com.example.finalkidsapp.GREENCLASS");
			startActivity(newAct4);
			break;
		case R.id.button5:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.red1);
			med.start();
			Intent newAct5 = new Intent("com.example.finalkidsapp.REDCLASS");
			startActivity(newAct5);
			break;
		case R.id.button6:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.yellow1);
			med.start();
			Intent newAct6 = new Intent("com.example.finalkidsapp.YELLOWCLASS");
			startActivity(newAct6);
			break;
		case R.id.button7:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.orange1);
			med.start();
			Intent newAct7 = new Intent("com.example.finalkidsapp.ORANGECLASS");
			startActivity(newAct7);
			break;
		case R.id.button8:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.brown1);
			med.start();
			Intent newAct8 = new Intent("com.example.finalkidsapp.BROWNCLASS");
			startActivity(newAct8);
			break;
		case R.id.button9:
			med.release();
			med = MediaPlayer.create(Colors.this, R.raw.black1);
			med.start();
			Intent newAct9 = new Intent("com.example.finalkidsapp.BLACKCLASS");
			startActivity(newAct9);
			break;
		}
	}
}
