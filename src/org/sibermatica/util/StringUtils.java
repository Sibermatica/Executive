package org.sibermatica.util;

public class StringUtils {
	
	public static class Color {
		
		public static final String RESET = "\u001B[0m";
		public static String resetColor(String text) {
			return RESET.concat(text);
		}
		
		public static class Foreground {
		    public static final String BLACK = "\u001B[30m";
		    public static final String RED = "\u001B[31m";
		    public static final String GREEN = "\u001B[32m";
		    public static final String YELLOW = "\u001B[33m";
		    public static final String BLUE = "\u001B[34m";
		    public static final String PURPLE = "\u001B[35m";
		    public static final String CYAN = "\u001B[36m";
		    public static final String WHITE = "\u001B[37m";
		    
		    public static String insertBLACK(String text) {
		    	return BLACK.concat(text) + RESET;
		    }
		    
		    public static String insertRED(String text) {
		    	return RED.concat(text) + RESET;
		    }
		    
		    public static String insertGREEN(String text) {
		    	return GREEN.concat(text) + RESET;
		    }
		    
		    public static String insertYELLOW(String text) {
		    	return YELLOW.concat(text) + RESET;
		    }
		    
		    public static String insertCYAN(String text) {
		    	return CYAN.concat(text) + RESET;
		    }
		    
		    public static String insertWHITE(String text) {
		    	return WHITE.concat(text) + RESET;
		    }
		    
		    public static String insertBLUE(String text) {
		    	return BLUE.concat(text) + RESET;
		    }
		    
		    public static String insertPURPLE(String text) {
		    	return PURPLE.concat(text) + RESET;
		    }
			
		}

	    public static class Background {
	    	
	        public static final String BLACK = "\u001B[40m";
	        public static final String RED = "\u001B[41m";
	        public static final String GREEN = "\u001B[42m";
	        public static final String YELLOW = "\u001B[43m";
	        public static final String BLUE = "\u001B[44m";
	        public static final String PURPLE = "\u001B[45m";
	        public static final String CYAN = "\u001B[46m";
	        public static final String WHITE = "\u001B[47m";

	        
	        public static String insertBLACK(String text) {
	        	return BLACK.concat(text) + RESET;
	        }
	        
	        public static String insertRED(String text) {
	        	return RED.concat(text) + RESET;
	        }
	        
	        public static String insertGREEN(String text) {
	        	return GREEN.concat(text) + RESET;
	        }
	        
	        public static String insertYELLOW(String text) {
	        	return YELLOW.concat(text) + RESET;
	        }
	        
	        public static String insertCYAN(String text) {
	        	return CYAN.concat(text) + RESET;
	        }
	        
	        public static String insertWHITE(String text) {
	        	return WHITE.concat(text) + RESET;
	        }
	        
	        public static String insertBLUE(String text) {
	        	return BLUE.concat(text) + RESET;
	        }
	        
	        public static String insertPURPLE(String text) {
	        	return PURPLE.concat(text) + RESET;
	        }
	        
	    }
		
	}
	
	public static String trimAll(String text) {
		return text.replaceAll(" ", "");
	}

	public static String padStart(String text, int maxLength, String fillString) {
		while(text.length() < maxLength) {
			text = fillString.concat(text);
		}

		return text;
	}

	public static String padEnd(String text, int maxLength, String fillString) {
		while(text.length() < maxLength) {
			text = text.concat(fillString);
		}

		return text;
	}

	public static String ToString(String str) {
		return str;
	}
	
	public static Integer ToInteger(String str)
			throws NumberFormatException {
		return Integer.parseInt(str);
	}
	
	public static Boolean ToBoolean(String str) {
		return switch (str) {
			case "1", "true", "yes", "si" -> true;
			default -> false;
		};
	}


}
