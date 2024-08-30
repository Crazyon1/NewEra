package me.crazyon.newera;

import me.crazyon.newera.item.NewEraItems;
import net.fabricmc.api.ModInitializer;

public class NewEra implements ModInitializer {
    public static final String  MOD_ID = "new_era";
    @Override
    public void onInitialize() {
        NewEraItems.intialize(); // initalizes items
    }
}
