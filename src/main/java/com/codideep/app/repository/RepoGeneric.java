/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codideep.app.repository;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author KAAF0
 * @param <Dto>
 */
public interface RepoGeneric<Dto> {
    int insert(Dto dto) throws SQLException;
    int update(Dto dto) throws SQLException;
    
    Dto getById(String id) throws SQLException;
    
    List<Dto> getDataPage(String searchData, int skip, int take) throws SQLException;
    int getDataPageQuantity(String searchData) throws SQLException;
}
