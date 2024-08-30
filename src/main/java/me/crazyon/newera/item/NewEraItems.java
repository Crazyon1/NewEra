package me.crazyon.newera.item;

import me.crazyon.newera.NewEra;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class NewEraItems {
    public static final Item TARDIS_ITEM = register(new Item(new Item.Settings()),"coral");
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            new Identifier(NewEra.MOD_ID, "items")
    );
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(NewEraItems::TARDIS_ITEMSTACK)
            .displayName(Text.literal("New Era"))
            .entries((displayContext, entries) -> entries.add(TARDIS_ITEM))
            .build();

    public static Item register(Item item, String id) {
        Identifier itemID = new Identifier(NewEra.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }
    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, NewEraItems.CUSTOM_ITEM_GROUP_KEY, NewEraItems.CUSTOM_ITEM_GROUP);
    }

    public static ItemStack TARDIS_ITEMSTACK() {
        return new ItemStack(TARDIS_ITEM);
    }
}
