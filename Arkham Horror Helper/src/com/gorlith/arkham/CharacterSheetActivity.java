package com.gorlith.arkham;

import java.lang.reflect.Field;

import com.gorlith.arkham.R;
import com.gorlith.arkham.R.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CharacterSheetActivity extends Activity {
	int sanity, stamina;
	TextView tvSanity, tvStamina;
	LinearLayout image;
	Button addSanity, subSanity, addStamina, subStamina;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.char_sheet);
		tvSanity = (TextView) findViewById(R.id.tvSanity);
		tvStamina = (TextView) findViewById(R.id.tvStamina);

		addSanity = (Button) findViewById(R.id.btnSanityAdd);
		subSanity = (Button) findViewById(R.id.btnSanitySub);

		addStamina = (Button) findViewById(R.id.btnStaminaAdd);
		subStamina = (Button) findViewById(R.id.btnStaminaSub);

		addSanity.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				sanity++;
				tvSanity.setText("" + sanity);
			}
		});

		subSanity.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				sanity--;
				tvSanity.setText("" + sanity);
			}
		});

		addStamina.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				stamina++;
				tvStamina.setText("" + stamina);
			}
		});

		subStamina.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				stamina--;
				tvStamina.setText("" + stamina);
			}
		});
	}

	@Override
	protected void onStart() {
		super.onStart();
		Investigator investigator = MyApp.INVESTIGATORS.get(getIntent()
				.getIntExtra("char_id", 0));
		image = (LinearLayout) findViewById(R.id.charSheetLayout);

		try {
			Class<drawable> res = R.drawable.class;
			Field field = res.getField(investigator.getImgName());
			int drawableId = field.getInt(null);
			image.setBackgroundDrawable(getResources().getDrawable(drawableId));
		} catch (Exception e) {
			Log.e("MyTag", "Failure to get drawable id.", e);
		}

		sanity = investigator.getSanity();
		tvSanity.setText("" + sanity);

		stamina = investigator.getStamina();
		tvStamina.setText("" + stamina);

	}
}
