
# Animal Shelter Queue System

A Java application that simulates an animal shelter's adoption system using the First In, First Out (FIFO) principle.

## Features

- Add dogs and cats to the shelter.
- Adopt the oldest animal overall.
- Adopt the oldest dog or cat.
- Track animal arrival order.
- Handle empty queues.
- Reject unsupported animal types.

## Data Structures

The application uses two Java queues implemented with LinkedList:

- **Dogs Queue:** Stores dogs in arrival order.
- **Cats Queue:** Stores cats in arrival order.

Each animal receives an arrival number when it enters the shelter. When adopting any animal, the application compares the animals at the front of both queues to determine which arrived first.

## Methods

- `enqueue(Animal animal)` — Adds an animal to the shelter.
- `dequeueAny()` — Removes the oldest animal overall.
- `dequeueDog()` — Removes the oldest dog.
- `dequeueCat()` — Removes the oldest cat.

## Technologies

- Java
- Java Collections Framework
- Git and GitHub
