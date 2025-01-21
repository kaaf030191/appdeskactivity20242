/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KAAF0
 * @param <Dto>
 */
public abstract class QGeneric<Dto> {

    protected PreparedStatement prepareStatement = null;
    protected ResultSet resultSet = null;
    
    protected Dto dto = null;
    protected List<Dto> listDto = new ArrayList<>();
    protected String script = null;
    protected int rowsQuantity = 0;
}
