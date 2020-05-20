package com.falc.daynightthemedemo.adapter;

import androidx.recyclerview.widget.DiffUtil;

public class DiffUtilImpl extends DiffUtil.ItemCallback<String>{

    @Override
    public boolean areItemsTheSame(String oldItem, String newItem) {
        return oldItem.length() == newItem.length();
    }

    @Override
    public boolean areContentsTheSame(String oldItem, String newItem) {
        return oldItem.equals(newItem);
    }
}
