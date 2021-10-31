package syntheticdev.mymod.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import syntheticdev.mymod.Main;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("cactus_prickly", modLoc("block/cactus_prickly"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        buildItem(itemGenerated, "cactus_fruit");
    }

    private void buildItem(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/"+ name);
    }
}
