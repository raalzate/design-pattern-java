package co.com.techandsolve.patten.command;

/**
 * Created by MyMac on 18/04/18.
 */
public abstract class Command<T> {
     protected T payload;
     public Command(T payload){
          this.payload = payload;
     }
     abstract void run();
}
