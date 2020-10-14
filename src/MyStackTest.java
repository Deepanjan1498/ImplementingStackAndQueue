import org.junit.Assert;
import org.junit.Test;
public class MyStackTest
{
	@Test
	public void given3NumbersWhenAddedToStackShouldBeAddedToTop() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	MyStack myStack=new MyStack();
    	myStack.push(myFirstNode);
    	myStack.push(mySecondNode);
    	myStack.push(myThirdNode);
    	myStack.printStack();
    	myStack.peek();
    	INode peek=myStack.peek();
    	Assert.assertEquals(myThirdNode,peek);
	}
	@Test
	public void given3NumbersInStackWhenPoppedShouldEmptyStack() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> nodeOnePopped = myStack.pop();
		myStack.printStack();
		INode<Integer> nodeTwoPopped = myStack.pop();
		myStack.printStack();
		INode<Integer> nodeThreePopped = myStack.pop();
		Assert.assertEquals(myThirdNode, nodeOnePopped);
	}
}