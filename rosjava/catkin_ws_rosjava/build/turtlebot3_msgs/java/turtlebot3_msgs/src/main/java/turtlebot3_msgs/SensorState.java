package turtlebot3_msgs;

public interface SensorState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "turtlebot3_msgs/SensorState";
  static final java.lang.String _DEFINITION = "########################################\n# CONSTANTS\n########################################\n# Bumper states (states are combined, when multiple bumpers are pressed)\nuint8 BUMPER_FORWARD  = 1\nuint8 BUMPER_BACKWARD = 2\n\n# Cliff sensor states (states are combined, when multiple cliff sensors are triggered)\nuint8 CLIFF = 1\n\n# Sonar sensor states (states are combined, when multiple sonar sensors are triggered)\nuint8 SONAR = 1\n\n# Illumination sensor (states are combined, when multiple illumination sensors are triggered) \nuint8 ILLUMINATION = 1\n\n# Button states (states are combined, when multiple buttons are pressed)\nuint8 BUTTON0 = 1\nuint8 BUTTON1 = 2\n\n# Motor errors\nuint8 ERROR_LEFT_MOTOR  = 1\nuint8 ERROR_RIGHT_MOTOR = 2\n\n# Motor torque\nuint8 TORQUE_ON  = 1\nuint8 TORQUE_OFF = 2\n\n########################################\n# Messages\n########################################\nHeader  header\nuint8   bumper\nfloat32 cliff\nfloat32 sonar\nfloat32 illumination\nuint8   led\nuint8  button\nbool   torque\nint32  left_encoder    # (-2,147,483,648 ~ 2,147,483,647)\nint32  right_encoder   # (-2,147,483,648 ~ 2,147,483,647)\nfloat32  battery\n";
  static final byte BUMPER_FORWARD = 1;
  static final byte BUMPER_BACKWARD = 2;
  static final byte CLIFF = 1;
  static final byte SONAR = 1;
  static final byte ILLUMINATION = 1;
  static final byte BUTTON0 = 1;
  static final byte BUTTON1 = 2;
  static final byte ERROR_LEFT_MOTOR = 1;
  static final byte ERROR_RIGHT_MOTOR = 2;
  static final byte TORQUE_ON = 1;
  static final byte TORQUE_OFF = 2;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getBumper();
  void setBumper(byte value);
  float getCliff();
  void setCliff(float value);
  float getSonar();
  void setSonar(float value);
  float getIllumination();
  void setIllumination(float value);
  byte getLed();
  void setLed(byte value);
  byte getButton();
  void setButton(byte value);
  boolean getTorque();
  void setTorque(boolean value);
  int getLeftEncoder();
  void setLeftEncoder(int value);
  int getRightEncoder();
  void setRightEncoder(int value);
  float getBattery();
  void setBattery(float value);
}
