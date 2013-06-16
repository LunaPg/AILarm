package com.example.ailarm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.view.View.OnTouchListener;
import android.view.View.OnClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnTouchListener, View.OnClickListener {

	private TextView playlist = null;
	private TextView alarm = null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		setContentView(R.layout.activity_main);
		alarm = (TextView)findViewById(R.id.textView1);
		alarm.setText("Vos AILarm");
		//playlist = new TextView(this);
		//playlist.setText("Vos playlists");
		//playlist.setText(R.string.hello_world);
		//setContentView(playlist);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
