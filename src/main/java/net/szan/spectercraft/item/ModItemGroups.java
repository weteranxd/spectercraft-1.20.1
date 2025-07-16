package net.szan.spectercraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.szan.spectercraft.SpecterCraft;
import net.szan.spectercraft.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SPECTER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SpecterCraft.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.specter"))
                    .icon(() -> new ItemStack(ModItems.ENERGY_ORB)).entries((displayContext, entries) -> {
                        //tutaj dawaj entries z ModItems żeby itemy były w grupie SpecterCraft Group!!!
                        entries.add(ModItems.SOUL);
                        entries.add(ModItems.SPECTER_INGOT);
                        entries.add(ModItems.ENERGY_ORB);

                        entries.add(ModBlocks.ACID);
                        entries.add(ModBlocks.ERROR_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        SpecterCraft.LOGGER.info("Registering Item Groups " + SpecterCraft.MOD_ID);
    }
}
