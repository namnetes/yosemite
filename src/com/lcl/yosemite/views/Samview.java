package com.lcl.yosemite.views;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class Samview extends ViewPart {

	// Get the logger
	private static final Logger thelogger = LogManager.getLogger(Samview.class);

	public Samview() {
		thelogger.log(Level.INFO, "Samview");
	}

	@Override
	public void createPartControl(Composite parent) {
		thelogger.log(Level.INFO, "createParControl");

	}

	@Override
	public void setFocus() {
		thelogger.log(Level.INFO, "setFocus");

	}

}
