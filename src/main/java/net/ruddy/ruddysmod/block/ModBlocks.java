package net.ruddy.ruddysmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.ruddy.ruddysmod.RuddysMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

        public static final Block ENDIUM_BLOCK = registerBlock("endium_block",
                new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));
        public static final Block RAW_ENDIUM_BLOCK = registerBlock("raw_endium_block",
                new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));
        public static final Block ENDIUM_ORE = registerBlock("endium_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.STONE).strength(30f, 1200f).sounds(BlockSoundGroup.NETHERITE).burnable()));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RuddysMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RuddysMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {

        RuddysMod.LOGGER.info("Registering ModBlocks for "+RuddysMod.MOD_ID);
    }
}
