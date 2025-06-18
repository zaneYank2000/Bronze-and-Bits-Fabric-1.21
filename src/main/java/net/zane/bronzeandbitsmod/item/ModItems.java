package net.zane.bronzeandbitsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zane.bronzeandbitsmod.BronzeAndBitsMod;

public class ModItems {
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BronzeAndBitsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BronzeAndBitsMod.LOGGER.info("Registering Mood Items for " + BronzeAndBitsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TIN_INGOT);
            entries.add(RAW_TIN);
        });
    }

}