package net.ruddy.ruddysmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.ruddy.ruddysmod.block.ModBlocks;
import net.ruddy.ruddysmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;


public class ModRecipeProvider extends FabricRecipeProvider {

    private static List<ItemConvertible> ENDIUM_SMELTABLES = List.of(ModBlocks.ENDIUM_ORE, ModItems.RAW_ENDIUM);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        offerSmelting(recipeExporter,ENDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENDIUM_SHARD,1f,200,"endium");
        offerBlasting(recipeExporter,ENDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENDIUM_SHARD,1f,100,"endium");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDIUM, RecipeCategory.DECORATIONS, ModBlocks.ENDIUM_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ENDIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_ENDIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDIUM, 1)
                .pattern("SSS")
                .pattern("S D")
                .pattern("DDD")
                .input('S', ModItems.ENDIUM_SHARD)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(ModItems.ENDIUM_SHARD), conditionsFromItem(ModItems.ENDIUM_SHARD))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter, new Identifier(getRecipeName(ModItems.ENDIUM)));





    }
}
