package net.ruddy.ruddysmod;

import net.fabricmc.api.ModInitializer;

import net.ruddy.ruddysmod.block.ModBlocks;
import net.ruddy.ruddysmod.item.ModItems;
import net.ruddy.ruddysmod.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuddysMod implements ModInitializer {
	public static final String MOD_ID = "ruddys-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}