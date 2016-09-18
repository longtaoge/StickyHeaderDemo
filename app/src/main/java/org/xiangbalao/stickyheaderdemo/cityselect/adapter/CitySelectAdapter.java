package org.xiangbalao.stickyheaderdemo.cityselect.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.linkvin.common.widget.stickyheaders.SectioningAdapter;

import org.xiangbalao.stickyheaderdemo.R;
import org.xiangbalao.stickyheaderdemo.model.City;
import org.xiangbalao.stickyheaderdemo.model.Counties;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter for Person items. Sorts them by last name into sections starting with the
 * first letter of the last name.
 */
public class CitySelectAdapter extends SectioningAdapter {

    // 城市
    public List<City> citys = new ArrayList<>();

    public void setListener(ItemClickListener listener) {
        this.listener = listener;
    }

    public ItemClickListener listener;

    public class ItemViewHolder extends SectioningAdapter.ItemViewHolder {

        View ll_root;
        TextView tv_counties;

        public ItemViewHolder(View itemView) {
            super(itemView);
            tv_counties = (TextView) itemView.findViewById(R.id.tv_counties);
            ll_root = itemView.findViewById(R.id.ll_root);
        }
    }

    public class HeaderViewHolder extends SectioningAdapter.HeaderViewHolder {
        TextView tv_title;
        View ll_root;

        public HeaderViewHolder(View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            ll_root = itemView.findViewById(R.id.ll_root);
        }
    }


    public CitySelectAdapter() {
    }


    public void setCity(List<City> citys) {
        this.citys = citys;
    }


    @Override
    public int getNumberOfSections() {
        return citys.size();
    }

    @Override
    public int getNumberOfItemsInSection(int sectionIndex) {
        return citys.get(sectionIndex).getCounties().size();
    }

    @Override
    public boolean doesSectionHaveHeader(int sectionIndex) {
        return true;
    }

    @Override
    public boolean doesSectionHaveFooter(int sectionIndex) {
        return false;
    }

    @Override
    public ItemViewHolder onCreateItemViewHolder(ViewGroup parent, int itemType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_city_select_list_city_counties, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public HeaderViewHolder onCreateHeaderViewHolder(ViewGroup parent, int headerType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_city_select_city_header, parent, false);
        return new HeaderViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindItemViewHolder(SectioningAdapter.ItemViewHolder viewHolder, int sectionIndex, int itemIndex, int itemType) {
        City s = citys.get(sectionIndex);
        ItemViewHolder ivh = (ItemViewHolder) viewHolder;
        final Counties countie = s.getCounties().get(itemIndex);
        ivh.tv_counties.setText(countie.getCountyName());
        ivh.ll_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onItemClick(countie);
                }
            }
        });
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindHeaderViewHolder(SectioningAdapter.HeaderViewHolder viewHolder, int sectionIndex, int headerType) {
        final City city = citys.get(sectionIndex);
        HeaderViewHolder hvh = (HeaderViewHolder) viewHolder;
        hvh.tv_title.setText(city.getCityName());
        hvh.ll_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                   listener.onItemHeadClick(city);
                }
            }
        });


    }


    public interface ItemClickListener {

        void onItemHeadClick(City city);

        void onItemClick(Counties countie);

    }


}
