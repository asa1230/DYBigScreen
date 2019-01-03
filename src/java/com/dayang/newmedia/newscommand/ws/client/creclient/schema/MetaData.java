package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

import java.util.ArrayList;
import java.util.List;


public class MetaData {
	private int MetaDataCount;
	private List<SAttribute> sAttributes = new ArrayList<SAttribute>();
	private List<SAttributeGroups> sAttributeGroups = new ArrayList<SAttributeGroups>();
	public List<SAttributeGroups> getsAttributeGroups() {
		return sAttributeGroups;
	}

	public void setsAttributeGroups(List<SAttributeGroups> sAttributeGroups) {
		this.sAttributeGroups = sAttributeGroups;
	}

	public List<SAttribute> getsAttributes() {
		return sAttributes;
	}

	public void setsAttributes(List<SAttribute> sAttributes) {
		this.sAttributes = sAttributes;
	}

	public int getMetaDataCount() {
		return MetaDataCount;
	}

	public void setMetaDataCount(int metaDataCount) {
		MetaDataCount = metaDataCount;
	}
	private String SAttributeGroupsToString() {
		if(null != getsAttributeGroups() && getsAttributeGroups().size() > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append("<sAttributeGroups>");
			for(SAttributeGroups attrG : getsAttributeGroups()) {
				sb.append(attrG.toString());
			}
			sb.append("</sAttributeGroups>");
			return sb.toString();
		}
		return "";
	}
	private String SAttributesToString() {
		if(null != getsAttributes() && getsAttributes().size() > 0) {
			StringBuilder sb = new StringBuilder();
			for(SAttribute attr : getsAttributes()) {
				sb.append("<sAttribute strName=\"" + attr.getStrName() + "\" enumType=\"" + attr.getEnumType() + "\"><![CDATA[" + attr.getValue() + "]]></sAttribute>");
			}
			return sb.toString();
		}
		return "";
	}
	public String toString() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+(MetaDataCount > 0 ? "<MetaData MetaDataCount=\"" + MetaDataCount + "\">" :  "<MetaData>") +
			SAttributesToString() +
			SAttributeGroupsToString() +
		"</MetaData>" ;
	}
	
	public static void main(String[] args) {
		MetaData metaData = new MetaData();
		metaData.setMetaDataCount(2);
		SAttribute sAttribute = new SAttribute();
		sAttribute.setEnumType("0");
		sAttribute.setStrName("栏目名称");
		sAttribute.setValue("萝卜大哥哥");
		List<SAttribute> sas = new ArrayList<SAttribute>();
		sas.add(sAttribute);
		metaData.setsAttributes(sas);
		System.out.println(metaData);
	}
}
