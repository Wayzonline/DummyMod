package studio.dreamys;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
    public static final String MODID = "dummymodrcool";
    public static final String VERSION = "1.0";
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
		// some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
