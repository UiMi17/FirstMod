package com.uimi.firstmod.item;

import com.uimi.firstmod.FirstMod;
import com.uimi.firstmod.item.custom.MatthewStone;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> AMATTHYST = ITEMS.register("amatthyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.FIRSTMOD_GROUP)));
    public static final RegistryObject<Item> MATTHEW_STONE = ITEMS.register("matthew_stone",
            () -> new MatthewStone(new Item.Properties().group(ModItemGroup.FIRSTMOD_GROUP).maxDamage(12)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
