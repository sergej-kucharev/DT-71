package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ThirdTask {
   /*a) Упорядкувати всю послідовність працівників по спадаючій середньомісячного заробітку.
   При збігу зарплати - упорядковувати дані за алфавітом по імені.
   Вивести ідентифікатор працівника, ім'я та середньомісячний заробіток для всіх елементів списку.
    • b) Вивести перші 5 імен працівників з отриманого в пункті а) списку.
    • c) Вивести останні 3 ідентифікатора працівників з отриманого в пункті а) списку.
    • d) Організувати запис і читання колекції у / з файл.
    • e) Організувати обробку некоректного формату вхідного файлу.
    */
   public static Vector<Workers> work = new Vector<Workers>();
   public static void ThirdTask(){
      for (int i =0; i<5; i++){
         Random randNumber = new Random();
         int iNumber = randNumber.nextInt(2000) + 1;
         FixedPrice fp = new FixedPrice("w"+i, i, iNumber);
         fp.MonthSalary();
         work.add(fp);
      }
      for (int i =5; i<10; i++){
         Random randNumber = new Random();
         int iNumber = randNumber.nextInt(100) + 1;
         HourWage hw = new HourWage("w"+i, i, iNumber);
         hw.MonthSalary();
         work.add(hw);
      }
      Sort();
      Taskd_write();
      Taskd_read();
      Taska();
   }
   public static void Taska(){
      for (int i =0; i<10; i++){
         System.out.println(work.get(i).id + "___"+ work.get(i).name + "___" + work.get(i).salary);
      }
   }
   public static void Taskb(){
      for (int i =0; i<5; i++){
         System.out.println(work.get(i).name);
      }
   }
   public static void Taskc(){
      for (int i = 7; i<10; i++){
         System.out.println(work.get(i).id);
      }
   }
   public static void Taskd_write(){
      try(FileWriter writer = new FileWriter("ThirdTask_w.txt", false))
      {
         writer.write( "ID   Name   Salary");
         writer.append('\n');
         for(int i=0; i<10; i++) {
            writer.write(work.get(i).id + "    "+ work.get(i).name + "   " + work.get(i).salary);
            writer.append('\n');
         }
         writer.flush();
      }
      catch(IOException ex){
         System.out.println(ex.getMessage());
      }
   }
   public static void Taskd_read(){
      try(FileReader reader = new FileReader("ThirdTask_r.txt")) {
         char[] buf = new char[256];
         int c;
         while ((c = reader.read(buf)) > 0) {
            if (c < 256) {
               buf = Arrays.copyOf(buf, c);
            }
         }
         String[] words = String.valueOf(buf).split(" ");
         for(int i =0; i<words.length; i++){
            System.out.println(words[i]);
         }
         try {
            for (int i = 0; i < 10; i++) {
               for (int j = 0; j < words.length; j++) {
                  if (words[j].contains(",")) {
                     work.get(i).salary = Double.parseDouble(words[j]);
                     words[j] = "";
                  } else if (words[j].matches("^\\D*$")) {
                     work.get(i).id = Integer.parseInt(words[j]);
                     words[j] = "";
                  }
                  if (words[j].matches("\\D*$")) work.get(i).name = words[j];
               }
            }
         }
         catch (Exception e){
            System.out.println("Incorect format of input file");
         }
      }
      catch(IOException ex){
         System.out.println(ex.getMessage());
      }
   }
   public static void Sort(){
      Collections.sort(work, Workers.COMPARE_BY_NAME);
      Collections.sort(work, Collections.reverseOrder(Workers.COMPARE_BY_SALARY));
      /*
      int last = 10;
      for ( boolean sorted = last == 0; !sorted; --last )
      {
         sorted = true;
         for ( int i = 1; i < last; ++i )
         {
            if (work.get(i-1).salary < work.get(i).salary)
            {
               sorted = false;
               Workers tmp = work.get(i-1);
               work.removeElementAt(i-1);
               work.add(i-1,work.get(i));
               work.removeElementAt(i);
               work.add(i,tmp);
            }
         }
      }
       */
   }
}
