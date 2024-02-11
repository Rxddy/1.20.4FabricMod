package net.ruddy.ruddysmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ruddy.ruddysmod.RuddysMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ruddy.ruddysmod.block.ModBlocks;

public class ModItemGroups {

        public static final ItemGroup ENDIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(RuddysMod.MOD_ID, "endium"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endium"))
                        .icon(() -> new ItemStack(ModItems.ENDIUM)).entries((displayContext, entries) -> {
                            entries.add(ModItems.ENDIUM);
                            entries.add(ModItems.RAW_ENDIUM);
                            entries.add(ModItems.ENDIUM_SHARD);

                            entries.add(ModBlocks.ENDIUM_BLOCK);
                            entries.add(ModBlocks.RAW_ENDIUM_BLOCK);
                            entries.add(ModBlocks.ENDIUM_ORE);

                            entries.add(ModItems.ENDIUM_PICKAXE);
                            entries.add(ModItems.ENDIUM_SWORD);
                            entries.add(ModItems.ENDIUM_HOE);
                            entries.add(ModItems.ENDIUM_SHOVEL);
                            entries.add(ModItems.ENDIUM_AXE);



                        }).build());


        public static void registerItemGroups() {
            RuddysMod.LOGGER.info("Registering Item Groups for " + RuddysMod.MOD_ID);
        }


}
