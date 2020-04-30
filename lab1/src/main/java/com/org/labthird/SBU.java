package com.org.labthird;

public class SBU {
		private int sbuID;
		private String sbuName;
		private String sbuHead;
		
		

		public int getSbuID() {
			return sbuID;
		}

		public void setSbuID(int sbuID) {
			this.sbuID = sbuID;
		}

		public String getSbuName() {
			return sbuName;
		}

		public void setSbuName(String sbuName) {
			this.sbuName = sbuName;
		}

		public String getSbuHead() {
			return sbuHead;
		}

		public void setSbuHead(String sbuHead) {
			this.sbuHead = sbuHead;
		}
        public SBU(int sbuID , String sbuName, String sbuHead)
        {
        	super();
        	this.sbuID=sbuID;
        	this.sbuName=sbuName;
        	this.sbuHead=sbuHead;
        	
        }
}
