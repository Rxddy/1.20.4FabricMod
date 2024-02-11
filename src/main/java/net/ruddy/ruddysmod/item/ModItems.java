package net.ruddy.ruddysmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.ruddy.ruddysmod.RuddysMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDIUM = registerItem("endium",new Item(new FabricItemSettings()));
    public static final Item RAW_ENDIUM = registerItem("raw_endium", new Item(new FabricItemSettings()));

    public static final Item ENDIUM_SHARD = registerItem("endium_shard", new Item(new FabricItemSettings()));

    public static final Item ENDIUM_PICKAXE = registerItem("endium_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDIUM, 1, 1f, new FabricItemSettings()));
    public static final Item ENDIUM_AXE = registerItem("endium_axe",
            new AxeItem(ModToolMaterial.ENDIUM, 1, 1f, new FabricItemSettings()));
    public static final Item ENDIUM_SHOVEL = registerItem("endium_shovel",
            new ShovelItem(ModToolMaterial.ENDIUM, 1, 1f, new FabricItemSettings()));
    public static final Item ENDIUM_HOE = registerItem("endium_hoe",
            new HoeItem(ModToolMaterial.ENDIUM, 1, 1f, new FabricItemSettings()));
    public static final Item ENDIUM_SWORD = registerItem("endium_sword",
            new SwordItem(ModToolMaterial.ENDIUM, 1, 1f, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDIUM);
        entries.add(RAW_ENDIUM);
        entries.add(ENDIUM_SHARD);


    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RuddysMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RuddysMod.LOGGER.info("Registering Mod Items for "+RuddysMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

