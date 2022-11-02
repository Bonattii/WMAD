// Import a JS file, you use require keyword (ES5)
const Node = require('./Node');

let node1 = new Node(10);
let node2 = new Node(20);
let node3 = new Node(30);
let node4 = new Node(40);

node1.next = node2;
node2.next = node3;
node3.next = node4;

function printNodeValues(head) {
  let str = '';
  while (head !== null) {
    str = str + head.val + ' -- > ';
    // Move node myself
    head = head.next;
  }
  console.log(str);
}

//  Question 1 - Count the number of nodes in Linked List

function countNodes(head) {
  let count = 0;
  while (head !== null) {
    count++;
    head = head.next;
  }

  return count;
}

console.log(countNodes(node1));

//  Question 2 - Add a new node to the linked list

function addNewNode(head, val) {
  let currentHead = head;
  let newNode = new Node(val);

  while (true) {
    currentHead = currentHead.next;
    if (currentHead.next === null) {
      currentHead.next = newNode;
      break;
    }
  }

  printNodeValues(head);
}

addNewNode(node1, 50);
