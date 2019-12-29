package log;

public interface LogInterface {

	void setLogLevel(LogLevel level);

	void error(String msg);

	void warning(String msg);

	void debug(String msg);

}
