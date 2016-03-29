package controldecomandos;

import org.bukkit.plugin.java.JavaPlugin;

public final class Control extends JavaPlugin {
    
	public void onEnable(){
		getLogger().info("onEnable se ejecuto correctamente!");
	}

	public void onDisable(){
		getLogger().info("onDisable se ejecuto correctamente!");
	}
}