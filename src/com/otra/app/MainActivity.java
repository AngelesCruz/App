package com.otra.app;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnClickListener{

	private static int contador=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		View boton = findViewById(R.id.botonID);
		boton.setOnClickListener(this);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

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

	/**
	 * A placeholder fragment containing a simple view.
	 */


	@Override
	public void onClick(View v) {
		if(v.getId()==findViewById(R.id.botonID).getId()){
			TextView texto=(TextView)findViewById(R.id.textoID);
			cambiaCont(texto);
		}
	}
	
	
	private void cambiaCont(TextView t){
		Resources res=getResources();
		String[] orar=res.getStringArray(R.array.bendiciones);
		
		if(contador==orar.length){
			contador=0;
			t.setText(orar[contador++]);
		}else{
			t.setText(orar[contador++]);
		}
	}

}
