package com.kraaven.modlearning.item;

import com.kraaven.modlearning.ModdingLearning;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GEM = RegisterItem("pink_gem",new Item(new Item.Settings()));
    public static final Item PINK_CRYSTAL = RegisterItem("pink_crystal", new Item(new Item.Settings()));

    public static void RegisterModItems(){
        ModdingLearning.LOGGER.info("Registering Items for: "+ModdingLearning.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
//            entries.add(PINK_GEM);
//        });
    }

//    public static Item RegisterItem(String Name, Item item){
//        return Registry.register(Registries.ITEM, Identifier.of(ModdingLearning.MOD_ID,Name),item);
//
//    }

    public static Item RegisterItem(String Name, Item item){
        var NewItem = Registry.register(Registries.ITEM, Identifier.of(ModdingLearning.MOD_ID,Name),item);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(NewItem);
        });

        return NewItem;
    }
}
