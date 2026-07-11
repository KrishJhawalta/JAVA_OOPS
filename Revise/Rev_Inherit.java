// Single Inheritance
class Test{
 void sayHello(){
System.out.println("Greetings, Hello!);}
}
class Over extends Test{

System.out.println("Hello user!, I am class Over);}


// Hierarchial Inheritance

class Vehicle{
void Type(){
System.out.println("Vehicle Types");}}

class Car extends Vehicle{
void car(){
System.out.println("Four Wheeler Car");}}

class Bike extends Vehicle{
void bike(){
System.out.println("2 Wheeler");}}


public class Rev_Inherit{
public static void main(String[]args){

Over o1 = new Over();
o1.sayHello();




}}
