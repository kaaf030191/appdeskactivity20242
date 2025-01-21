/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.dataaccess;

import com.codideep.app.datatransfer.DtoActivity;
import com.codideep.app.repository.RepoActivity;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author KAAF0
 */
public class QActivity extends QGeneric<DtoActivity> implements RepoActivity {

    @Override
    public int insert(DtoActivity dto) throws SQLException {
        DataBaseContext.generateConnection();

        script = "insert into tactivity(idActivity, name, beginDate, endDate, status, createdAt, updatedAt) values(?, ?, ?, ?, ?, ?, ?)";

        prepareStatement = DataBaseContext.getConnection().prepareStatement(script);

        prepareStatement.setString(1, dto.getIdActivity());
        prepareStatement.setString(2, dto.getName());
        prepareStatement.setTimestamp(3, new java.sql.Timestamp(dto.getBeginDate().getTime()));
        prepareStatement.setTimestamp(4, new java.sql.Timestamp(dto.getEndDate().getTime()));
        prepareStatement.setBoolean(5, dto.isStatus());
        prepareStatement.setTimestamp(6, new java.sql.Timestamp(dto.getCreatedAt().getTime()));
        prepareStatement.setTimestamp(7, new java.sql.Timestamp(dto.getUpdatedAt().getTime()));

        rowsQuantity = prepareStatement.executeUpdate();

        DataBaseContext.closeConnection();

        return rowsQuantity;
    }

    @Override
    public int update(DtoActivity dto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DtoActivity getById(String id) throws SQLException {
        DataBaseContext.generateConnection();

        script = "select * from tactivity where id = ?";

        prepareStatement = DataBaseContext.getConnection().prepareStatement(script);

        prepareStatement.setString(1, id);

        resultSet = prepareStatement.executeQuery();

        if (resultSet.next()) {
            dto = new DtoActivity();

            dto.setIdActivity(resultSet.getString("idActivity"));
            dto.setName(resultSet.getString("name"));
            dto.setBeginDate(resultSet.getTimestamp("beginDate"));
            dto.setEndDate(resultSet.getTimestamp("endDate"));
            dto.setStatus(resultSet.getBoolean("status"));
            dto.setCreatedAt(resultSet.getTimestamp("createdAt"));
            dto.setUpdatedAt(resultSet.getTimestamp("updatedAt"));
        }

        DataBaseContext.closeConnection();

        return dto;
    }

    @Override
    public List<DtoActivity> getDataPage(String searchData, int skip, int take) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getDataPageQuantity(String searchData) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
