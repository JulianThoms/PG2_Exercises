package log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLog implements LogInterface {

	private LogLevel level;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	@Override
	public void setLogLevel(LogLevel level) {
		this.level = level;
	}

	@Override
	public void error(String msg) {
		if (level == LogLevel.ERROR || level == LogLevel.DEBUG) {
			System.out.println(dtf.format(LocalDateTime.now()) + " : " + msg);
		}
	}

	@Override
	public void warning(String msg) {
		if (level == LogLevel.WARNING || level == LogLevel.DEBUG) {
			System.out.println(dtf.format(LocalDateTime.now()) + " : " + msg);
		}
	}

	@Override
	public void debug(String msg) {
		if (level == LogLevel.DEBUG) {
			System.out.println(dtf.format(LocalDateTime.now()) + " : " + msg);
		}
	}
}
