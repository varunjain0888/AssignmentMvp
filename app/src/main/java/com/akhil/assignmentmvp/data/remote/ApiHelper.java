
package com.akhil.assignmentmvp.data.remote;

import android.util.Log;

import com.akhil.assignmentmvp.MyApplication;
import com.akhil.assignmentmvp.data.model.Event;
import com.akhil.assignmentmvp.data.model.EventsDatum;
import com.akhil.assignmentmvp.data.model.Place;
import com.akhil.assignmentmvp.utils.Constants;
import com.akhil.assignmentmvp.utils.Utils;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.interfaces.StringRequestListener;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class ApiHelper {

    @Inject
    public ApiHelper() {

    }

   /* public void getData(StringRequestListener listener) {
        AndroidNetworking.get(ApiEndPoint.GET_DATA)
                .addPathParameter("pageNumber", "0")
                .addQueryParameter("limit", "3")
                .build()
                .getAsString(listener);
    }*/

    public LinkedHashMap<String,ArrayList<EventsDatum>> getData(){
        ArrayList<EventsDatum> list = new ArrayList<>();
        LinkedHashMap<String,ArrayList<EventsDatum>> linkedHashMap = new LinkedHashMap<>();
        try {
            JSONObject obj = new JSONObject(Utils.loadJSONFromAsset(MyApplication.getContext(), Constants.DEFAULT_JSONFILE_PATH));
            JSONArray jsonArray = obj.getJSONArray("data");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject listObj = jsonArray.getJSONObject(i);
                EventsDatum eventsDatum = new EventsDatum();
                eventsDatum.setCreatedAt(listObj.getString("created_at"));

                eventsDatum.date = getDate(listObj.getString("created_at"));

                JSONObject eventObj = listObj.getJSONObject("event");
                Event event = new Event();
                event.setStartTime(eventObj.getString("start_time"));
                event.setName(eventObj.getString("name"));
                event.time = getTime(eventObj.getString("start_time"));

                JSONObject placeObj = eventObj.getJSONObject("place");
                Place place = new Place();
                place.setAddress(placeObj.getString("address"));

                event.setPlace(place);

                eventsDatum.setEvent(event);

                list.add(eventsDatum);
            }
            ArrayList<EventsDatum> temp = new ArrayList<>();
            ArrayList<EventsDatum> same_created_at_list;
            temp.addAll(list);

            for (int i = 0; i < list.size(); i++) {
                same_created_at_list = new ArrayList<>();
                Iterator<EventsDatum> it = temp.iterator();
                while (it.hasNext()) {
                    EventsDatum eventsDatum = it.next();
                    if (eventsDatum.date.equals(list.get(i).date)) {
                        same_created_at_list.add(eventsDatum);
                        it.remove();
                    }
                }
                linkedHashMap.put(list.get(i).date,same_created_at_list);
                if(temp.isEmpty()){
                    break;
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkedHashMap;
    }
    private String getDate(String craetedAt){
        String date_time[]=craetedAt.split("T");
        return date_time[0];
    }
    private String getTime(String craetedAt){
        String date_time[]=craetedAt.split("T");
        return date_time[1];
    }

}
