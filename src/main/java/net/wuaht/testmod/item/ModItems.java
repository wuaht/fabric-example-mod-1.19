package net.wuaht.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wuaht.testmod.TestMod;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new Item.Settings()),
            ModItemGroup.TANZANITE);

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new Item.Settings()),
            ModItemGroup.TANZANITE);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

            TestMod.LOGGER.debug("Registering Mod Items for " + TestMod.MOD_ID);

    }

}
