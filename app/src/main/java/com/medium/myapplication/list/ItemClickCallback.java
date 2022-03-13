package com.medium.myapplication.list;

import android.view.View;

public interface ItemClickCallback {
    void onItemClicked(View view, String studentName, String studentClass, String studentBirth);
}
