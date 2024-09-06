package net.booteri.primoweapons.item;

import net.booteri.primoweapons.PrimoWeapons;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrimoWeapons.MOD_ID);

    public static final RegistryObject<Item> BLOODSHARD = ITEMS.register("bloodshard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_CRYSTAL = ITEMS.register("blood_crystal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
