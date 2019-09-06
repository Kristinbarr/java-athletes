package com.lambdaschool.solution;
// we decide what things we want our app to do here, then run things through MyApplication
// we invoke two methods: sendMessage(), readMessage()

public interface Processor {

  void sendMessage(String msg, String address);
  String readMessage();

}
