package linkedlist


class LinkedList2 {
    var head: Node? = null
    fun printMiddle() {
        var slowPtr = head
        var fastPtr = head
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next!!.next
            slowPtr = slowPtr!!.next
        }
        println("Middle element : " + slowPtr!!.data)
    }

    /* Inserts a new Node at front of the list. */
    fun insertAtHead(new_data: Int) {
        if (head == null) {
            head = Node(new_data)
        } else {
            val newNode = Node(new_data)
            newNode.next = head
            head = newNode
        }
    }

    fun insertAtEnd(new_data: Int) {
        if (head == null) {
            head = Node(new_data)
        } else {
            var node = head
            while (node!!.next != null) {
                node = node.next
            }
            node.next = Node(new_data)
        }
    }

    fun deleteNodeWithValue(key: Int) {
        var temp = head
        var prev: Node? = null

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next // Changed head
            return
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp
            temp = temp.next
        }

        // If key was not present in linked list
        if (temp == null) return

        // Unlink the node from linked list
        prev!!.next = temp.next
    }

    fun deleteNodeWithPosition(position: Int) {
        // If linked list is empty
        if (head == null) return
        // Store head node
        var temp = head

        // If head needs to be removed
        if (position == 0) {
            head = temp!!.next // Change head
            return
        }
        // Find previous node of the node to be deleted
        var i = 0
        while (temp != null && i < position - 1) {
            temp = temp.next
            i++
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null) return

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        val next = temp.next!!.next
        temp.next = next // Unlink the deleted node from list
    }

    fun deleteList() {
        head = null
    }

    val count: Int
        get() {
            var temp = head
            var count = 0
            while (temp != null) {
                count++
                temp = temp.next
            }
            return count
        }

    fun getNodeAtPosition(position: Int): Int {
        var temp = head
        var count = 0
        var result = 0
        while (temp != null) {
            if (count == position) {
                result = temp.data
                break
            }
            count++
            temp = temp.next
        }
        return result
    }

    fun isInList(input: Int): Boolean {
        var temp = head
        while (temp != null) {
            if (temp.data == input) return true
            temp = temp.next
        }
        return false
    }

    fun removeDuplicatesFromSortedList(): Node? {
        var temp = head
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next!!.data) {
                temp.next = temp.next!!.next
            } else {
                temp = temp.next
            }
        }
        return head
    }

    fun removeDuplicateFromUnsortedList() {
        var current = head
        var prev: Node? = null
        val hs = HashSet<Int>()
        while (current != null) {
            val curval = current.data
            if (hs.contains(curval)) {
                prev!!.next = current.next
            } else {
                hs.add(curval)
                prev = current
            }
            current = current.next
        }
    }

    fun swap(n1: Int, n2: Int) {
        var prevNode1: Node? = null
        var prevNode2: Node? = null
        var node1 = head
        var node2 = head
        // Checks if list is empty
        if (head == null) {
            return
        }
        // If n1 and n2 are equal, then list will remain the same
        if (n1 == n2) return

        // Search for node1
        while (node1 != null && node1.data != n1) {
            prevNode1 = node1
            node1 = node1.next
        }
        // Search for node2
        while (node2 != null && node2.data != n2) {
            prevNode2 = node2
            node2 = node2.next
        }
        if (node1 != null && node2 != null) {

            // If previous node to node1 is not null then, it will point to node2
            if (prevNode1 != null) prevNode1.next = node2 else head = node2

            // If previous node to node2 is not null then,
            // it will point to node1
            if (prevNode2 != null) prevNode2.next = node1 else head = node1

            // Swaps the next nodes of node1 and node2
            val temp = node1.next
            node1.next = node2.next
            node2.next = temp
        } else {
            println("Swapping is not possible")
        }
    }

    fun moveToFront() {
        /* If linked list is empty or it contains only
           one node then simply return. */
        if (head == null || head!!.next == null) return

        /* Initialize second last and last pointers */
        var secLast: Node? = null
        var last = head

        /* After this loop secLast contains address of
           second last  node and last contains address of
           last node in Linked List */while (last!!.next != null) {
            secLast = last
            last = last.next
        }

        /* Set the next of second last as null */
        secLast!!.next = null

        /* Set the next of last as head */
        last.next = head

        /* Change head to point to last node. */
        head = last
    }

    fun detectLoop(): Boolean {
        var h = head
        val s = HashSet<Node>()
        while (h != null) {
            if (s.contains(h)) return true
            s.add(h)
            h = h.next
        }
        return false
    }


    fun printList() {
        var tnode = head
        while (tnode != null) {
            println(tnode.data)
            tnode = tnode.next
        }
    }

    companion object {
        fun findIntersectionOfTwoLinkedList(nodeA: Node?, nodeB: Node?): Node? {
            if (nodeA == null || nodeB == null) return null
            val nodeSet: MutableSet<Node> = HashSet()
            var tempA = nodeA
            while (tempA != null) {
                nodeSet.add(tempA)
                tempA = tempA.next
            }
            var tempB = nodeB
            while (tempB != null) {
                if (nodeSet.contains(tempB)) {
                    return tempB
                }
                tempB = tempB.next
            }
            return null
        }
    }
}

fun main(){
    val llist1 = LinkedList2()
    llist1.insertAtHead(10)
    llist1.insertAtHead(15)
    llist1.insertAtHead(4)
    llist1.insertAtHead(20)
    val llist2 = LinkedList2()
    llist2.insertAtEnd(3)
    llist2.insertAtEnd(3)
    llist2.insertAtEnd(4)
    llist2.insertAtEnd(5)
    llist1.printList()
    println("------")
    llist1.moveToFront()
    llist1.printList()

    println(llist1.detectLoop())
}