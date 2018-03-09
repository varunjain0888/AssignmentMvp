
package com.akhil.assignmentmvp.ui.main;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.akhil.assignmentmvp.R;
import com.akhil.assignmentmvp.data.model.EventsDatum;
import com.akhil.assignmentmvp.utils.Constants;
import com.akhil.assignmentmvp.utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

import javax.inject.Inject;


public class CheckInHistorySectionListAdapter extends RecyclerView.Adapter<CheckInHistorySectionListAdapter.CheckInHistoryViewHolder> {

    private LinkedHashMap<String,ArrayList<EventsDatum>> mSectionList;
    private Context context;

    @Inject
    public CheckInHistorySectionListAdapter() {
        mSectionList = new LinkedHashMap<>();
    }

    public void setData(LinkedHashMap<String,ArrayList<EventsDatum>> list, Context context) {
        this.mSectionList = list;
        this.context = context;
    }

    @Override
    public CheckInHistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.section_header_row, parent, false);
        return new CheckInHistoryViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(CheckInHistorySectionListAdapter.CheckInHistoryViewHolder holder, int position) {
        holder.itemsList.setHasFixedSize(true);
        holder.itemsList.setNestedScrollingEnabled(false);
        holder.itemsList.setLayoutManager(new LinearLayoutManager(context));
        CheckInHistoryAdapter adapter = new CheckInHistoryAdapter();
        holder.itemsList.setAdapter(adapter);
        adapter.setData(mSectionList.get(mSectionList.keySet().toArray()[position]));

        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat formatDayOfMonth  = new SimpleDateFormat("d");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
        SimpleDateFormat dayName = new SimpleDateFormat(" - EEEE");

        try {
            Date date = dateformat.parse((mSectionList.keySet().toArray()[position]).toString());
            String month = monthFormat.format(date);
            int day = Integer.parseInt(formatDayOfMonth.format(date));
            String day_formated = day+Utils.suffixes[day];
            String dayName_formated = dayName.format(date);

            holder.tittle.setText(month+" "+day_formated+ dayName_formated);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return mSectionList.size();
    }

    class CheckInHistoryViewHolder extends RecyclerView.ViewHolder {

        private TextView tittle;
        private RecyclerView itemsList;

        public CheckInHistoryViewHolder(View itemView) {
            super(itemView);
            tittle = (TextView) itemView.findViewById(R.id.tittle);
            itemsList = (RecyclerView) itemView.findViewById(R.id.itemsList);
        }
    }
}

