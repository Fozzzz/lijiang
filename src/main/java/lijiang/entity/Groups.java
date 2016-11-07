package lijiang.entity;

/**
 * Created by Administrator on 2016/11/7.
 */
public class Groups {
    private Integer g_id;
    private boolean g_news=false;
    private boolean g_groups=false;
    private boolean g_orders=false;


    public Groups() {
    }

    public boolean getG_orders() {
        return g_orders;
    }

    public void setG_orders(boolean g_orders) {
        this.g_orders = g_orders;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public boolean getG_news() {
        return g_news;
    }

    public void setG_news(boolean g_news) {
        this.g_news = g_news;
    }

    public boolean getG_groups() {
        return g_groups;
    }

    public void setG_groups(boolean g_groups) {
        this.g_groups = g_groups;
    }
}
