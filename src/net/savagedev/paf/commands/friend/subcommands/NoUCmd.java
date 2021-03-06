package net.savagedev.paf.commands.friend.subcommands;

import net.md_5.bungee.api.CommandSender;
import net.savagedev.paf.PartyAndFriends;
import net.savagedev.paf.commands.SubCommand;

public class NoUCmd extends SubCommand {
    public NoUCmd(PartyAndFriends plugin) {
        super(plugin);
    }

    @Override
    public void execute(CommandSender user, String... args) {
        this.getPlugin().getMessageUtil().message(user, "&6No &ou&6.");
    }
}
