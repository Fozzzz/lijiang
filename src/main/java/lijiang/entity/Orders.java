package lijiang.entity;

/**
 * Created by Administrator on 2016/11/7.
 */
public class Orders {
    private Integer o_id;
    private Integer o_number;//票数
    private String o_tel;
    private String o_name;
    private String o_idcard;
    private boolean o_state=false;

    public Orders(Integer o_id, Integer o_number, String o_tel, String o_name, String o_idcard, boolean o_state) {
        this.o_id = o_id;
        this.o_number = o_number;
        this.o_tel = o_tel;
        this.o_name = o_name;
        this.o_idcard = o_idcard;
        this.o_state = o_state;
    }

    public Orders() {
    }

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public Integer getO_number() {
        return o_number;
    }

    public void setO_number(Integer o_number) {
        this.o_number = o_number;
    }

    public String getO_tel() {
        return o_tel;
    }

    public void setO_tel(String o_tel) {
        this.o_tel = o_tel;
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public String getO_idcard() {
        return o_idcard;
    }

    public void setO_idcard(String o_idcard) {
        this.o_idcard = o_idcard;
    }

    public boolean getO_state() {
        return o_state;
    }

    public void setO_state(boolean o_state) {
        this.o_state = o_state;
    }
}
