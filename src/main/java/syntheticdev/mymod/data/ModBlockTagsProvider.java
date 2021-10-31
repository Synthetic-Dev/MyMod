package syntheticdev.mymod.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import syntheticdev.mymod.Main;
import syntheticdev.mymod.setup.ModBlocks;
import syntheticdev.mymod.setup.ModTags;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {  
        tag(ModTags.Blocks.PLANTS_CACTUS).add(ModBlocks.PRICKLY_CACTUS.get());
    }
}
