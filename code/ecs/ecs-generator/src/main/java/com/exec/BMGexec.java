package com.exec;

import com.context.Genertor;
import com.model.TableModel;


/**
 * 逆向生成的入口
 * 
 * @author chenghui
 *
 */
public class BMGexec {
	public static void main(String[] args) {
		Genertor  genertor=new Genertor();
		TableModel tbles=new TableModel();
		tbles.addTable("tbl_demo_info", "Demo");
		genertor.configurationTblesList(tbles);
	}
	
}
