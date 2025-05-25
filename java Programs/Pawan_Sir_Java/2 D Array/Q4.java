const employees = [
  { id: 1, name: "Alex", department: "Engineering", salary: 75000, yearsEmployed: 5 },
  { id: 2, name: "Sarah", department: "Marketing", salary: 68000, yearsEmployed: 3 },
  { id: 3, name: "Michael", department: "Engineering", salary: 92000, yearsEmployed: 7 },
  { id: 4, name: "Jessica", department: "HR", salary: 65000, yearsEmployed: 2 },
  { id: 5, name: "David", department: "Engineering", salary: 85000, yearsEmployed: 4 },
  { id: 6, name: "Emma", department: "Marketing", salary: 72000, yearsEmployed: 5 },
  { id: 7, name: "John", department: "HR", salary: 70000, yearsEmployed: 3 },
  { id: 8, name: "Lisa", department: "Engineering", salary: 88000, yearsEmployed: 6 }
];

// Question 1: Use map() to create a new array containing objects with just the name and department of each employee

// Question 2: Use filter() and map() together to get an array of names of all employees in the Engineering department        who earn more than 80000

// Question 3: Use reduce() to create an object that shows the total salary expense for each department



Missing Number

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the missing number.
Example: nums = [3, 0, 1] → Return 2 (numbers should be 0,1,2,3, but 2 is missing)
Try to do this with O(n) time complexity and O(1) space complexity.
