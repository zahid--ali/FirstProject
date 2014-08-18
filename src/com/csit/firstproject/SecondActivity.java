package com.csit.firstproject;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {
Button Submit;
TextView tvusername,tvpassword;
EditText etusername,etpassword;
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_second);
	
	
	Submit = (Button)findViewById(R.id.btnSumbit);
	tvusername = (TextView)findViewById(R.id.tvUsername);
	tvpassword = (TextView)findViewById(R.id.tvPassword);
	etusername = (EditText)findViewById(R.id.etUsername);
	etpassword = (EditText)findViewById(R.id.etPassword);

	Submit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		String username,password;
		username = etusername.getText().toString();
		password =etpassword.getText().toString();
		
		
		if((username.equals("zahid"))&&(password.equals("123456"))){
			
			//Toast.makeText(getApplicationContext(), "Welcome",Toast.LENGTH_LONG).show();
			//startActivity(new Intent(SecondActivity.this,MainActivity.class));
			Intent i = new Intent(SecondActivity.this,MainActivity.class);
			String welcomemessage = "Welcome" + username;
			i.putExtra("Username", welcomemessage);
			startActivity(i);
			
		}
		else
		{
			Toast.makeText(getApplicationContext(), "Invalid Username and Password",Toast.LENGTH_LONG).show();
			
		}
		
//			tvusername.setText(username);
//			tvpassword.setText(password);
			
		}
	});
	

}	
}
