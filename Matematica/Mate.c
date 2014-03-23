// Mate1.cpp: define las funciones exportadas de la aplicaci�n DLL.
//

#include <jni.h>
#include <stdio.h>
#include "Mate.h"


JNIEXPORT jdouble JNICALL Java_Mate_suma (JNIEnv * je, jobject jo, jdouble num1, jdouble num2){
	return num1+num2;

}

JNIEXPORT jdouble JNICALL Java_Mate_resta(JNIEnv * je, jobject jo, jdouble num1, jdouble num2){
	return num1-num2;

}
JNIEXPORT jdouble JNICALL Java_Mate_multip (JNIEnv * je, jobject jo, jdouble num1, jdouble num2){
	return num1*num2;

}
JNIEXPORT jdouble JNICALL Java_Mate_divs (JNIEnv * je, jobject jo, jdouble num1, jdouble num2){
	return num1/num2;

}

