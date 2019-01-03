package com.dayang.newmedia.newscommand.ws.client.creclient.schema;

public class SAttributeGroups {
	private String name;
	private MetaData meta;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}

	public String toString() {
		return "<sAttributeGroup Name=\"" + name + "\">" + meta.toString() + "</sAttributeGroup>";
	}
}
