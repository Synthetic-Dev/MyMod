package syntheticdev.mymod.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> PRICKLY_CACTUS = registerWithProps("cactus_prickly",
            () -> new Block(AbstractBlock.Properties.of(Material.CACTUS).strength(0.6f, 1f).harvestLevel(0).sound(SoundType.CROP)),
            new Item.Properties().tab(ItemGroup.TAB_DECORATIONS));

    public static void register() {}

    public static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registry.BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> res = registerNoItem(name, block);
        Registry.ITEMS.register(name, () -> new BlockItem(res.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return res;
    }

    public static <T extends Block> RegistryObject<T> registerWithProps(String name, Supplier<T> block, Item.Properties props) {
        RegistryObject<T> res = registerNoItem(name, block);
        Registry.ITEMS.register(name, () -> new BlockItem(res.get(), props));
        return res;
    }
}
