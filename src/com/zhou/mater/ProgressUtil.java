package com.zhou.mater;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class ProgressUtil {
	
	public static Dialog  loadingDialog;
	
	public static void showProgress(Context context)
	{
		View v = LayoutInflater.from(context).inflate(R.layout.pop_dialog, null);
	    loadingDialog = new Dialog(context, R.style.loading_dialog2);
		loadingDialog.setCancelable(true);
		loadingDialog.setContentView(v, new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.MATCH_PARENT));
		loadingDialog.show();
	}
	
	public static void hideProgress()
	{
		if(loadingDialog!=null)
		{
			loadingDialog.dismiss();
		}
	}

}
