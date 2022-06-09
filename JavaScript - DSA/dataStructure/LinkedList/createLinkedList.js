class LinkedList {
    constructor(value) {
        this.head = {
            value: value,
            next: null
        }
        this.tail = this.head;
        this.length = 1;
    }

    append(value) {
       const newNode = {
           value: value,
           next: null
       }
       this.tail.next = newNode;
       this.tail = newNode;
       this.length++;
       return this;
    }

    prepend(value) {
        const newNode = {
            value: value,
            next: null
        }
        newNode.next = this.head; // is equal to the old value
        this.head = newNode; // here head is equal to the new value
        this.length++
        return this;
    }
}

const myLinkedList = new LinkedList(5);
console.log(myLinkedList);

myLinkedList.append(10);
myLinkedList.append(16);
console.log(myLinkedList);

myLinkedList.prepend(20);
myLinkedList.prepend(14);
console.log(myLinkedList);