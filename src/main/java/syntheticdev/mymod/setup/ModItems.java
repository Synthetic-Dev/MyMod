package syntheticdev.mymod.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> CACTUS_FRUIT = Registry.ITEMS.register("cactus_fruit", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));

    public static void register() {}
}
