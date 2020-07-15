package turtlebot3_msgs;

public interface Sound extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "turtlebot3_msgs/Sound";
  static final java.lang.String _DEFINITION = "########################################\n# CONSTANTS\n########################################\nuint8 OFF           = 0\nuint8 ON            = 1\nuint8 LOW_BATTERY   = 2\nuint8 ERROR         = 3\nuint8 BUTTON1       = 4\nuint8 BUTTON2       = 5\n\n########################################\n# Messages\n########################################\nuint8 value\n";
  static final byte OFF = 0;
  static final byte ON = 1;
  static final byte LOW_BATTERY = 2;
  static final byte ERROR = 3;
  static final byte BUTTON1 = 4;
  static final byte BUTTON2 = 5;
  byte getValue();
  void setValue(byte value);
}
