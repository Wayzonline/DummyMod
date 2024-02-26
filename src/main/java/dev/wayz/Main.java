package dev.wayz;
import dev.wayz.commands.SpamCMD;

import static java.lang.System.*;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {

    public static final String MODID = "dummymod";
    public static final String VERSION = "1.0";

    public boolean spamming = false;
    public int spamCount = 0;


    public Minecraft mc = Minecraft.getMinecraft();

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        ClientCommandHandler.instance.registerCommand(new SpamCMD());

		// Printing my cum into console (not fake tho) :hot_face:
        out.println("I successfully came in my pants ! UwU");

    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (spamming && spamCount < 100) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("L bozo u got skill issued !!!"));
            spamCount++;
        } else {
            spamming = false;
        }
    }

}