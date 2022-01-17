//
// Created by Kuba on 07/11/2021.
//

#include <string>
#include <jni.h>
#include "libhelloworld.h"
extern "C" JNIEXPORT jstring JNICALL
Java_com_jpb_scratchtappy_HelloWorld_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello2 = "Hello from C++ ";
    std::string hello3 = "Hello from C++ ";
    std::string hello4 = "Hello from C++ ";
    std::string hello5 = "Hello from C++ ";
    std::string hello6 = "Hello from C++ ";
    std::string hello7 = "Hello from C++ ";
    std::string hello8 = "Hello from C++ ";
    std::string hello9 = "Hello from C++ ";
    std::string hello10 = "Hello from C++ ";
    std::string hello11 = "Hello from C++ ";
    std::string hello12 = "Hello from C++ ";
    std::string hello13 = "Hello from C++ ";
    std::string hello14 = "Hello from C++ ";
    std::string hello15 = "Hello from C++ ";
    std::string hello16 = "Hello from C++ ";
    std::string hello17 = "Hello from C++ ";
    std::string hello18 = "Hello from C++ ";
    std::string hello19 = "Hello from C++ ";
    std::string hello20 = "Hello from C++ ";
    std::string hello21 = "Hello from C++ ";
    std::string hello23 = "Hello from C++ ";
    std::string hello24 = "Hello from C++ ";
    std::string hello25 = "Hello from C++ ";
    std::string hello26 = "Hello from C++ ";
    std::string hello27 = "Hello from C++ ";
    std::string hello28 = "Hello from C++ ";
    std::string hello29 = "Hello from C++ ";
    std::string hello30 = "Hello from C++ ";
    std::string hello31 = "Hello from C++ ";
    std::string hello32 = "Hello from C++ ";
    std::string hello33 = "Hello from C++ ";
    std::string hello34 = "Hello from C++ ";
    std::string hello35 = "Hello from C++ ";
    std::string hello36 = "Hello from C++ ";
    std::string hello37 = "Hello from C++ ";
    std::string hello38 = "Hello from C++ ";
    std::string hello39 = "Hello from C++ ";
    std::string hello22 = "Hello from C++ ";
    std::string amogus = "ඞ The impostor is sus...";
    int myNum[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum2[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum3[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum4[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum5[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum6[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum7[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum8[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum9[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum10[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    auto olleh = 25 + 50;
    auto glue = 71 + 108 + 117 + 101;
    std::string str= std::to_string(olleh + glue);
    std::string hello = hello2 + hello3 + hello4 + str;
    return env->NewStringUTF(hello.c_str());
}
