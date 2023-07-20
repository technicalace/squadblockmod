package com.thatoneperson.squadblockmod.item;

import net.minecraft.network.chat.Component;

import com.thatoneperson.squadblockmod.SquadBlockMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = SquadBlockMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab SQUAD_TAB;

    @SubscribeEvent 
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        SQUAD_TAB = event.registerCreativeModeTab(new ResourceLocation(SquadBlockMod.MODID, "squad_tab"),
            builder -> builder.icon(() -> new ItemStack(ModItems.SQUAD_STONE.get()))
                .title(Component.translatable("creativemodetab.squad_tab")));
    }
    
}
