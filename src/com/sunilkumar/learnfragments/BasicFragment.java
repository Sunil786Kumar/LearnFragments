package com.sunilkumar.learnfragments;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class BasicFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.basic_fragment, container,false);
	
		Button button = (Button)view.findViewById(R.id.button_fragment);
		// TODO Auto-generated method stub
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Activity activity = getActivity();


				if (activity != null) {

					Toast.makeText(activity, "R.string._clicked_a_fragment", Toast.LENGTH_LONG).show();
//					Intent intent = new Intent(Intent.ACTION_SEND);
//					intent.putExtra(Intent.EXTRA_EMAIL, R.array.emails);
//					startActivity(intent);
//					
					
				}

			}
		});
		return view;
	}





}
