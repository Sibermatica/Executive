package org.sibermatica.util;

/**
 * <h1>StringUtils</h1>
 * This class it's used to handle strings
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.2
 * */
public class StringUtils {

	/* Inner classes */

	/**
	 * <h1>Color</h1>
	 * This class it's used to colorizing strings.  It's works with ANSI escape codes.
	 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
	 * @since 1.2
	 * @apiNote ANSI escape codes not have high compatibility.
	 * */
	public static class Color {

		/* Variables */
		
		public static final String RESET = "\u001B[0m";

		/* Methods */

		/**
		 * This methods it's used to reset color to default value.
		 * @param text the text to reset color
		 * @return No-color string
		 * */
		public static String resetColor(String text) {
			return RESET.concat(text);
		}

		/* More Inner classes */
		
		public static class Foreground {

			/* -- Variables -- */

			/**
			 * The color black represented in ASCII Code
			 * */
		    public static final String BLACK = "\u001B[30m";

			/**
			 * The color red represented in ASCII Code
			 * */
		    public static final String RED = "\u001B[31m";

			/**
			 * The color green represented in ASCII Code
			 * */
		    public static final String GREEN = "\u001B[32m";

			/**
			 * The color yellow represented in ASCII Code
			 * */
		    public static final String YELLOW = "\u001B[33m";

			/**
			 * The color blue represented in ASCII Code
			 * */
		    public static final String BLUE = "\u001B[34m";

			/**
			 * The color purple represented in ASCII Code
			 * */
		    public static final String PURPLE = "\u001B[35m";

			/**
			 * The color cyan represented in ASCII Code
			 * */
		    public static final String CYAN = "\u001B[36m";

			/**
			 * The color white represented in ASCII Code
			 * */
		    public static final String WHITE = "\u001B[37m";

			/* -- Methods -- */

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
		    public static String insertBLACK(String text) {
		    	return BLACK.concat(text) + RESET;
		    }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
		    public static String insertRED(String text) {
		    	return RED.concat(text) + RESET;
		    }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
		    public static String insertGREEN(String text) {
		    	return GREEN.concat(text) + RESET;
		    }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
		    public static String insertYELLOW(String text) {
		    	return YELLOW.concat(text) + RESET;
		    }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
		    public static String insertCYAN(String text) {
		    	return CYAN.concat(text) + RESET;
		    }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
		    public static String insertWHITE(String text) {
		    	return WHITE.concat(text) + RESET;
		    }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
		    public static String insertBLUE(String text) {
		    	return BLUE.concat(text) + RESET;
		    }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
		    public static String insertPURPLE(String text) {
		    	return PURPLE.concat(text) + RESET;
		    }
			
		}

	    public static class Background {

			/* -- Variables -- */

			/**
			 * The color black represented in ASCII Code
			 * */
	        public static final String BLACK = "\u001B[40m";

			/**
			 * The color red represented in ASCII Code
			 * */
	        public static final String RED = "\u001B[41m";

			/**
			 * The color green represented in ASCII Code
			 * */
	        public static final String GREEN = "\u001B[42m";

			/**
			 * The color yellow represented in ASCII Code
			 * */
	        public static final String YELLOW = "\u001B[43m";

			/**
			 * The color blue represented in ASCII Code
			 * */
	        public static final String BLUE = "\u001B[44m";

			/**
			 * The color purple represented in ASCII Code
			 * */
	        public static final String PURPLE = "\u001B[45m";

			/**
			 * The cyan black represented in ASCII Code
			 * */
	        public static final String CYAN = "\u001B[46m";

			/**
			 * The color white represented in ASCII Code
			 * */
	        public static final String WHITE = "\u001B[47m";

			/* -- Methods -- */


			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
	        public static String insertBLACK(String text) {
	        	return BLACK.concat(text) + RESET;
	        }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
	        public static String insertRED(String text) {
	        	return RED.concat(text) + RESET;
	        }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
	        public static String insertGREEN(String text) {
	        	return GREEN.concat(text) + RESET;
	        }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
	        public static String insertYELLOW(String text) {
	        	return YELLOW.concat(text) + RESET;
	        }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
	        public static String insertCYAN(String text) {
	        	return CYAN.concat(text) + RESET;
	        }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
	        public static String insertWHITE(String text) {
	        	return WHITE.concat(text) + RESET;
	        }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
	        public static String insertBLUE(String text) {
	        	return BLUE.concat(text) + RESET;
	        }

