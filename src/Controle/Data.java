/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Data {	
	public Date formata(String data)throws Exception{
		String dataString = data;
		DateFormat df =  new SimpleDateFormat("dd/MM/yyyy");
		java.sql.Date dataFormatada = new java.sql.Date(df.parse(dataString).getTime());
		return dataFormatada;
		}
}
