package com.starfarershads.ShadMod.item;

import com.starfarershads.ShadMod.ShadMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ShadMod.MODID);

    public static final DeferredItem<Item> FIH = ITEMS.register("fih", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }


}
