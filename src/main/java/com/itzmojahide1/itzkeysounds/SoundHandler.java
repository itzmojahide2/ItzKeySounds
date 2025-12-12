package com.itzmojahide1.itzkeysounds;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import java.util.Random;
public class SoundHandler {
    Random r=new Random();
    @SubscribeEvent
    public void onKeyPress(InputEvent.KeyInputEvent e){
        if(!ItzKeySounds.enabled) return;
        if(!Keyboard.getEventKeyState()) return;
        String[] s={"key1","key2","key3"};
        play("keyboard."+s[r.nextInt(s.length)]);
    }
    @SubscribeEvent
    public void onMouse(InputEvent.MouseInputEvent e){
        if(!ItzKeySounds.enabled) return;
        if(Mouse.isButtonDown(0)) play("mouse.left");
        if(Mouse.isButtonDown(1)) play("mouse.right");
    }
    private void play(String n){
        Minecraft.getMinecraft().getSoundHandler().playSound(
            PositionedSoundRecord.create(new ResourceLocation("itzkeysounds:"+n),1.0F)
        );
    }
}
