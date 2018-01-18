package com.example.baserecycleviewsample.utils;
import com.example.baserecycleviewsample.bean.DataBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/1/18.
 */

public class ConvertUtils {

    public static List<DataBean> getBean(List<DataBean> dataBeanList) {
        List<DataBean> beanList = new ArrayList<>();
        for (DataBean dataBean : dataBeanList) {
            dataBean.isHeader = true;
            beanList.add(dataBean);
            for (DataBean.SubCategoryBean subCategoryBean : dataBean.getSub_category()) {
                DataBean bean = new DataBean(false, "header", subCategoryBean.getCategory_id(), subCategoryBean.getCategory_image(), subCategoryBean.getCategory_index(),
                        subCategoryBean.getCategory_name(), subCategoryBean.getCategory_nick(), subCategoryBean.getCreate_time());
                beanList.add(bean);
            }

        }
        return beanList;
    }
}
