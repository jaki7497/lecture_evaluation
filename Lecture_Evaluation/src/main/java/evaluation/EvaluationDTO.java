package evaluation;

public class EvaluationDTO {
	
	int evaluationID;
	String userID; 
	String lectureName;
	String professeorName;
	int lectureYear;
	String semesterDivide;
	String lectureDivide;
	String evaluationTitle;
	String evaluationContent;
	String totalScore;
	String creditScore;
	String comfortableScore;
	String lectureScroe;
	int likeCount;
	
	public int getEvaluationID() {
		return evaluationID;
	}
	public void setEvaluationID(int evaluationID) {
		this.evaluationID = evaluationID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public String getProfesseorName() {
		return professeorName;
	}
	public void setProfesseorName(String professeorName) {
		this.professeorName = professeorName;
	}
	public int getLectureYear() {
		return lectureYear;
	}
	public void setLectureYear(int lectureYear) {
		this.lectureYear = lectureYear;
	}
	public String getSemesterDivide() {
		return semesterDivide;
	}
	public void setSemesterDivide(String semesterDivide) {
		this.semesterDivide = semesterDivide;
	}
	public String getLectureDivide() {
		return lectureDivide;
	}
	public void setLectureDivide(String lectureDivide) {
		this.lectureDivide = lectureDivide;
	}
	public String getEvaluationTitle() {
		return evaluationTitle;
	}
	public void setEvaluationTitle(String evaluationTitle) {
		this.evaluationTitle = evaluationTitle;
	}
	public String getEvaluationContent() {
		return evaluationContent;
	}
	public void setEvaluationContent(String evaluationContent) {
		this.evaluationContent = evaluationContent;
	}
	public String getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}
	public String getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}
	public String getComfortableScore() {
		return comfortableScore;
	}
	public void setComfortableScore(String comfortableScore) {
		this.comfortableScore = comfortableScore;
	}
	public String getLectureScroe() {
		return lectureScroe;
	}
	public void setLectureScroe(String lectureScroe) {
		this.lectureScroe = lectureScroe;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	public EvaluationDTO() {
	}
	
	public EvaluationDTO(int evaluationID, String userID, String lectureName, String professeorName, int lectureYear,
			String semesterDivide, String lectureDivide, String evaluationTitle, String evaluationContent,
			String totalScore, String creditScore, String comfortableScore, String lectureScroe, int likeCount) {
		super();
		this.evaluationID = evaluationID;
		this.userID = userID;
		this.lectureName = lectureName;
		this.professeorName = professeorName;
		this.lectureYear = lectureYear;
		this.semesterDivide = semesterDivide;
		this.lectureDivide = lectureDivide;
		this.evaluationTitle = evaluationTitle;
		this.evaluationContent = evaluationContent;
		this.totalScore = totalScore;
		this.creditScore = creditScore;
		this.comfortableScore = comfortableScore;
		this.lectureScroe = lectureScroe;
		this.likeCount = likeCount;
		
	}
	
	
	
}
