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

public class Abc extends Activity implements OnClickListener{

	MediaPlayer med;
	Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kid);
        
        initializeVar();
        
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
        med = MediaPlayer.create(Abc.this, R.raw.a);
        
        
    }
	
	private void initializeVar() {
		// TODO Auto-generated method stub
		a = (Button) findViewById(R.id.button1);
		b = (Button) findViewById(R.id.button2);
		c = (Button) findViewById(R.id.button3);
		d = (Button) findViewById(R.id.button4);
		e = (Button) findViewById(R.id.button5);
		f = (Button) findViewById(R.id.button6);
		g = (Button) findViewById(R.id.button7);
		h = (Button) findViewById(R.id.button8);
		i = (Button) findViewById(R.id.button9);
		j = (Button) findViewById(R.id.button10);
		k = (Button) findViewById(R.id.button11);
		l = (Button) findViewById(R.id.button12);
		m = (Button) findViewById(R.id.button13);
		n = (Button) findViewById(R.id.button14);
		o = (Button) findViewById(R.id.button15);
		p = (Button) findViewById(R.id.button16);
		q = (Button) findViewById(R.id.button17);
		r = (Button) findViewById(R.id.button18);
		s = (Button) findViewById(R.id.button19);
		t = (Button) findViewById(R.id.button20);
		u = (Button) findViewById(R.id.button21);
		v = (Button) findViewById(R.id.button22);
		w = (Button) findViewById(R.id.button23);
		x = (Button) findViewById(R.id.button24);
		y = (Button) findViewById(R.id.button25);
		z = (Button) findViewById(R.id.button26);
		
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	
		switch(arg0.getId()){
		case R.id.button1:
		
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.a);
			med.start();
			Intent newAct1 = new Intent("com.example.finalkidsapp.ACLASS");
			startActivity(newAct1);
			break;
		case R.id.button2:
			
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.b);
			med.start();
			Intent newAct2 = new Intent("com.example.finalkidsapp.BCLASS");
			startActivity(newAct2);
			break;
		case R.id.button3:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.c);
			med.start();
			Intent newAct3 = new Intent("com.example.finalkidsapp.CCLASS");
			startActivity(newAct3);
			break;
		case R.id.button4:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.d);
			med.start();
			Intent newAct4 = new Intent("com.example.finalkidsapp.DCLASS");
			startActivity(newAct4);
			break;
		case R.id.button5:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.e);
			med.start();
			Intent newAct5 = new Intent("com.example.finalkidsapp.ECLASS");
			startActivity(newAct5);
			break;
		case R.id.button6:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.f);
			med.start();
			Intent newAct6 = new Intent("com.example.finalkidsapp.FCLASS");
			startActivity(newAct6);
			break;
		case R.id.button7:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.g);
			med.start();
			Intent newAct7 = new Intent("com.example.finalkidsapp.GCLASS");
			startActivity(newAct7);
			break;
		case R.id.button8:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.h);
			med.start();
			Intent newAct8 = new Intent("com.example.finalkidsapp.HCLASS");
			startActivity(newAct8);
			break;
		case R.id.button9:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.i);
			med.start();
			Intent newAct9 = new Intent("com.example.finalkidsapp.ICLASS");
			startActivity(newAct9);
			break;
		case R.id.button10:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.j);
			med.start();
			Intent newAct10 = new Intent("com.example.finalkidsapp.JCLASS");
			startActivity(newAct10);
			break;
		case R.id.button11:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.k);
			med.start();
			Intent newAct11 = new Intent("com.example.finalkidsapp.KCLASS");
			startActivity(newAct11);
			break;
		case R.id.button12:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.l);
			med.start();
			Intent newAct12 = new Intent("com.example.finalkidsapp.LCLASS");
			startActivity(newAct12);
			break;
		case R.id.button13:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.m);
			med.start();
			Intent newAct13 = new Intent("com.example.finalkidsapp.MCLASS");
			startActivity(newAct13);
			break;
		case R.id.button14:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.n);
			med.start();
			Intent newAct14 = new Intent("com.example.finalkidsapp.NCLASS");
			startActivity(newAct14);
			break;
		case R.id.button15:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.o);
			med.start();
			Intent newAct15 = new Intent("com.example.finalkidsapp.OCLASS");
			startActivity(newAct15);
			break;
		case R.id.button16:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.p);
			med.start();
			Intent newAct16 = new Intent("com.example.finalkidsapp.PCLASS");
			startActivity(newAct16);
			break;
		case R.id.button17:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.q);
			med.start();
			Intent newAct17 = new Intent("com.example.finalkidsapp.QCLASS");
			startActivity(newAct17);
			break;
		case R.id.button18:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.r);
			med.start();
			Intent newAct18 = new Intent("com.example.finalkidsapp.RCLASS");
			startActivity(newAct18);
			break;
		case R.id.button19:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.s);
			med.start();
			Intent newAct19 = new Intent("com.example.finalkidsapp.SCLASS");
			startActivity(newAct19);
			break;
		case R.id.button20:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.t);
			med.start();
			Intent newAct20 = new Intent("com.example.finalkidsapp.TCLASS");
			startActivity(newAct20);
			break;
		case R.id.button21:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.u);
			med.start();
			Intent newAct21 = new Intent("com.example.finalkidsapp.UCLASS");
			startActivity(newAct21);
			break;
		case R.id.button22:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.v);
			med.start();
			Intent newAct22 = new Intent("com.example.finalkidsapp.VCLASS");
			startActivity(newAct22);
			break;
		case R.id.button23:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.w);
			med.start();
			Intent newAct23 = new Intent("com.example.finalkidsapp.WCLASS");
			startActivity(newAct23);
			break;
		case R.id.button24:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.x);
			med.start();
			Intent newAct24 = new Intent("com.example.finalkidsapp.XCLASS");
			startActivity(newAct24);
			break;
		case R.id.button25:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.y);
			med.start();
			Intent newAct25 = new Intent("com.example.finalkidsapp.YCLASS");
			startActivity(newAct25);
			break;
		case R.id.button26:
			med.release();
			med = MediaPlayer.create(Abc.this, R.raw.z);
			med.start();
			Intent newAct26 = new Intent("com.example.finalkidsapp.ZCLASS");
			startActivity(newAct26);
			break;
		
		}
	}
}
