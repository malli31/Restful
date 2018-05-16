package com.local.interview;

import java.util.ArrayList;
import java.util.List;
//import com.fasterxml.jackson.annotation.JsonProperty;

public class PathModel {
String fileType;
String name;
List<PathModel> children = new ArrayList<PathModel>();
public String getFileType() {
	return fileType;
}
public void setFileType(String fileType) {
	this.fileType = fileType;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<PathModel> getChildren() {
	return children;
}
public void setChildren(List<PathModel> children) {
	this.children = children;
}
}
