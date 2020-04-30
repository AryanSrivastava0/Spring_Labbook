package com.org.labsecond;

import org.springframework.stereotype.Component;

@Component
public class SBU {
 private int sbuID;
 private String sbName;
 private String sbHead;
public int getSbuID() {
	return sbuID;
}
public void setSbuID(int sbuID) {
	this.sbuID = sbuID;
}
public String getSbName() {
	return sbName;
}
public void setSbName(String sbName) {
	this.sbName = sbName;
}
public String getSbHead() {
	return sbHead;
}
public void setSbHead(String sbHead) {
	this.sbHead = sbHead;
}
 public SBU(int sbuID, String sbName, String sbHead)
 {
	super();
	this.sbuID=sbuID;
	this.sbName=sbName;
	this.sbHead=sbHead;
 }
 public SBU()
 {
	 
 }
}
