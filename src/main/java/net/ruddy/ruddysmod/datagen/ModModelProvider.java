package net.ruddy.ruddysmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.ruddy.ruddysmod.block.ModBlocks;
import net.ruddy.ruddysmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ENDIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ENDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDIUM_SWORD, Models.GENERATED);
    }
}
