package me.crazyon.newera.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CoralItem extends Item {

    public CoralItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        ItemStack stack = context.getPlayer().getStackInHand(Hand.MAIN_HAND);
        if(stack.getItem() != this) return ActionResult.FAIL;
        if(context.getWorld().isClient) return ActionResult.PASS;
        stack.decrement(1);
        System.out.println("Works");


        return ActionResult.success(true);
    }
}
