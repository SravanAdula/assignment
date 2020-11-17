package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.myapplication.R;
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
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        ViewHolder viewHolder;
        if(view==null)
        {
            view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main,null);
            viewHolder=new ViewHolder(view);
            view.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder)view.getTag();
        }
        User admin= (User) getItem(position);
        viewHolder.title.setText(admin.getTitle());
        viewHolder.ratings.setText(admin.getRatings());
        viewHolder.description.setText(admin.getDescription());
        viewHolder.imageView.setImageResource(admin.getAdminImages());
        return view;
    }

    class ViewHolder
    {
        TextView title;
        TextView ratings;
        TextView description;
        ImageView imageView;

        public ViewHolder(View view)
        {
            title=view.findViewById(R.id.movieTitle);
            ratings=view.findViewById(R.id.rating);
            description=view.findViewById(R.id.description);
            imageView=view.findViewById(R.id.imageView);
        }
    }

}

