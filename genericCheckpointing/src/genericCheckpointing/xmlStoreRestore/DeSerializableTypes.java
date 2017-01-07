package genericCheckpointing.xmlStoreRestore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeSerializableTypes  {
	public String returnClassname(String line) {
		Pattern pattern = Pattern.compile("genericCheckpointing.util.*(MyAllTypesFirst|MyAllTypesSecond)");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return line.substring(matcher.start(), matcher.end());
	}
	public int extractTagsForInt(String line) {
		Pattern pattern = Pattern.compile(">.*<");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return Integer.parseInt(line.substring(matcher.start() + 1, matcher.end() - 1));
	}
	public double extractTagsForDouble(String line) {
		Pattern pattern = Pattern.compile(">.*<");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return Double.parseDouble(line.substring(matcher.start() + 1, matcher.end() - 1));
	}
	public String extractTagsForString(String line) {
		Pattern pattern = Pattern.compile(">.*<");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return (line.substring(matcher.start() + 1, matcher.end() - 1));
	}
	public long extractTagsForLong(String line) {
		Pattern pattern = Pattern.compile(">.*<");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return Long.parseLong(line.substring(matcher.start() + 1, matcher.end() - 1));
	}
	public boolean extractTagsForBoolean(String line) {
		Pattern pattern = Pattern.compile(">.*<");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return Boolean.parseBoolean(line.substring(matcher.start() + 1, matcher.end() - 1));
	}
	public float extractTagsForFloat(String line) {
		Pattern pattern = Pattern.compile(">.*<");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return Float.parseFloat(line.substring(matcher.start() + 1, matcher.end() - 1));
	}
	public short extractTagsForShort(String line) {
		Pattern pattern = Pattern.compile(">.*<");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return Short.parseShort(line.substring(matcher.start() + 1, matcher.end() - 1));
	}
	public char extractTagsForChar(String line) {
		Pattern pattern = Pattern.compile(">.*<");
		Matcher matcher = pattern.matcher(line);
		matcher.find();
		return (line.substring(matcher.start() + 1, matcher.end() - 1)).charAt(0);
	}
}