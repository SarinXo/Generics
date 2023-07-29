/**
 *      package org.example;
 *
 *      //не скомпилируется!!
 *      // параметризованные классы не могут быть созданы, если они имеют в предках
 *      //  Throwable, анонимные классы, Enums
 *
 *      // из за чего такая песня? Пример:
 *
 *      try{
 *          run();
 *      }catch(GenericException<String> e){
 *          ...
 *      }catch(GenericException<Integer> e){
 *          ...
 *      }
 *
 *      // Поэтому не имеет смысла после стирания!
 *
 *
 *      public class ErrorClass<T> extends Exception{
 *          private final T details;
 *
 *          public ErrorClass(T details){
 *              this.details = details;
 *          }
 *
 *          public T getDetails(){
 *              return details;
 *          }
 *      }
 *
 */
