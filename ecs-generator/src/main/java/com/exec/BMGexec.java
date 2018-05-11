package com.exec;

import com.model.GenertorModel;
import com.util.Genertor;

/**
 * 逆向生成的入口
 * 
 * @author chenghui
 *
 */
public class BMGexec {
	public static void main(String[] args) {
		Genertor genertor = new Genertor();
		GenertorModel model=new GenertorModel();
		model.setTarget("");
		genertor.configuration(model);
	}
}
