package com.akhil.assignmentmvp.ui.main;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akhil.assignmentmvp.R;
import com.akhil.assignmentmvp.data.model.EventsDatum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

public class CheckInHistoryAdapter  extends RecyclerView.Adapter<CheckInHistoryAdapter.DataViewHolder>{

    private List<EventsDatum> mList;

    @Inject
    public CheckInHistoryAdapter() {
        mList = new ArrayList<>();
    }
    public void setData(ArrayList<EventsDatum> hotel) {
        mList = hotel;
    }
    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        return new DataViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(CheckInHistoryAdapter.DataViewHolder holder, int position) {
        SimpleDateFormat defaultformat = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat newformat = new SimpleDateFormat("hh:mm a");
        Date date = null;
        try {
            date = defaultformat.parse(mList.get(position).getEvent().time);
            String time = newformat.format(date);
            holder.checkedInTime.setText("Checked in at "+time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

            holder.eventDesc.setText(mList.get(position).getEvent().getName());
            holder.eventLocation.setText(mList.get(position).getEvent().getPlace().getAddress());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class DataViewHolder extends RecyclerView.ViewHolder {

        private final TextView checkedInTime;
        private final TextView eventDesc;
        private final TextView eventLocation;

        public DataViewHolder(View itemView) {
            super(itemView);
            checkedInTime = (TextView) itemView.findViewById(R.id.checkedInTime);
            eventDesc = (TextView)itemView.findViewById(R.id.eventDesc);
            eventLocation = (TextView)itemView.findViewById(R.id.eventLocation);
        }
    }
}
