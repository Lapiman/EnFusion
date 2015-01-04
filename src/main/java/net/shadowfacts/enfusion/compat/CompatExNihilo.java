package net.shadowfacts.enfusion.compat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.shadowfacts.enfusion.EnFusion;
import net.shadowfacts.enfusion.item.EFItems;

/**
 * ExNihilo Compatibility
 * @author shadowfacts
 */
public class CompatExNihilo {
	public static void preInit() {

	}

	public static void init() {
		// Add Zinchorium Dust to ExNihilo Sieve Registry for Dust
		try {
			Class sieveRegistry = Class.forName("exnihilo.registries.SieveRegistry");

			// void register(Block source, Item output, int outputMeta, int rarity)
			Method register = sieveRegistry.getMethod("register", Block.class, Item.class, int.class, int.class);

			Block blockDust = GameRegistry.findBlock("exnihilo", "dust");

			if (blockDust != null) {

				register.invoke(null, blockDust, EFItems.zinchoriumDust, 0, 10);

			} else {
				EnFusion.log.error("Umm, dust should be a block, right?");
				return;
			}

		} catch (ClassNotFoundException e) {
			EnFusion.log.error("There was a problem loading the ExNihilo classes, uh oh.");
			EnFusion.log.error("Report this immediately at: http://github.com/shadowfacts/EnFusion/issues");
			EnFusion.log.error(e.getMessage());
		} catch (NoSuchMethodException e) {
			EnFusion.log.error("There was a problem loading a method from one of the ExNihilo classes, uh oh.");
			EnFusion.log.error("Report this immediately at: http://github.com/shadowfacts/EnFusion/issues");
			EnFusion.log.error(e.getMessage());
		} catch (IllegalAccessException e) {
			EnFusion.log.error("There was a problem accessing a method from one of the ExNihilo classes (IllegalAccessException), uh oh.");
			EnFusion.log.error("Report this immediately at: http://github.com/shadowfacts/EnFusion/issues");
			EnFusion.log.error(e.getMessage());
		} catch (InvocationTargetException e) {
			EnFusion.log.error("There was a problem accessing a method from one of the ExNihilo classes (InvocationTargetException), uh oh.");
			EnFusion.log.error("Report this immediately at: http://github.com/shadowfacts/EnFusion/issues");
			EnFusion.log.error(e.getMessage());
		}
	}

	public static void postInit() {

	}
}
