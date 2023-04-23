package interfaces;

public interface MyAnimalInterface {
	public static final int MAXLENGTH = 30;
	public String eat();
	public void travel();
	// Note we don't include the word 'abstract' because an interface is implicitly abstract
}
