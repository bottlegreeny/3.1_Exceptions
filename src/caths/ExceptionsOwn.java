package caths;



class SimpleException extends Exception{};


class InheritingExceptions{
	public void f() throws SimpleException{
		
		System.out.println("SimpleException has been detected");
		throw new SimpleException();
		}

	}

class TestException extends Exception{

    public TestException() {}
    public TestException(String msg) {super(msg);}
}

class TestingExceptions{
	public void f() throws TestException{
		
		System.out.println("TestException has been detected. Seems that the name of Rose is empty");
		throw new TestException();
		}

}