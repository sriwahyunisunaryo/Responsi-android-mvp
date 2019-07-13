package com.responsi.mvp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.responsi.mvp.R;
import com.responsi.mvp.model.Name;
import com.responsi.mvp.model.ResultsItem;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {

    Context mContext;
    List<ResultsItem> resultsItemList;
    List<Name> nameList;

    public PeopleAdapter(Context mContext, List<ResultsItem> resultsItemList, List<Name> nameList) {
        this.mContext = mContext;
        this.resultsItemList = resultsItemList;
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public PeopleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleAdapter.ViewHolder holder, int position) {
        ResultsItem data = resultsItemList.get(position);
        String nameFull = resultsItemList.get(position).getName().getFirst()+""+resultsItemList.get(position).getName().getLast();

        Glide.with(mContext)
                .load(data.getPicture())
                .into(viewHolder.mImageGambar);

        ViewHolder.mTextName.setText(nameFull);
        ViewHolder.mTextPhone.setText(data.getPhone());
        ViewHolder.mTextEmail.setText(data.getEmail());

    }

    @Override
    public int getItemCount() {
        return resultsItemList();

        return 0;
    }
}
