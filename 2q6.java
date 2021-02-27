abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "This is FilePersistence class";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "This is DatabasePersistence class";
    }
}
class client extends Persistence{
	@Override
	public String persist(){
		return "This is client class";
	}
}

 class Assignment2Q6 {
    public static void main(String[] args) {}
}