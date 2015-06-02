package main;

import java.util.Collection;
import utils.plugin.Plugin;

public class Main {
	
	static Collection<Plugin> plugins;
	
	public static void main(String[] args) {
		initPlugins();
		for (Plugin plugin : plugins) {
			plugin.go();
		}
	}

	private static void initPlugins() {
		//plugins.add(arg0);
	}
	
	
}
