package com.sunilkumar.learnfragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class BasicFragment2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		View view = inflater.inflate(R.layout.basic_fragment2, container,false);
		Button button = (Button)view.findViewById(R.id.button1);
		
		
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Activity activity = getActivity();
				System.out.println("Activity is");

				if (activity != null) {
					Toast.makeText(activity, "R.string.toast_you_just_clicked_a_fragment", Toast.LENGTH_LONG).show();
					System.out.println("Clicking");
				}

			}
		});
		return view;
		
	}
	
	

}
