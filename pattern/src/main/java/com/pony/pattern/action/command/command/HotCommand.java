package com.pony.pattern.action.command.command;

import com.pony.pattern.action.command.Command;
import com.pony.pattern.action.command.handler.HotHandler;

public class HotCommand extends Command {
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
