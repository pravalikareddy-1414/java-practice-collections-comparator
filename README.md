
# Java Practice – Collections, Comparable, Comparator & Real-World Scenarios

This repository contains a collection of Java practice programs covering:

- Java Collections Framework (`List`, `Set`, `Map`)
- Sorting using `Comparable` and `Comparator`
- Grouping and filtering
- Real-world scenarios like Student and Voter management

---

## 📁 File Descriptions

### ✅ `collectinter.java`
- Demonstrates:
  - Use of `ArrayList`, `TreeSet`, `TreeMap`, and `HashMap`
  - Iteration using for-loops
  - Shows how duplicate elements are handled in sets
  - Use of `Map` to store and print key-value data

---

### ✅ `Collections.java`
- Demonstrates:
  - Removing even numbers from a `List` using `removeIf()`
  - Using `LinkedHashSet` to preserve insertion order while removing duplicates
  - Accessing values from a `HashMap`
  - Counting word occurrences in a list using `Map`

---

### ✅ `colllection.java` *(Typo – Consider renaming to `collection.java`)*
- Uses basic `ArrayList` and `HashMap` setup
- Initial foundation for collection-based logic (can be expanded further)

---

### ✅ `College.java`
- Full object-oriented student management using collections:
  - `Students` class implements `Comparable` for sorting by marks
  - Uses `Comparator` lambda to sort by roll number
  - Groups students by department using `HashMap<String, List<Students>>`
  - Displays unique departments using `HashSet`
  - Finds and prints the top student in each department using `Collections.max()`

---

### ✅ `Products.java`
- Demonstrates:
  - A custom `Product` class
  - Sorting product list using `Comparator` based on price
  - Use of `Collections.sort()` with a comparator

---

### ✅ `Student.java`
- Demonstrates:
  - A class `Stud` that implements `Comparable`
  - Sorting of students based on marks
  - Use of `Collections.sort()` and `ArrayList`

---

### ✅ `studentManagement.java`
- Practical collection usage:
  - Converts `List` to `Set` to remove duplicates
  - Assigns marks to students using `HashMap`
  - Sorts students by name using `TreeMap`
  - Preserves insertion order using `LinkedHashMap`

---

### ✅ `VoterManagement.java`
- Real-world simulation:
  - Collects unique voter names using `HashSet`
  - Takes voter age input using `Scanner`
  - Stores and displays data using `HashMap`
  - Displays each voter's name and age using `Map.Entry`

---

## 💡 Topics Covered

- ✅ Java Collection Interfaces: `List`, `Set`, `Map`
- ✅ Collection Implementations: `ArrayList`, `HashSet`, `LinkedHashSet`, `HashMap`, `TreeMap`, `TreeSet`
- ✅ Sorting:
  - `Comparable` (natural ordering)
  - `Comparator` (custom ordering)
- ✅ Grouping & Aggregation
- ✅ Lambda expressions (`Comparator.comparingInt`, `removeIf`)
- ✅ Real-world logic (student & voter systems)
- ✅ Object-Oriented Programming with constructors, encapsulation, `toString`, etc.

---

## 👩‍💻 Author

Created by **Pravalika Reddy**  
As part of Java hands-on learning and interview preparation.

---

## 📎 How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/pravalikareddy-1414/java-practice-collections-comparator.git
