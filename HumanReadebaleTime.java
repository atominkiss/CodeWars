package net.protoprint;

public class HumanReadebaleTime {
	public static String makeReadable(int seconds) {
		String sec = String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, ((seconds % 3600) % 60));
		return sec;
	}
}

//Solution from CodeWars
//public class HumanReadableTime {
//	public static String makeReadable(int seconds) {
//		return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
//	}
//}
