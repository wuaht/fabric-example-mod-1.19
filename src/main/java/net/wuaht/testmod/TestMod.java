package net.wuaht.testmod;

import net.fabricmc.api.ModInitializer;
import net.wuaht.testmod.block.ModBlocks;
import net.wuaht.testmod.item.ModItems;
import net.wuaht.testmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// comment2
public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

	}
}
