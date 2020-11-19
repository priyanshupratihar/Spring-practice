package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it "+fortuneService.getFortune();
	}

	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside init method ");
	}
	
	//add destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside destroy method ");
	
	}
	
	
}
