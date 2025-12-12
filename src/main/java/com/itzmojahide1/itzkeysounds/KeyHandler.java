package com.itzmojahide1.itzkeysounds;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
public class KeyHandler {
    public static KeyBinding toggleKey = new KeyBinding("Toggle ItzKeySounds", Keyboard.KEY_O, "ItzKeySounds");
    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent e){
        if(toggleKey.isPressed()){
            ItzKeySounds.enabled=!ItzKeySounds.enabled;
            Minecraft.getMinecraft().thePlayer.addChatMessage(
                new net.minecraft.util.ChatComponentText("ItzKeySounds: "+(ItzKeySounds.enabled?"ON":"OFF"))
            );
        }
    }
}
