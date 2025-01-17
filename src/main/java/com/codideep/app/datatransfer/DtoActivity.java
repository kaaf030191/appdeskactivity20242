/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.datatransfer;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author KAAF0
 */
@Getter
@Setter
public class DtoActivity extends DtoGeneric {

    private String idActivity;
    private String name;
    private Date beginDate;
    private Date endDate;
}
