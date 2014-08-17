package rmi;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AddServer {
    public static void main(String args[]) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("rmi.AddServer", addServerImpl);
        }
        catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
