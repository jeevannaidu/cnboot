package DataStructures;


class ListNode {

    int data;
    ListNode nextNode;

    public ListNode(int data) {
        this.data = data;
        this.nextNode = null;
    }

}

public class SinglyLinkedList {

    ListNode headNode = null;
    ListNode newTempNode = null;


    public void addChildNode(int data, boolean isDeleteOperation) {

        ListNode selectedNode = isDeleteOperation ? newTempNode : headNode;

        ListNode newNode = new ListNode(data);

        if (!isDeleteOperation && selectedNode == null) {
            selectedNode = newNode;
        } else {
            ListNode temp = selectedNode;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }

        if (isDeleteOperation)
            newTempNode = selectedNode;
        else
            headNode = selectedNode;

    }

    public void removeHeadNode() {
        if (headNode == null) {
            System.out.println("No head node to remove");
        }
        headNode = headNode.nextNode;
    }

    public void deleteNode(ListNode node) {

        if (headNode.nextNode != null) {
            int count = 1;
            while (headNode.nextNode != null) {
                if (headNode.data == node.data && count == 1) {
                    removeHeadNode();
                    break;
                } else {
                    if (count == 1) {
                        addChildNode(headNode.data, true);
                    } else {
                        addChildNode(headNode.data, true);
                    }
                    headNode = headNode.nextNode;
                }
                count++;
            }
        } else {
            if (headNode.data == node.data) {
                headNode = null;
            }
        }

    }


    public static void main(String args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();


    }

}
