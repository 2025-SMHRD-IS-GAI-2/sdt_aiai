package model;

public class TargetVO {

	private String id;
	private String subject;
	private String contents;	
	private int targetTime;
	private int studyTime;
	private int seq;	
	private String sayContents;
	

	public TargetVO() {
		super();
	}
	

	public TargetVO(String id, String subject, String contents, int targetTime, int studyTime) {
		super();
		this.id = id;
		this.subject = subject;
		this.contents = contents;
		this.targetTime = targetTime;
		this.studyTime = studyTime;
	}


	public TargetVO(String id, int targetTime) {
		super();
		this.id = id;
		this.targetTime = targetTime;
	}
	
	public TargetVO(String id, int targetTime, int seq) {
		super();
		this.id = id;
		this.targetTime = targetTime;
		this.seq = seq;
	}


	public TargetVO(String id, String subject, String contents, int studyTime) {
		super();
		this.id = id;
		this.subject = subject;
		this.contents = contents;
		this.studyTime = studyTime;
	}


	public TargetVO(int targetTime, int studyTime) {
		super();
		this.targetTime = targetTime;
		this.studyTime = studyTime;
	}


	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getTargetTime() {
		return targetTime;
	}
	public void setTargetTime(int targetTime) {
		this.targetTime = targetTime;
	}
	public int getStudyTime() {
		return studyTime;
	}
	public void setStudyTime(int studyTime) {
		this.studyTime = studyTime;
	}


	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public String getSayContents() {
		return sayContents;
	}


	public void setSayContents(String sayContents) {
		this.sayContents = sayContents;
	}
	
	
	
	
	
}
