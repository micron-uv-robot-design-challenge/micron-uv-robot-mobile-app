#!/bin/sh

if [ -n "$DESTDIR" ] ; then
    case $DESTDIR in
        /*) # ok
            ;;
        *)
            /bin/echo "DESTDIR argument must be absolute... "
            /bin/echo "otherwise python's distutils will bork things."
            exit 1
    esac
    DESTDIR_ARG="--root=$DESTDIR"
fi

echo_and_run() { echo "+ $@" ; "$@" ; }

echo_and_run cd "/home/e0325555/Desktop/Micron/gazebo_workspace/src/turtlebot3/turtlebot3_teleop"

# ensure that Python install destination exists
echo_and_run mkdir -p "$DESTDIR/home/e0325555/Desktop/Micron/gazebo_workspace/install/lib/python2.7/dist-packages"

# Note that PYTHONPATH is pulled from the environment to support installing
# into one location when some dependencies were installed in another
# location, #123.
echo_and_run /usr/bin/env \
    PYTHONPATH="/home/e0325555/Desktop/Micron/gazebo_workspace/install/lib/python2.7/dist-packages:/home/e0325555/Desktop/Micron/gazebo_workspace/build/lib/python2.7/dist-packages:$PYTHONPATH" \
    CATKIN_BINARY_DIR="/home/e0325555/Desktop/Micron/gazebo_workspace/build" \
    "/usr/bin/python2" \
    "/home/e0325555/Desktop/Micron/gazebo_workspace/src/turtlebot3/turtlebot3_teleop/setup.py" \
    build --build-base "/home/e0325555/Desktop/Micron/gazebo_workspace/build/turtlebot3/turtlebot3_teleop" \
    install \
    $DESTDIR_ARG \
    --install-layout=deb --prefix="/home/e0325555/Desktop/Micron/gazebo_workspace/install" --install-scripts="/home/e0325555/Desktop/Micron/gazebo_workspace/install/bin"
