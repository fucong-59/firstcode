package com.example1.firstcode1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ThirdActivity extends Activity{
	protected  void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.third_activity);
		}
}
