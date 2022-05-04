package com.gmail.hankwu0501.blockregen;

import java.util.List;
import org. bukkit.block.Block;
import org. bukkit.event.EventHandler;
import org. bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class ExplosionManager implements Listener {
    BlockRegen plugin;

    public ExplosionManager (BlockRegen blockRegen) {
        plugin = blockRegen;
    }

    @EventHandler
    public void onExplodeEntity (EntityExplodeEvent e) {
        List<Block> blocks = e.blockList();
        e.setYield(0);
        new RegenRun(blocks).runTaskTimer(plugin,1,1);
    }
    @EventHandler
    public void onExplodeBlock (BlockExplodeEvent e) {
        List <Block> blocks = e.blockList();
        e.setYield(0);
        new RegenRun(blocks).runTaskTimer(plugin,1,1);
    }
}
