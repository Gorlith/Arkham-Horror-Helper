package com.gorlith.arkham;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class ArkhamHorrorHelperActivity extends Activity {
	
	ImageButton ahButton, dhButton;
	ListView lv;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.char_list);

		lv = (ListView) findViewById(R.id.lvCharacters);
		
		loadListView(lv);
		
		ahButton = (ImageButton) findViewById(R.id.ahButton);
		
		ahButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				MyApp.ahInvestigators();
				loadListView(lv);
			}
		});
		
		dhButton = (ImageButton) findViewById(R.id.dhButton);
		
		dhButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				MyApp.dhInvestigators();
				loadListView(lv);
			}
		});
	}

	protected void loadListView(ListView lv) {
		lv.setAdapter(new ArrayAdapter<Investigator>(this,
				R.layout.char_list_item, MyApp.INVESTIGATORS));
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(getApplicationContext(),
						CharacterSheetActivity.class);
				intent.putExtra("char_id", position);
				startActivity(intent);
			}
		});
	}
}
