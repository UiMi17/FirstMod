package com.uimi.firstmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class MatthewKillerSword extends SwordItem {
    public MatthewKillerSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setFire(7);

        healAttackerOnEntityDeath(target, attacker, 1.5f);

        return super.hitEntity(stack, target, attacker);
    }

    public void healAttackerOnEntityDeath(LivingEntity target, LivingEntity attacker, float healAmount ) {
        if (target.getHealth() <= 0) {
            attacker.heal(healAmount);
        }
    }
}
