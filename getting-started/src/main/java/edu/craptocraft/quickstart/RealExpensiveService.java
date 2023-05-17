package edu.craptocraft.quickstart;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RealExpensiveService implements ExpensiveService {

    @Override
    public int calculate() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        return 100;
    }

}
