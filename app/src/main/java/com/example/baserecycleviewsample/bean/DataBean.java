package com.example.baserecycleviewsample.bean;

import com.chad.library.adapter.base.entity.SectionEntity;
import java.util.List;

/**
 * Created by admin on 2018/1/18.
 */

public class DataBean extends SectionEntity {

    /**
     * category_id : vq6VP0yKViN9QkV
     * category_image : http://image.51iradio.com//uploadnew/404181497338922.png
     * category_index : 1
     * category_name : fancy分类
     * category_nick : 0519分类
     * create_time : 2016-11-17 15:21:42
     * sub_category : [{"category_id":"97KrcDdzDW25gB6","category_image":"","category_index":"1","category_name":"111","category_nick":"","create_time":"2017-05-18 15:37:40"},{"category_id":"sR7A8cYBDlxJ74z","category_image":"","category_index":"2","category_name":"222","category_nick":"","create_time":"2017-05-18 15:37:41","sub_category":[]},{"category_id":"uMfTeaUEUxtesQZ","category_image":"","category_index":"3","category_name":"444","category_nick":"","create_time":"2017-05-18 15:37:43","sub_category":[]},{"category_id":"nfKjjo3UYSA4Xu9","category_image":"","category_index":"5","category_name":"555","category_nick":"","create_time":"2017-05-18 15:37:44","sub_category":[]},{"category_id":"jXc5JNCkcIUcu1e","category_image":"","category_index":"6","category_name":"666","category_nick":"","create_time":"2017-05-18 15:37:45","sub_category":[]},{"category_id":"rR32RoB1TxjuOAw","category_image":"","category_index":"7","category_name":"777","category_nick":"","create_time":"2017-05-18 15:39:19","sub_category":[]},{"category_id":"oYp4d5ZH7CdVnLG","category_image":"","category_index":"8","category_name":"888","category_nick":"","create_time":"2017-05-18 15:39:20","sub_category":[]},{"category_id":"EN4sa2b5sdrp4bq","category_image":"","category_index":"9","category_name":"999","category_nick":"","create_time":"2017-05-19 16:38:07","sub_category":[]},{"category_id":"swnnqBjcoCk5f2r","category_image":"","category_index":"99","category_name":"水电费3","category_nick":"","create_time":"2017-06-13 15:32:46","sub_category":[]},{"category_id":"xWcRAjKpKWJKlVZ","category_image":"","category_index":"99","category_name":"水电费","category_nick":"","create_time":"2017-06-13 15:29:20","sub_category":[]},{"category_id":"k9uQaICDO1OauyK","category_image":"","category_index":"99","category_name":"水电费2","category_nick":"","create_time":"2017-05-18 15:37:42","sub_category":[]},{"category_id":"VFUUz2xhEcKcq6F","category_image":"","category_index":"99","category_name":"水电费1","category_nick":"","create_time":"2017-06-13 15:33:42","sub_category":[]},{"category_id":"AHdj1NWph7OA9Dk","category_image":"","category_index":"99","category_name":"水电费4","category_nick":"","create_time":"2017-06-13 19:20:19","sub_category":[]},{"category_id":"SIkLULuG8VgGtHO","category_image":"","category_index":"99","category_name":"水电费5","category_nick":"","create_time":"2017-06-13 19:20:20","sub_category":[]}]
     */

    private String category_id;
    private String category_image;
    private String category_index;
    private String category_name;
    private String category_nick;
    private String create_time;
    private List<SubCategoryBean> sub_category;

   // boolean isHeader=true;

    public DataBean(boolean isHeader, String header) {
        super(true, header);
    }

    public DataBean(Object o) {
        super(o);
    }

    public DataBean(boolean isHeader, String header, String category_id, String category_image, String category_index, String category_name, String category_nick, String create_time) {
        super(isHeader, header);
        this.category_id = category_id;
        this.category_image = category_image;
        this.category_index = category_index;
        this.category_name = category_name;
        this.category_nick = category_nick;
        this.create_time = create_time;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCategory_image() {
        return category_image;
    }

    public void setCategory_image(String category_image) {
        this.category_image = category_image;
    }

    public String getCategory_index() {
        return category_index;
    }

    public void setCategory_index(String category_index) {
        this.category_index = category_index;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_nick() {
        return category_nick;
    }

    public void setCategory_nick(String category_nick) {
        this.category_nick = category_nick;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public List<SubCategoryBean> getSub_category() {
        return sub_category;
    }

    public void setSub_category(List<SubCategoryBean> sub_category) {
        this.sub_category = sub_category;
    }


    public static class SubCategoryBean extends SectionEntity  {
        /**
         * category_id : 97KrcDdzDW25gB6
         * category_image :
         * category_index : 1
         * category_name : 111
         * category_nick :
         * create_time : 2017-05-18 15:37:40
         * sub_category : []
         */

        private String category_id;
        private String category_image;
        private String category_index;
        private String category_name;
        private String category_nick;
        private String create_time;
        private List<?> sub_category;

        public SubCategoryBean(boolean isHeader, String header) {
            super(isHeader, header);
        }

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public String getCategory_image() {
            return category_image;
        }

        public void setCategory_image(String category_image) {
            this.category_image = category_image;
        }

        public String getCategory_index() {
            return category_index;
        }

        public void setCategory_index(String category_index) {
            this.category_index = category_index;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public String getCategory_nick() {
            return category_nick;
        }

        public void setCategory_nick(String category_nick) {
            this.category_nick = category_nick;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public List<?> getSub_category() {
            return sub_category;
        }

        public void setSub_category(List<?> sub_category) {
            this.sub_category = sub_category;
        }

    }
}
