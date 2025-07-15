package net.szan.spectercraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.szan.spectercraft.SpecterCraft;
import net.minecraft.util.Identifier;

public class ModItems {
    // jak chcesz dodać kolejny item skopiuj tą klase pod tą wiadomością
    public static final Item SOUL = registerItem("soul", new Item(new FabricItemSettings()));
    public static final Item SPECTER_INGOT = registerItem("specter_ingot", new Item(new FabricItemSettings()));
    public static final Item ENERGY_ORB = registerItem("energy_orb", new Item(new FabricItemSettings()));

    // ===================================================================================
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
//        entries.add(SOUL);
//        entries.add(SPECTER_INGOT);
//        entries.add(ENERGY_ORB);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SpecterCraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SpecterCraft.LOGGER.info("Registering Mod Items" + SpecterCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}