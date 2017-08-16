
public class Album implements Comparable<Album> {
	String title;
	String artist;
	int releaseDate;
	String totalTime;
	public Album(String title, String artist, String releaseDate,
			String totalTime) {
		super();
		this.title = title;
		this.artist = artist;
		this.releaseDate = Integer.parseInt(releaseDate);
		this.totalTime = totalTime;
	}
	@Override
	public String toString() {
		String delimeter = ", ";
		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append(delimeter);
		sb.append(totalTime);
		return sb.toString();
	}
	public int totalTimeInt() {
		String fields[] = totalTime.split(":");
		int hour = Integer.parseInt(fields[0]);
		int min = Integer.parseInt(fields[1]);
		int sec = Integer.parseInt(fields[2]);
		return (hour*3600)+(min*60)+sec;
	}
	@Override
	public int compareTo(Album o) {
		if(totalTimeInt() > o.totalTimeInt()){
			return 1;
		}else if(totalTimeInt() < o.totalTimeInt()){
			return -1;
		}else{
			return 0;
		}
	}
}
