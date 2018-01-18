package com.example.baserecycleviewsample.adapter;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.baserecycleviewsample.R;
import com.example.baserecycleviewsample.bean.DataBean;
import com.example.baserecycleviewsample.utils.ImageLoaderUtil;

import java.util.List;


/**
 * Created by admin on 2018/1/18.
 */

public class InfoAdapter extends BaseSectionQuickAdapter<DataBean, BaseViewHolder> {

    private Context mContext;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param layoutResId      The layout resource id of each item.
     * @param sectionHeadResId The section head layout id for each item
     * @param data             A new list is created out of this one to avoid mutable list
     */
    public InfoAdapter(Activity activity, int layoutResId, int sectionHeadResId, List<DataBean> data) {
        super(layoutResId, sectionHeadResId, data);
        this.mContext = activity;
    }

    @Override
    protected void convertHead(BaseViewHolder helper, DataBean item) {
        helper.setText(R.id.category_head, item.getCategory_name());
        ImageLoaderUtil.LoadImage(mContext, item.getCategory_image(), (ImageView) helper.getView(R.id.category_img));
        helper.addOnClickListener(R.id.rl_category_title);
    }

    @Override
    protected void convert(BaseViewHolder helper, DataBean item) {
        helper.setText(R.id.category_name, item.getCategory_name());
    }
}
