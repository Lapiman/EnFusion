package net.shadowfacts.zcraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.shadowfacts.zcraft.ZCraft;
import net.shadowfacts.zcraft.config.Configurator;
import net.shadowfacts.zcraft.gui.ZCreativeTabs;

public class ZItems {
	// Items
	public static Item greenZinchoriumGem;
	public static Item lightBulb;
	public static Item ingotCopper;
	public static Item zinchoriumPickaxe;
	
	
	// Methods
	public static void preInit() {
		// Create the items
		greenZinchoriumGem = new Item(Configurator.greenZinchoriumGemItemId);
		greenZinchoriumGem.setUnlocalizedName("greenZinchoriumGem").setTextureName(ZCraft.modId + ":zinchoriumGem/green")
						.setCreativeTab(ZCreativeTabs.tabZCore);
		
		lightBulb = new Item(Configurator.lightBulbItemId);
		lightBulb.setUnlocalizedName("lightBulb").setTextureName(ZCraft.modId + ":lightBulb")
				.setCreativeTab(ZCreativeTabs.tabZCore);
		
		ingotCopper = new Item(Configurator.ingotCopperItemId);
		ingotCopper.setUnlocalizedName("ingotCopper").setTextureName(ZCraft.modId + ":ingotCopper")
					.setCreativeTab(ZCreativeTabs.tabZCore);
		
		zinchoriumPickaxe = new ItemPickaxe(Configurator.zinchoriumPickaxeItemId, EnumToolMaterial.IRON);
		zinchoriumPickaxe.setUnlocalizedName("zinchoriumPickaxe").setCreativeTab(ZCreativeTabs.tabZTools)
							.setTextureName(ZCraft.modId + ":zinchoriumGemPickaxe");
		
		// Register them
		GameRegistry.registerItem(greenZinchoriumGem, "greenZinchoriumGem");
		GameRegistry.registerItem(lightBulb, "lightBulb");
		GameRegistry.registerItem(ingotCopper, "ingotCopper");
		GameRegistry.registerItem(zinchoriumPickaxe, "zinchoriumPickaxe");
	}
	
	public static void load() {
		
	}
	
	public static void postInit() {
		
	}
	
}
