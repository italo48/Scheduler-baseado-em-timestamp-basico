package exec;

public class Dado {
	private String id;
	private int readTimeStamp;
	private int writeTimeStamp;
	
	
	public Dado(String id, int readTimeStamp, int writeTimeStamp) {
		super();
		this.id = id;
		this.readTimeStamp = readTimeStamp;
		this.writeTimeStamp = writeTimeStamp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getReadTimeStamp() {
		return readTimeStamp;
	}
	public void setReadTimeStamp(int readTimeStamp) {
		this.readTimeStamp = readTimeStamp;
	}
	public int getWriteTimeStamp() {
		return writeTimeStamp;
	}
	public void setWriteTimeStamp(int writeTimeStamp) {
		this.writeTimeStamp = writeTimeStamp;
	}	
}
