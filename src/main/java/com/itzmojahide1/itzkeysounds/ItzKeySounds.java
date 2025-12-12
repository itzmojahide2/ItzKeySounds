package com.itzmojahide1.itzkeysounds;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;

@Mod(modid = "itzkeysounds", name = "ItzKeySounds", version = "1.0")
public class ItzKeySounds {
    public static boolean enabled = true;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        ClientRegistry.registerKeyBinding(KeyHandler.toggleKey);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        MinecraftForge.EVENT_BUS.register(new KeyHandler());
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
    }
}
