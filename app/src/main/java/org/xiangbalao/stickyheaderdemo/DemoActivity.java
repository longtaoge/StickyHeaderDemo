package org.xiangbalao.stickyheaderdemo;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/**
 * Base activity for StickyHeadersApp demos
 */
public class DemoActivity extends AppCompatActivity {

	private static final String TAG = DemoActivity.class.getSimpleName();
	private static final String STATE_SCROLL_POSITION = "DemoActivity.STATE_SCROLL_POSITION";

	public static final boolean SHOW_ADAPTER_POSITIONS = true;


protected 	RecyclerView recyclerView;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(getContentViewLayout());
		recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


	}

	@LayoutRes
	protected int getContentViewLayout(){
		return R.layout.activity_demo;
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		RecyclerView.LayoutManager lm = recyclerView.getLayoutManager();
		Parcelable scrollState = lm.onSaveInstanceState();
		outState.putParcelable(STATE_SCROLL_POSITION, scrollState);
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		if (savedInstanceState != null) {
			recyclerView.getLayoutManager().onRestoreInstanceState(savedInstanceState.getParcelable(STATE_SCROLL_POSITION));
		}
	}








}
