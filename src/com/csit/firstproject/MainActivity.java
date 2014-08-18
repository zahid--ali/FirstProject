package com.csit.firstproject;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

@SuppressLint("NewApi")
public class MainActivity extends Activity{
	
	Button Add,Subtract;
	TextView show;
	int counter=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Bundle x  = getIntent().getExtras();
		String username = x.getString("Username", null);
Toast.makeText(getApplicationContext(), username,5000).show();
		Add = (Button)findViewById(R.id.btnAdd);
		Subtract = (Button)findViewById(R.id.btnSubtract);
		show = (TextView)findViewById(R.id.tvshow);
		show.setText(String.valueOf(counter));
		
		Add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			//TODO
				counter++;
				show.setText(String.valueOf(counter));
				
			}
		});
		Subtract.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter--;
				show.setText(String.valueOf(counter));
			}
		});
		
	}
	
}