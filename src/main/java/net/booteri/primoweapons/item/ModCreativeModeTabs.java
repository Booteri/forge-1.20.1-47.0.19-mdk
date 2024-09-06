package net.booteri.primoweapons.item;

import net.booteri.primoweapons.PrimoWeapons;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrimoWeapons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRIMOWWEAPONS = CREATIVE_MODE_TABS.register("primoweapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLOOD_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.primoweapons_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLOOD_CRYSTAL.get());
                        output.accept(ModItems.BLOODSHARD.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
      CREATIVE_MODE_TABS.register(eventBus);

    }
}
