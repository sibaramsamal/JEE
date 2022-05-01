package com.taghandler;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport{
	private int num1,num2;
	public void setNum1(String num1) {
		this.num1 = Integer.parseInt(num1);
	}
	public void setNum2(String num2) {
		this.num2 = Integer.parseInt(num2);
	}
	@Override
	public int doStartTag() throws JspException {
		int result = num1 + num2;
		JspWriter out = pageContext.getOut();
		try {
			out.print("Sum result is:"+result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Tag.EVAL_BODY_INCLUDE;
	}
}