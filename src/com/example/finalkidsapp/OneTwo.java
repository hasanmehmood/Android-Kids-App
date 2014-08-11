package com.example.finalkidsapp;

import android.R.layout;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class OneTwo extends Activity implements OnClickListener{

	
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	MediaPlayer med;
	LinearLayout lay;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one);
		
		b0 = (Button) findViewById(R.id.button1);
		b1 = (Button) findViewById(R.id.button2);
		b2 = (Button) findViewById(R.id.button3);
		b3 = (Button) findViewById(R.id.button4);
		b4 = (Button) findViewById(R.id.button5);
		b5 = (Button) findViewById(R.id.button6);
		b6 = (Button) findViewById(R.id.button7);
		b7 = (Button) findViewById(R.id.button8);
		b8 = (Button) findViewById(R.id.button9);
		b9 = (Button) findViewById(R.id.button10);
		
		b0.setOnClickListener(this);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		
		med = MediaPlayer.create(OneTwo.this, R.raw.zero);
		lay = (LinearLayout) findViewById(R.id.lay1);
		
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		switch(arg0.getId()){
		
		case R.id.button1:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic11a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.zero);
			med.start();
			break;
		case R.id.button2:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic2a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.one);
			med.start();
			break;
		case R.id.button3:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic3a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.two);
			med.start();
			break;
		case R.id.button4:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic4a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.three);
			med.start();
			break;
		case R.id.button5:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic5a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.four);
			med.start();
			break;
		case R.id.button6:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic6a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.five);
			med.start();
			break;
		case R.id.button7:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic7a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.six);
			med.start();
			break;
		case R.id.button8:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic8a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.seven);
			med.start();
			break;
		case R.id.button9:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic9a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.eight);
			med.start();
			break;
		case R.id.button10:
			lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.pic10a));
			med.release();
			med = MediaPlayer.create(OneTwo.this, R.raw.nine);
			med.start();
			break;
		
		}
	}
}
