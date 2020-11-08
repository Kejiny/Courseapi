package com.kejiny.demo.model;

public class Topic {
private String id;
private String name;
private String description;

public Topic(String id, String name, String description) {
	this.id=id;
	this.name=name;
	this.description=description;
}

public String getId() {
	return id;
}

public String getName() {
	return name;
}

public String getDescription() {
	return description;
	}

public void setId(Object topicid) {
	this.id=topicid;
}

public void setName(String newName) {
	this.id=newName;
}

public void setDescription(String newDescription) {
	this.id=newDescription;
}

}

