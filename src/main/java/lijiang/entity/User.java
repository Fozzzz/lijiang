package lijiang.entity;

/**
 * Created by Administrator on 2016/11/7.
 */
public class User {
    private Integer u_id;
    private String u_name;
    private String u_password;
    private Groups groups;

    public User(Integer u_id, String u_name, String u_password, Groups groups) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_password = u_password;
        this.groups = groups;
    }

    public User() {
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }
}
