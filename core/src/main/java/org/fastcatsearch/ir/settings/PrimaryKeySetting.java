package org.fastcatsearch.ir.settings;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;


public class PrimaryKeySetting {
	
	private String id;
	private List<RefSetting> fieldList;

	public PrimaryKeySetting() {}
	
	public PrimaryKeySetting(String id) {
		this.id = id.toUpperCase();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id.toUpperCase();
	}
	
	@XmlElement(name="field")
	public List<RefSetting> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<RefSetting> fieldList) {
		this.fieldList = fieldList;
	}
	
}
