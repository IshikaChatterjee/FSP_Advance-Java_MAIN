package com.adap;
import com.pen.PilotPen;

public class School {

	public static void main(String[] args) {
		
		PilotPen pp = new PilotPen();
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("Complete your assignment");

	}

}