			/**
			 * This method colorizes a string with ASCII escape sequences
			 *
			 * @param text the string to color
			 * @return colorized string
			 * */
	        public static String insertPURPLE(String text) {
	        	return PURPLE.concat(text) + RESET;
	        }
	        
	    }
		
	}

	/**
	 * Quits all the white spaces in a string.
	 *
	 * @param text the string to trim
	 * @return the string without spaces
	 * */
	public static String trimAll(String text) {
		return text.replaceAll(" ", "");
	}

	/**
	 * Add padding to a string.
	 *
	 * @param text the string to pad
	 * @return the string with padding
	 * */
	public static String padStart(String text, int maxLength, String fillString) {
		while(text.length() < maxLength) {
			text = fillString.concat(text);
		}

		return text;
	}

	/**
	 * Add padding to a string.
	 *
	 * @param text the string to pad
	 * @return the string with padding
	 * */
	public static String padEnd(String text, int maxLength, String fillString) {
		while(text.length() < maxLength) {
			text = text.concat(fillString);
		}

		return text;
	}

	/**
	 * Converts the given string to an integer number.
	 *
	 * @param str the string to convert
	 * @return the integer number
	 * */
	public static Integer toInteger(String str)
			throws NumberFormatException {
		return Integer.parseInt(str);
	}

	/**
	 * Converts the given string to a boolean value.
	 *
	 * @param str the string to convert
	 * @return the boolean value
	 * */
	public static Boolean toBoolean(String str) {
		return switch (str) {
			case "1", "true", "yes", "si" -> true;
			default -> false;
		};
	}

	/**
	 * Adds a new line to a string with the type of the
	 * new line, you can select Linux or Unix, Macintosh or macOS and Windows.
	 *
	 * @param str the string to add a new line
	 * @param type the type of the new line
	 *
	 * @return the string with the new line added
	 * */
	public static String addNewLine(String str, String type) {
		return str + switch (type) {
			case "Macintosh", "macOS" -> "\r";
			// I don't add Linux and Unix because the default branch have the same line return
			case "Windows" -> "\r\n";
			default -> "\n"; // Includes Linux and Unix...
		};
	}

	/**
	 * Adds a new line to a string with the type of the
	 * new line, you can select Linux or Unix, Macintosh or macOS and Windows.
	 *
	 * @param aByte the array bytes to add a new line
	 * @param type the type of the new line
	 *
	 * @return the byte array with the new line added
	 * */
	public static byte[] addNewLine(byte[] aByte, String type) {
		return (new String(aByte) + switch (type) {
			case "Macintosh", "macOS" -> "\r";
			// I don't add Linux and Unix because the default branch have the same line return
			case "Windows" -> "\r\n";
			default -> "\n"; // Includes Linux and Unix...
		}).getBytes();
	}

	/**
	 * Adds a new line to a string with the type of the
	 * new line, you can select Linux or Unix, Macintosh or macOS and Windows.
	 *
	 * @param aChar the string to add a new line
	 * @param type the type of the new line
	 *
	 * @return the char array with the new line added
	 * */
	public static char[] addNewLine(char[] aChar, String type) {
		return (new String(aChar) + switch (type) {
			case "Macintosh", "macOS" -> "\r";
			// I don't add Linux and Unix because the default branch have the same line return
			case "Windows" -> "\r\n";
			default -> "\n"; // Includes Linux and Unix...
		}).toCharArray();
	}

	/**
	 * Adds a new line to a string with the type of the
	 * new line, you can select Linux or Unix, Macintosh or macOS and Windows.
	 *
	 * @param strBuilder the string builder to add a new line
	 * @param type the type of the new line
	 *
	 * @return the string builder with the new line added
	 * */
	public static StringBuilder addNewLine(StringBuilder strBuilder, String type) {
		return strBuilder.append(switch (type) {
			case "Macintosh", "macOS" -> "\r";
			// I don't add Linux and Unix because the default branch have the same line return
			case "Windows" -> "\r\n";
			default -> "\n"; // Includes Linux and Unix...
		});
	}

}
