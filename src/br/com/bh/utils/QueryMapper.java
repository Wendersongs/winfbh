/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bh.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface QueryMapper<T> {

	List<T> mapping(ResultSet rset) throws SQLException;
	
}