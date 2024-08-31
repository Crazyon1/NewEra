package me.crazyon.newera;

import me.crazyon.newera.item.NewEraItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionType;


public class NewEra implements ModInitializer {
    public static final String MOD_ID = "new_era";
    @Override
    public void onInitialize() {
        NewEraItems.initialize(); // initalizes items a

    }
}
