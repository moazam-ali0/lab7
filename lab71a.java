class Message{
String message;
void setmessage(String message){
this.message=message;
}
String getmessage(){
return this.message;}




}
class Sms extends Message{
String recipientContactNo;
void setrecipientContactNo(String recipientContactNo){
this.recipientContactNo=recipientContactNo;
}
String getrecipientContactNo(){
return this.recipientContactNo;}
void Display(){
System.out.println("Your recipientContactNo :"+this.recipientContactNo);
System.out.println("Your Message:"+this.message);

}
}
class Email extends Message{
String sender;
String receiver;
String subject;
void setsender(String sender){
this.sender=sender;
}
void setreceiver(String receiver){
this.receiver=receiver;
}
void setsubject(String subject){this.subject=subject;}
void Display(){
System.out.println("Sender :"+this.sender);
System.out.println("Your receiver:"+this.receiver);
System.out.println("Your Subject :"+this.subject);
System.out.println("Your Message:"+this.message);


}
}
class General{
public static void main(String args[])
{
Sms person1= new Sms();
person1.setmessage("KI hAAAL hn");
person1.setrecipientContactNo("03124567890");
person1.Display();
Email p1= new Email();
p1.setsender("me");
p1.setreceiver("You");
p1.setsubject("Hawal");
p1.setmessage("KI haal hnnn");
p1.Display();


}
}