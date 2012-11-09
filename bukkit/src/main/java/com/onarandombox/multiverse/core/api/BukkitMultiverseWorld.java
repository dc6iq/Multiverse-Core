package com.onarandombox.multiverse.core.api;

import org.bukkit.World;

/**
 * Additional API for a Multiverse handled world specifically for Bukkit.
 */
public interface BukkitMultiverseWorld extends MultiverseWorld {

    /**
     * Gets the Bukkit {@link World} associated with this MultiverseWorld.
     *
     * @return The Bukkit world associated with this Multiverse world.
     */
    World getBukkitWorld();
}