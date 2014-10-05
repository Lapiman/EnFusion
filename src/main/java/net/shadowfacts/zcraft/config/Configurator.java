package net.shadowfacts.zcraft.config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class Configurator {
	
	// The all-mighty config
	private static Configuration config;
	
	private static int nextId = 1232;
	
	
	// Config properties
	// Block IDs
	public static int greenZinchoriumGemOreBlockId;
	public static int greenZinchoriumLightIdleBlockId;
	public static int greenZinchoriumLightActiveBlockId;
	public static int oreCopperBlockId;
	
	// Item IDs
	public static int greenZinchoriumGemItemId;
	public static int lightBulbItemId;
	public static int ingotCopperItemId;
	public static int zinchoriumSwordItemId;
	public static int zinchoriumPickaxeItemId;
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		System.out.println("Loading configuration file");
		
		
		config = new Configuration(event.getSuggestedConfigurationFile());
		
		
		
		// Load properties
		// Block IDs
		greenZinchoriumGemOreBlockId = config.getBlock("GreenZinchoriumGemOre", getNextId()).getInt();
		greenZinchoriumLightActiveBlockId = config.getBlock("GreenZinchoriumLightActive",  getNextId()).getInt();
		greenZinchoriumLightIdleBlockId = config.getBlock("GreenZinchoriumLightIdle",  getNextId()).getInt();
		oreCopperBlockId = config.getBlock("OreCopper", getNextId()).getInt();
		
		
		// Item IDs
		greenZinchoriumGemItemId = config.getItem("GreenZinchoriumGem",  getNextId()).getInt();
		lightBulbItemId = config.getItem("LightBulb",  getNextId()).getInt();
		ingotCopperItemId = config.getItem("IngotCopper", getNextId()).getInt();
		zinchoriumSwordItemId = config.getItem("ZinchoriumGemSword", getNextId()).getInt();
		zinchoriumPickaxeItemId = config.getItem("ZinchoriumGemPickaxe", getNextId()).getInt();
		
		
		// Save config
		config.save();
	}
	
	
	private static int getNextId() {
		int id = nextId;
		nextId = nextId + 1;
		
		return id;
	}
	
	
}
