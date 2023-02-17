package net.wuaht.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wuaht.testmod.TestMod;

public class ModItemGroup {

    public static final ItemGroup WUAHT = FabricItemGroup.builder(new Identifier(TestMod.MOD_ID))
            .displayName(Text.literal("wuaht"))
            .icon(() -> new ItemStack(ModItems.EIGHT_BALL))
            .build();

}
