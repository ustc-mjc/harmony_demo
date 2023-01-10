# the minimum version of CMake.
cmake_minimum_required(VERSION 3.4.1)
project(MyLibrary)

add_library(mylibrary SHARED hello.cpp)
target_link_libraries(mylibrary libhilog_ndk.z.so)