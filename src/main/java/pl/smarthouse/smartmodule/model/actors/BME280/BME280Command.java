package pl.smarthouse.smartmodule.model.actors.BME280;

import pl.smarthouse.smartmodule.model.actors.Command;

public enum BME280Command implements Command {
  SLEEP,
  WAKEUP,
  READ
}