package syntheticdev.mymod.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import syntheticdev.mymod.Main;
import syntheticdev.mymod.setup.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(Items.MAGENTA_DYE.getItem(), 2)
                .requires(ModItems.CACTUS_FRUIT.get())
                .unlockedBy("has_item", has(ModItems.CACTUS_FRUIT.get()))
                .save(consumer);
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(Main.MOD_ID, path);
    }
}
