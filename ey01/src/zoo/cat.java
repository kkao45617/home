package zoo;

//public (어디든 접촉가능) >> protected (같은 클래스 같은 패키지) >> default(같은 패키지 안에 접근 가능) >> private(같은 클래스 안에 접근가능)
public class cat {
	public void makecat() {
		duck quack = new duck();
	}

}

protected class duck{
	
}
