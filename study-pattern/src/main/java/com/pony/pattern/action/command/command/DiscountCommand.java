package com.pony.pattern.action.command.command;

import com.pony.pattern.action.command.Command;
import com.pony.pattern.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {

    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
