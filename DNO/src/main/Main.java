package main;

import java.util.ArrayList;
import java.util.Collection;

import drugMain.MainDrug;
import utils.plugin.Plugin;

public class Main {
	
	static Collection<Plugin> plugins = new ArrayList<Plugin>();
	
	public static void main(String[] args) {
		initPlugins();
		for (Plugin plugin : plugins) {
			plugin.go();
		}
	}

	private static void initPlugins() {
		plugins.add(new MainDrug());
	}
	
	
}
