package org.icannt.fixflux;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import sonar.flux.common.entity.EntityFireItem;

@Mod(modid = FixFluxMod.MODID, version = FixFluxMod.VERSION, acceptableRemoteVersions = "*", dependencies = "required-after:FluxNetworks;")
public class FixFluxMod
{
    public static final String MODID = "fixflux";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        EntityRegistry.registerModEntity(EntityFireItem.class, "FireItem", 0, this, 100, 10, true);

    }
}
