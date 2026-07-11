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

// Multilevel Inheritance

class Smartphone{
void phone(){
System.out.println(" I am Phone");}}

class Camera extends Smartphone{
void camera(){
System.out.println("Camera");}}

class CameraInterface extends Camera{
void interface(){
System.out.println("Camera Interface");}
}
public class Rev_Inherit{
public static void main(String[]args){

// TEST CLASS (SINGLE INHERITANCE)
Over o1 = new Over();
o1.sayHello();

// VEHICLE CLASS (HYBRID INHERITANCE)
Vehicle v1 = new Vehicle();
v1.car();
v1.bike();

// SMARTPHONE CLASS (MULTLI-LEVEL INHERITANCE)
Smartphone s1 = new Smartphone();
s1.Camera();
s1.interface();
s1.phone();



}}
