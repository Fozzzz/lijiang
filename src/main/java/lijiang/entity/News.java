package lijiang.entity;

/**
 * Created by Administrator on 2016/11/7.
 */
public class News {
    private Integer n_id;
    private String n_type;
    private String n_title;
    private String n_content;
    private String n_picture;//封面图片
    private String n_date;
    private String n_author;

    public News(Integer n_id, String n_type, String n_title, String n_content, String n_picture, String n_date, String n_author) {
        this.n_id = n_id;
        this.n_type = n_type;
        this.n_title = n_title;
        this.n_content = n_content;
        this.n_picture = n_picture;
        this.n_date = n_date;
        this.n_author = n_author;
    }

    public News() {
    }

    public Integer getN_id() {
        return n_id;
    }

    public void setN_id(Integer n_id) {
        this.n_id = n_id;
    }

    public String getN_type() {
        return n_type;
    }

    public void setN_type(String n_type) {
        this.n_type = n_type;
    }

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }

    public String getN_picture() {
        return n_picture;
    }

    public void setN_picture(String n_picture) {
        this.n_picture = n_picture;
    }

    public String getN_date() {
        return n_date;
    }

    public void setN_date(String n_date) {
        this.n_date = n_date;
    }

    public String getN_author() {
        return n_author;
    }

    public void setN_author(String n_author) {
        this.n_author = n_author;
    }
}
