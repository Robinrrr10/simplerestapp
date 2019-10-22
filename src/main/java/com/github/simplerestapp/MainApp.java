package com.github.simplerestapp;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.github.simplerestapp.domain.Basic;

@ApplicationPath("v1")
public class MainApp extends Application
{
   
	private Set<Class<?>> allApps = new HashSet<>();
	
	public MainApp() {
		System.out.println("Starting apps");
		allApps.add(Basic.class);
		System.out.println("Added all class in app");
	}
	
	@Override
	public Set<Class<?>> getClasses(){
		return allApps;
	}
}
