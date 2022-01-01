// Write C++ code here.
#include <jni.h>
#include <string>
#include <numeric>
#include <iostream>
#include <istream>
#include <bitset>
#include <fstream>


extern "C" JNIEXPORT jstring JNICALL
Java_com_jpb_scratchtappy_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string helloII = "Hello from C++ 17 ";
    std::string hello2 = "Hello from C++ ";
    std::string hello3 = "Hello from C++ ";
    std::string hello4 = "Hello from C++ ";
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
    int myNum11[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum12[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum13[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum14[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum15[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum16[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum17[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum18[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum19[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum20[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum21[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum22[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum23[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum24[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum25[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum26[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum27[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum28[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum29[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum30[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum31[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum32[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum33[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum34[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum35[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum36[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum37[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum38[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum39[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int myNum40[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};


    auto olleh = 25 + 50;
    auto glue = 71 + 108 + 117 + 101;
    std::string str= std::to_string(olleh + glue);
    std::string hello = hello2 + hello3 + hello4 + str;
    return env->NewStringUTF(hello.c_str());
}
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("scratchtappy");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("scratchtappy")
//      }
//    }