#include <cstdio>
#include <jni.h>
#include <string>
#include <hilog/log.h>

#if defined(__OHOS__)

#endif

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_mylibrary_JNITools_addNumber(JNIEnv* env, jobject obj, int a, int b) {
    return a+b;
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_mylibrary_JNITools_subNumber(JNIEnv* env, jobject obj, int a, int b) {
    return a-b;
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_mylibrary_JNITools_mulNumber(JNIEnv* env, jobject obj, int a, int b) {
    return a*b;
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_mylibrary_JNITools_divNumber(JNIEnv* env, jobject obj, int a, int b) {
    return a/b;
}
