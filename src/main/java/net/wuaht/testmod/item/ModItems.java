package net.wuaht.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wuaht.testmod.TestMod;
import net.wuaht.testmod.block.ModBlocks;
import net.wuaht.testmod.item.custom.EightBallItem;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new Item.Settings()),
            ModItemGroup.WUAHT);

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new Item.Settings()),
            ModItemGroup.WUAHT);

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new Item.Settings().maxCount(1)),
            ModItemGroup.WUAHT);

    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP,
                    new Item.Settings()),
                    ModItemGroup.WUAHT);

    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4).build())),
            ModItemGroup.WUAHT);


    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

            TestMod.LOGGER.debug("Registering Mod Items for " + TestMod.MOD_ID);

    }

}
