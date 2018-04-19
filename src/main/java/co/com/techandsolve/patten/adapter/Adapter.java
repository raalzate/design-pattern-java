package co.com.techandsolve.patten.adapter;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public abstract class Adapter<S, T> {
    abstract public void request(S payload);
    abstract public T response();
}
