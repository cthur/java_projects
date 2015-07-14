package test;

import java.util.Vector;

import junit.framework.TestCase;

public class MyTestCase extends TestCase {

	private Vector container;

	@Override
	protected void setUp() throws Exception {
		container = new Vector();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	public MyTestCase() {
		// TODO Auto-generated constructor stub
	}

	public Vector getContainer() {
		return container;
	}

	public void setContainer(Vector container) {
		this.container = container;
	}

	public MyTestCase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
