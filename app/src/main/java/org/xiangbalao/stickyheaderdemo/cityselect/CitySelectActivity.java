package org.xiangbalao.stickyheaderdemo.cityselect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.linkvin.common.widget.stickyheaders.StickyHeaderLayoutManager;

import org.xiangbalao.stickyheaderdemo.R;
import org.xiangbalao.stickyheaderdemo.cityselect.adapter.CitySelectAdapter;
import org.xiangbalao.stickyheaderdemo.model.City;
import org.xiangbalao.stickyheaderdemo.model.CityList;
import org.xiangbalao.stickyheaderdemo.model.Counties;
import org.xiangbalao.stickyheaderdemo.utils.GsonUtil;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Shows a fake addressbook listing, loaded from randomuser.me, where the people are sorted
 * into sections by the first letter of last name.
 */
public class CitySelectActivity extends AppCompatActivity {
	protected RecyclerView recyclerView;
	private CitySelectAdapter adapter = new CitySelectAdapter();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);
		recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
		recyclerView.setLayoutManager(new StickyHeaderLayoutManager());
		recyclerView.setAdapter(adapter);

	}





	@Override
	protected void onResume() {
		super.onResume();
		recyclerView.setVisibility(View.GONE);
		recyclerView.setVisibility(View.VISIBLE);
		adapter.setCity(getData());
		adapter.setListener(new CitySelectAdapter.ItemClickListener() {
			@Override
			public void onItemHeadClick(City city) {
				Toast.makeText(CitySelectActivity.this,city.getCityName(),Toast.LENGTH_LONG).show();
			}

			@Override
			public void onItemClick(Counties countie) {
				Toast.makeText(CitySelectActivity.this,countie.getCityName()+countie.getCountyName(),Toast.LENGTH_LONG).show();
			}
		});

	}







	private List<City> getData() {

		InputStream is = getResources().openRawResource(R.raw.select);
		InputStreamReader isr = new InputStreamReader(is);
		CityList data = GsonUtil.changeGsonToBean(isr, CityList.class);

		List<City>   cityList  =data.getData();
		//	Person[] arr = new Gson().fromJson(is, Person[].class);
		//return Arrays.asList(arr);
		return cityList;
	}





}
