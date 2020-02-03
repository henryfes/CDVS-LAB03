package edu.eci.cvds.tdd.registry;

public class Registry {
	public RegisterResult registerVoter(Person p) {
		RegisterResult res;
		
		if (p.getAge() < 18) {
			res=RegisterResult.UNDERAGE;
		}
		else if (p.getAge()<0 || p.getAge()>125) {
			res=RegisterResult.INVALID_AGE;
		}
		else if (!p.isAlive()) {
			res=RegisterResult.DEAD;
		}
		else if(p.getMil()) {
			res=RegisterResult.MILITAR;
		}
		else {
			res=RegisterResult.VALID;
		}
		
        return res;
    }
}
