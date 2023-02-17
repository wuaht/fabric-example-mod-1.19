package net.wuaht.testmod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class EightBallItem extends Item {

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            // outputs a number
            outputRandomNumber(user);
            // add a cooldown
            user.getItemCooldownManager().set(this, 20);
        }

        return super.use(world, user, hand);
    }

    public EightBallItem(Settings settings) {
        super(settings);
    }

    private int randomNumber() {
        return Random.createLocal().nextInt(10);
    }

    private void outputRandomNumber(PlayerEntity player) {
        player.sendMessage(Text.literal("Your number is " + randomNumber()));
    }
}
