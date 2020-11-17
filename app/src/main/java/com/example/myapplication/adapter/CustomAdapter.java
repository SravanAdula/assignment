package com.example.myapplication.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.myapplication.models.User;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    ArrayList<User>admin;
    public CustomAdapter(ArrayList<User>admin) {
        this.admin=admin;

    }
    @Override
    public int getCount() {
        return admin.size();
    }

    @Override
    public Object getItem(int position) {
        return admin.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
