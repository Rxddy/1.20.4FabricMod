package net.ruddy.ruddysmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.ruddy.ruddysmod.block.ModBlocks;
import net.ruddy.ruddysmod.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider{
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.ENDIUM_BLOCK);
        addDrop(ModBlocks.RAW_ENDIUM_BLOCK);
        addDrop(ModBlocks.ENDIUM_ORE, oreDrops(ModBlocks.ENDIUM_ORE, ModItems.RAW_ENDIUM));

    }
}
