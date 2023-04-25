package com.learn.chapter12.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("role_12")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Role {

    @Value("9999")
    private Long id;
    @Value("test_roleName_99999")
    private String roleName;
    @Value("test_note_99999")
    private String note;

    public Role() {
    }

    public Role(String roleName, String note) {
        this.roleName = roleName;
        this.note = note;
    }

    public Role(Long id, String roleName, String note) {
        this.id = id;
        this.roleName = roleName;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
