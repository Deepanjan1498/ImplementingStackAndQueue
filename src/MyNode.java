
public class MyNode<K> implements INode<K> {
	private K key;
	private INode next;
	public MyNode(K key)
	{
		this.key=key;
		this.next=null;
	}
	public INode getNext() {
		return next;
	}
	public void setNext(INode next) {
		this.next = next;
	}
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key=key;
	}
}


