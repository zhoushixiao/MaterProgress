package com.zhou.mater;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Dialog2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialog2);
		
		
	Button btn1=(Button) findViewById(R.id.dialog2_button1);
		
		btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				ProgressUtil.showProgress(Dialog2Activity.this);
			}
		});
		
		
	}
}
