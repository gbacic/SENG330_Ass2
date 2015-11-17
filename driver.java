
import gameDBProto.*;
//import gameDBProto.Room;
//import gameDB.Rooms;

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;


public class driver {




/* Room variables to fill
message Room {
  required string roomID = 1;
  required string roomName = 2;
  required string roomDescription = 3;
  required bool roomHasTrap = 4;
  optional string trapID = 5;
  optional string trapDescription = 6;
  optional int32 trapRoll = 7;
  required string connectingRoom1 = 8;
  required string connectingRoom2 = 9;
  required string previousRoom = 10;
  required bool roomHasItem = 11;
  optional string Item = 12;
  optional bool ItemRemoved = 13;
*/
    public Room roomAdd(){

       // gameDB newgame = new GameDB();

    Room.Builder temp = Room.newBuilder()
    .setroomID("R001")
    .setroomName("The front yard")

    .setroomDescription("A plain front yard is in front of you, the smell of raccoon sweat and success emanates from the trash can.")
    .setroomHasTrap(true)
    .setconnectingRoom2("R002")
    .setconnectingRoom1("R000")
    .setpreviousRoom("R000")
    .setroomHasTrap(true)
    .build();

   return temp;
}



    public static void main (String args[]) throws IOException {

System.out.println("Test");      



}
}



/*

message Player{
  required string playerName = 1;
  required string playerType = 2;
  required string playerstrength = 3;
  required int32 health = 4;
  repeated string inventory = 5;

  

}

message Monster{
    required string monsterID = 1;
    required int32 monsterAttack = 2;
    required string monsterDescription = 3;
}

message Item{
    required string itemID = 1;
    required string itemName = 2;
    required string itemDescription = 3;
    required int32 itemAttack = 4;
}

message Room {
  required string roomID = 1;
  required string roomName = 2;
  required string roomDescription = 3;
  required bool roomHasTrap = 4;
  optional string trapID = 5;
  optional string trapDescription = 6;
  optional int32 trapRoll = 7;
  required string connectingRoom1 = 8;
  required string connectingRoom2 = 9;
  required string previousRoom = 10;
  required bool roomHasItem = 11;
  optional string Item = 12;
  optional bool ItemRemoved = 13;
}

message Rooms{
  repeated Room rooms = 1;

}
 
 message Items{
repeated Item items = 1;

 }

 message Monsters{
repeated Monster monsters = 1;

*/
