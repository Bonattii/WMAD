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

// Homework Question 1

// Write a function that deletes the node in the last index

function deleteNodeLastIndex(head) {
  if (head === null) {
    return null;
  }

  if (head.next === null) {
    return null;
  }

  // secondLastNode = node1 = 10
  let secondLastNode = head;

  // secondLastNode.next.next === 30
  while (secondLastNode.next.next !== null) {
    // secondLastNode.next = 20
    secondLastNode = secondLastNode.next;
  }

  // So on until secondLastNode.next.next === null
  // And secondLastNode.next === 40

  // secondLastNode.next == null , it means 40 will point to null
  secondLastNode.next = null;

  return head;
}

deleteNodeLastIndex(node1);
printNodeValues(node1);

// Write a function that deletes the node at the given index

function deleteNodeAtIndex(head, n) {
  let current = head;

  // If n == 0 just change the head to be head.next
  if (n === 0) {
    head = current.next;
    return;
  }

  // This loop will find the previus node of the position to be deleted
  for (let i = 0; current !== null && i < n - 1; i++) {
    current = current.next;
  }

  // This if take care of outside the boundaries n
  if (current === null || current.next === null) {
    return;
  }

  // This takes the node after that one we want to delete
  // Because at this point our current is the previus node
  let next = current.next.next;

  current.next = next;
}

deleteNodeAtIndex(node1, 2);
printNodeValues(node1);

// Write a function that ad the node at the given index

function addNodeAtIndex(head, n, val) {
  let current = head;

  // This loop will find the previus node of the position to be deleted
  for (let i = 0; current !== null && i < n - 1; i++) {
    current = current.next;
  }

  // Previus node cannot be null
  if (current === null) {
    return;
  }

  let newNode = new Node(val);

  // New node will point on where the previous one was pointing
  newNode.next = current.next;

  // The previus node will point to the new node
  current.next = newNode;
}

addNodeAtIndex(node1, 2, 75);
printNodeValues(node1);
