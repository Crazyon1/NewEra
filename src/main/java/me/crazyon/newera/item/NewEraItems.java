package me.crazyon.newera.item;

import me.crazyon.newera.NewEra;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
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
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(NewEra.MOD_ID, "new_era"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(TARDIS_ITEM))
            .displayName(Text.literal("New Era"))
            .build();

    public static Item register(Item item, String id) {

        // Create the identifier for the item.
        Identifier itemID = Identifier.of(NewEra.MOD_ID, id);//aa


        // Return the registered item!
        return Registry.register(Registries.ITEM, itemID, item);

    }
    public static void intialize() {
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(TARDIS_ITEM); //aa
        });

    }
}
