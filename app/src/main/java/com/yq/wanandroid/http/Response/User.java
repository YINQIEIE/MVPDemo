package com.yq.wanandroid.http.Response;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private static final long serialVersionUID = 6147091727415151258L;

    private String email;
    private String icon;
    private int id;
    private String password;
    private int type;
    private String username;
    private List<?> collectIds;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<?> getCollectIds() {
        return collectIds;
    }

    public void setCollectIds(List<?> collectIds) {
        this.collectIds = collectIds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("email='").append(email).append('\'');
        sb.append(", icon='").append(icon).append('\'');
        sb.append(", id=").append(id);
        sb.append(", password='").append(password).append('\'');
        sb.append(", type=").append(type);
        sb.append(", username='").append(username).append('\'');
        sb.append(", collectIds=").append(collectIds);
        sb.append('}');
        return sb.toString();
    }
}
