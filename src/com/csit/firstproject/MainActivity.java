package com.csit.firstproject;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity{
	
	Button Add,Subtract;
	TextView show;
	int counter=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Add = (Button)findViewById(R.id.btnAdd);
		Subtract = (Button)findViewById(R.id.btnSubtract);
		show = (TextView)findViewById(R.id.tvshow);
		show.setText(counter);
		
		Add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			//TODO
				counter++;
				show.setText(counter);
				
			}
		});
		Subtract.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter--;
				show.setText(counter);
			}
		});
		
	}
	
}