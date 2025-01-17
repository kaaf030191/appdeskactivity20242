/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codideep.app.repository;

import java.util.List;

/**
 *
 * @author KAAF0
 * @param <Dto>
 */
public interface RepoGeneric<Dto> {
    int insert(Dto dto);
    int update(Dto dto);
    
    Dto getById(String id);
    
    List<Dto> getDataPage(String searchData, int skip, int take);
}
