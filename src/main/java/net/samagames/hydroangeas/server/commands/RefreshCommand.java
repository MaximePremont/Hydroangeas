package net.samagames.hydroangeas.server.commands;

import net.samagames.hydroangeas.common.commands.AbstractCommand;
import net.samagames.hydroangeas.server.HydroangeasServer;
import net.samagames.hydroangeas.server.client.HydroClient;
import net.samagames.hydroangeas.server.client.MinecraftServerS;

/**
 * Created by Silva on 22/10/2015.
 */
public class RefreshCommand extends AbstractCommand
{
    public HydroangeasServer instance;

    public RefreshCommand(HydroangeasServer hydroangeasServer)
    {
        super("refresh");
        this.instance = hydroangeasServer;
    }

    @Override
    public boolean execute(String[] args)
    {
        instance.getLogger().info("Refreshing all clients..");
        instance.getClientManager().globalCheckData();
        return true;
    }
}