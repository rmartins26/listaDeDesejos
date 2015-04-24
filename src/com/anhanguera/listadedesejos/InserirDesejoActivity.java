package com.anhanguera.listadedesejos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class InserirDesejoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inserir_desejo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inserir_desejo, menu);
		return true;
	}

}
