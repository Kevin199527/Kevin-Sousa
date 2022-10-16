package nosi.webapps.igrp.pages.home;

import nosi.core.gui.components.IGRPHome;
import nosi.core.webapp.View;

public class HomeView extends View{
	public String title;
	private IGRPHome home;
	public HomeView(){
		this.home = new IGRPHome("home");
	}
	@Override
	public void render() {
		this.addToPage(home);
	}

}
