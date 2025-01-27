/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.datatransfer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KAAF0
 */
public class DtoMessageObject {

    private final List<String> listMessage;
    private String type;

    public DtoMessageObject() {
        this.listMessage = new ArrayList<>();
        this.type = "error";
    }

    public boolean existsMessage() {
        return !this.listMessage.isEmpty();
    }

    public void addMessage(String message) {
        this.listMessage.add(message);
    }

    public void setSuccess() {
        this.type = "success";
    }

    public void setWarning() {
        this.type = "warning";
    }

    public void setError() {
        this.type = "error";
    }

    public void setException() {
        this.type = "error";
    }

    public String getType() {
        return this.type;
    }

    public List<String> getListMessage() {
        return this.listMessage;
    }
}
