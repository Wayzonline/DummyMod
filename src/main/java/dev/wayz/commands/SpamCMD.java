package dev.wayz.commands;

import net.minecraft.command.*;


public class SpamCMD extends CommandBase {

    public String getCommandName() {
        return "bozospam";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    public void processCommand(ICommandSender sender, String[] args) {
        boolean spamming = true;
        int spamCount = 0;
    }
}