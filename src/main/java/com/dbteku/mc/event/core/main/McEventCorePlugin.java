package com.dbteku.mc.event.core.main;

import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

import com.dbteku.javaevents.EventManager;


public class McEventCorePlugin extends JavaPlugin{

	private static final String MAIN_ERROR = "You cannot run this file its a library!";
	
	@Override
	public void onDisable(){
		getServer().getConsoleSender().sendMessage("McEventCore disabled.");
	}
	
	@Override
	public void onEnable(){
		getServer().getConsoleSender().sendMessage("McEventCore Enabled!");
		// Initialize Event
		getServer().getServicesManager().register(EventManager.class, EventManager.getInstance(), this, ServicePriority.Highest);
	}
	
	public static void main(String[] args) {
		System.out.println(MAIN_ERROR);
	}
	
}
