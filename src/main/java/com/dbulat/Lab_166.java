package com.dbulat;

import java.util.Arrays;
import java.util.Random;

public class Lab_166 {
    public static void main(String[] args) {

        Random random=new Random();

        int[] arrayOfTemp =new int [11];

        // иннициализируем массив из случайных чисел от -50 до 50
        for (int i = 0; i < arrayOfTemp.length; i++) {
            int max=50;
            int min=-50;
            int diff=max-min;
            int x = random.nextInt(diff + 1);
            x += min;
            arrayOfTemp[i]=x;
        }


        Arrays.sort(arrayOfTemp);

//вычисляем длинну будущих массивов
        int lengthPoz=0;
        int lengthNeg=0;
        for (int i = 0; i < arrayOfTemp.length; i++) {
            if (arrayOfTemp[i]>=0)
            {lengthPoz++;}
            else
                {lengthNeg++;}
            }
//создаем новые массивы
        int[] arrPoz = new int[lengthPoz];
        int[] arrNeg = new int[lengthNeg];
//задаем начальные индексы созданных массивов
        int indexPoz=0;
        int indexNeg=0;
//проверяем элементы основного массива на соответствие условиям
// и записываем в новый массив
        for (int i = 0; i < arrayOfTemp.length; i++) {
            if (arrayOfTemp[i]>=0){
                arrPoz[indexPoz++]=arrayOfTemp[i];

            }else{
                arrNeg[indexNeg++]=arrayOfTemp[i];
            }
        }
        System.out.println(Arrays.toString(arrPoz));
        System.out.println(Arrays.toString(arrNeg));




    }

}
