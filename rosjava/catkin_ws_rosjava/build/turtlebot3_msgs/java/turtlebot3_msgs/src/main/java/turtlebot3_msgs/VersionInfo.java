package turtlebot3_msgs;

public interface VersionInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "turtlebot3_msgs/VersionInfo";
  static final java.lang.String _DEFINITION = "########################################\n# Messages\n########################################\nstring hardware   # <yyyy>.<mm>.<dd>        : hardware version of Turtlebot3 (ex. 2017.05.23)\nstring firmware   # <major>.<minor>.<patch> : firmware version of OpenCR\nstring software   # <major>.<minor>.<patch> : software version of Turtlebot3 ROS packages\n";
  java.lang.String getHardware();
  void setHardware(java.lang.String value);
  java.lang.String getFirmware();
  void setFirmware(java.lang.String value);
  java.lang.String getSoftware();
  void setSoftware(java.lang.String value);
}
