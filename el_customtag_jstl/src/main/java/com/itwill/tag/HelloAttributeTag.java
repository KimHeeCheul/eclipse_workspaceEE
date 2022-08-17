package com.itwill.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloAttributeTag extends TagSupport {
	private String irum;
	public HelloAttributeTag() {
		System.out.println("1.HelloAttribute 기본생성자");
	}
	public void setIrum(String irum) {
		System.out.println("2.HelloAttribute.setIrum("+irum+")");
		this.irum = irum;
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("3.HelloAtttributeTag.doStartTag()");
		String msg = "";
		if(irum.equals("소향")) {
			msg = "노래가 좋으신 " + irum + "님 안녕하세요.<br>";
		}else if(irum.equals("IU")){
			msg = "IU는" + irum + "?";
		}else {
			msg = irum + "님 안녕하세요.<br>";
		}
		try {
			pageContext.getOut().println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return super.doStartTag(); // 이 안에 이미 내장되어 있으므로 안바꿔도 된다
	}
	@Override
	public int doEndTag() throws JspException {
		
		return super.doEndTag();
	}
	
}
