/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.business;

import com.codideep.app.datatransfer.DtoActivity;
import com.codideep.app.datatransfer.DtoMessageObject;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author KAAF0
 */
public class BusinessActivity extends BusinessGeneric {

    public DtoMessageObject insert(DtoActivity dtoActivity) {
        dtoActivity.setIdActivity(UUID.randomUUID().toString());
        dtoActivity.setStatus(true);
        dtoActivity.setCreatedAt(new Date());
        dtoActivity.setUpdatedAt(dtoActivity.getCreatedAt());

        dtoMessageObject.addMessage("Operación realizada correctamente.");
        dtoMessageObject.setSuccess();

        return dtoMessageObject;
    }
}
