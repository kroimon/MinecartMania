package com.afforess.minecartmaniacore.event;
import org.bukkit.event.CustomEventListener;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;


public class MinecartManiaListener extends CustomEventListener implements Listener{

	public MinecartManiaListener() {
		
	}
	

	/**
	 * Called when a minecart attempts to perform any action. Only occurs after a minecart changes position
	 * 
	 * @param event
	 */
	public void onMinecartActionEvent(MinecartActionEvent event) {
		
	}
	
	/**
	 * Called when the internal clock of a minecart is updated (each second)
	 * 
	 * @param event
	 */
	public void onMinecartTimeEvent(MinecartTimeEvent event) {
		
	}
	
	/**
	 * Called when a minecart that was not moving last tick began moving this tick
	 * 
	 * @param event
	 */
	public void onMinecartMotionStartEvent(MinecartMotionStartEvent event) {
		
	}
	
	/**
	 * Called when a minecart that was moving last tick stopped moving this tick
	 * 
	 * @param event
	 */
	public void onMinecartMotionStopEvent(MinecartMotionStopEvent event) {
		
	}
	
	/**
	 * Called when a minecart reaches an intersection
	 * An intersection is considered any point where there is at least 3 minecart tracks intersecting, one forward, one backward, one perpendicular.
	 * 
	 * @param event
	 */
	public void onMinecartIntersectionEvent(MinecartIntersectionEvent event) {
		
	}
	
	/**
	 * Called when the redstone power state adjacent to any chest changes.
	 * 
	 * @param event
	 */
	public void onChestPoweredEvent(ChestPoweredEvent event) {
		
	}
	
	/**
	 * Called when a MinecartManiaMinecart is destroyed
	 * 
	 * @param event
	 */
	public void onMinecartManiaMinecartDestroyedEvent(MinecartManiaMinecartDestroyedEvent event) {
		
	}
	
	/**
	 * Called when a MinecartManiaMinecart is created. This is not nessecary the same as when the generic type Minecart is created.
	 * 
	 * @param event
	 */
	public void onMinecartManiaMinecartCreatedEvent(MinecartManiaMinecartCreatedEvent event) {
		
	}
	
	/**
	 * Called when a minecart is being launched by a launcher block, can be overriden
	 * 
	 * @param event
	 */
	public void onMinecartLaunchedEvent(MinecartLaunchedEvent event) {
		
	}
	
	
	/**
	 * Called when a chest attempts to spawn a minecart. Can be cancelled, or the location changed.
	 * 
	 * @param event
	 */
	public void onChestSpawnMinecartEvent(ChestSpawnMinecartEvent event) {
		
	}

	/**
	 * Called when a player inside of a minecart tap on the minecart from the inside
	 * 
	 * @param event
	 */
	public void onMinecartClickedEvent(MinecartClickedEvent event) {
		
	}

	/**
	 * Called when a minecart is caught by a catcher block
	 * 
	 * @param event
	 */
	public void onMinecartCaughtEvent(MinecartCaughtEvent event) {
		
	}
	
	/**
	 * Called when a minecart is moved by an elevator block
	 * 
	 * @param event
	 */
	public void onMinecartElevatorEvent(MinecartElevatorEvent event) {

	}
	
	/**
	 * Called when a minecart changes it's direction of motion
	 * 
	 * @param event
	 */
	public void onMinecartDirectionChangeEvent(MinecartDirectionChangeEvent event) {
		
	}
	
	/**
	 * Called when a minecart's speed will be altered by a speed multipler block.
	 * 
	 * @param event
	 */
	public void onMinecartSpeedMultiplierEvent(MinecartSpeedMultiplierEvent event) {
		
	}
	
	/**
	 * Called when a minecart's will be killed by a minecart kill block
	 * 
	 * @param event
	 */
	public void onMinecartKillEvent(MinecartKillEvent event) {
		
	}	
	
	/**
	 * Called when a minecart's will be spawned by a minecart spawner block
	 * 
	 * @param event
	 */
	public void onMinecartSpawnEvent(MinecartSpawnEvent event) {
		
	}
	
	/**
	 * Called when a sign has been found for the first time
	 * 
	 * @param event
	 */
	public void onMinecartManiaSignFoundEvent(MinecartManiaSignFoundEvent event) {
		
	}
	
	/**
	 * Called when a minecart meets a specific station condition on a sign
	 * 
	 * @param event
	 */
	public void onMinecartMeetConditionEvent(MinecartMeetsConditionEvent event) {
		
	}
	
	public void onMinecartPassengerEjectEvent(MinecartPassengerEjectEvent event) {
		
	}
	
	/**
	 * Avoid using.
	 * 
	 * @param event
	 */
	public void onCustomEvent(Event event) {
		if (event instanceof MinecartActionEvent) {
			onMinecartActionEvent((MinecartActionEvent)event);
		}
		else if (event instanceof MinecartTimeEvent) {
			onMinecartTimeEvent((MinecartTimeEvent)event);
		}
		else if (event instanceof MinecartIntersectionEvent) {
			onMinecartIntersectionEvent((MinecartIntersectionEvent)event);
		}
		else if (event instanceof MinecartMotionStartEvent) {
			onMinecartMotionStartEvent((MinecartMotionStartEvent)event);
		}
		else if (event instanceof MinecartMotionStopEvent) {
			onMinecartMotionStopEvent((MinecartMotionStopEvent)event);
		}
		else if (event instanceof ChestPoweredEvent) {
			onChestPoweredEvent((ChestPoweredEvent)event);
		}
		else if (event instanceof MinecartManiaMinecartDestroyedEvent) {
			onMinecartManiaMinecartDestroyedEvent((MinecartManiaMinecartDestroyedEvent)event);
		}
		else if (event instanceof MinecartLaunchedEvent) {
			onMinecartLaunchedEvent((MinecartLaunchedEvent)event);
		}
		else if (event instanceof ChestSpawnMinecartEvent) {
			onChestSpawnMinecartEvent((ChestSpawnMinecartEvent)event);
		}
		else if (event instanceof MinecartManiaMinecartCreatedEvent) {
			onMinecartManiaMinecartCreatedEvent((MinecartManiaMinecartCreatedEvent)event);
		}
		else if (event instanceof MinecartClickedEvent) {
			onMinecartClickedEvent((MinecartClickedEvent)event);
		}
		else if (event instanceof MinecartCaughtEvent) {
			onMinecartCaughtEvent((MinecartCaughtEvent)event);
		}
		else if (event instanceof MinecartElevatorEvent) {
			onMinecartElevatorEvent((MinecartElevatorEvent)event);
		}
		else if (event instanceof MinecartDirectionChangeEvent) {
			onMinecartDirectionChangeEvent((MinecartDirectionChangeEvent)event);
		}
		else if (event instanceof MinecartManiaSignFoundEvent) {
			onMinecartManiaSignFoundEvent((MinecartManiaSignFoundEvent)event);
		}
		else if (event instanceof MinecartMeetsConditionEvent) {
			onMinecartMeetConditionEvent((MinecartMeetsConditionEvent)event);
		}
		else if (event instanceof MinecartPassengerEjectEvent) {
			onMinecartPassengerEjectEvent((MinecartPassengerEjectEvent)event);
		}
	}

}
