package com.uimi.firstmod.item;

import com.uimi.firstmod.FirstMod;
import com.uimi.firstmod.item.custom.MatthewKillerSword;
import com.uimi.firstmod.item.custom.MatthewStone;
import net.minecraft.item.*;
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
            () -> new MatthewStone(new Item.Properties().group(ModItemGroup.FIRSTMOD_GROUP)));

    public static final RegistryObject<Item> MATTHEW_KILLER_SWORD = ITEMS.register("matthew_killer_sword",
            () -> new MatthewKillerSword(ModItemTiar.AMATTHYST,6,-2f,
                    new Item.Properties().group(ModItemGroup.FIRSTMOD_GROUP)));

    public static final RegistryObject<Item> MATTHEW_PICKAXE = ITEMS.register("matthew_pickaxe",
            () -> new PickaxeItem(ModItemTiar.AMATTHYST,2,-1.4f,
                    new Item.Properties().group(ModItemGroup.FIRSTMOD_GROUP)));

    public static final RegistryObject<Item> MATTHEW_AXE = ITEMS.register("matthew_axe",
            () -> new AxeItem(ModItemTiar.AMATTHYST,4,-3f,
                    new Item.Properties().group(ModItemGroup.FIRSTMOD_GROUP)));

    public static final RegistryObject<Item> MATTHEW_SHOVEL = ITEMS.register("matthew_shovel",
            () -> new ShovelItem(ModItemTiar.AMATTHYST,1,-1f,
                    new Item.Properties().group(ModItemGroup.FIRSTMOD_GROUP)));

    public static final RegistryObject<Item> MATTHEW_HOE = ITEMS.register("matthew_hoe",
            () -> new HoeItem(ModItemTiar.AMATTHYST,1,-1f,
                    new Item.Properties().group(ModItemGroup.FIRSTMOD_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
