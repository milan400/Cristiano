package com.example.kiran.cr7;


import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {


    public GalleryFragment() {
        // Required empty public constructor
    }


    private RecyclerView mrecycleview;
    private CardView mcardview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        mrecycleview = (RecyclerView) view.findViewById(R.id.recycle_view);
        mcardview = (CardView) view.findViewById(R.id.card_view);
        new JSONTASK().execute();
        return view;
    }

    public class JSONTASK extends AsyncTask<String,String,ArrayList<Item>> implements Adapter.OnCardClickListner {


        @Override
        protected ArrayList<Item> doInBackground(String... strings) {
            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {

                AssetManager assetManager = getContext().getAssets();
                InputStream stream = assetManager.open("json.txt");

                //buffferreader helps to read the stream
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();

                String line = "";
                while((line = reader.readLine())!= null){
                    buffer.append(line);
                }

                String finalJson = buffer.toString();
                JSONObject parentObject  = new JSONObject(finalJson);
                JSONArray parentarray = parentObject.getJSONArray("movies");
                Gson gson = new Gson();

                ArrayList<Item> movieModelList = new ArrayList<>();

                for (int i=0;i<parentarray.length();i++) {
                    JSONObject finalobject = parentarray.getJSONObject(i);
                    Item movieModel = gson.fromJson(finalobject.toString(),Item.class);
                    //adding the final object in the list
                    movieModelList.add(movieModel);
                }
                return movieModelList;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally {
                if(connection != null) {
                    connection.disconnect();
                }
                try {
                    if(reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;

        }

        @Override
        protected void onPostExecute(ArrayList<Item> result) {
            super.onPostExecute(result);

            GridLayoutManager manager = new GridLayoutManager(getContext(),2);
            manager.setOrientation(GridLayoutManager.VERTICAL);
            mrecycleview.setLayoutManager(manager);
            Adapter adapter = new Adapter(getContext(),result);
            mrecycleview.setAdapter(adapter);
            adapter.setOnCardClickListner(this);
        }

        @Override
        public void OnCardClicked(View view, int position) {

        }
    }

}










































