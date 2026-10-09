# ⚡ Java Multithreading & Concurrency Mastery

[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![Build](https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)

A production-ready reference repository and educational guide covering core Java concurrency mechanics, low-level monitor locks, high-level `java.util.concurrent` utilities, common pitfalls, and an end-to-end multi-worker simulation project.

---

## 📑 Table of Contents

- [Repository Architecture](#-repository-architecture)
- [Build Configuration (pom.xml)](#-build-configuration-pomxml)
- [Core Theoretical Concepts](#-core-theoretical-concepts)
  - [1. Thread Creation & Lifecycle](#1-thread-creation--lifecycle)
  - [2. Memory Model, Volatile & Synchronization](#2-memory-model-volatile--synchronization)
  - [3. Explicit Locks vs Synchronized](#3-explicit-locks-vs-synchronized)
  - [4. High-Level Concurrency Framework (JUC)](#4-high-level-concurrency-framework-juc)
- [Mini Project: Multi-Worker Order Processing Engine](#-mini-project-multi-worker-order-processing-engine)
  - [System Architecture](#system-architecture)
  - [1. Order.java](#1-orderjava)
  - [2. SharedOrderQueue.java](#2-sharedorderqueuejava-bounded-buffer-monitor)
  - [3. OrderProducer.java](#3-orderproducerjava)
  - [4. OrderConsumer.java](#4-orderconsumerjava)
  - [5. OrderProcessingApp.java](#5-orderprocessingappjava-driver)
- [Unit Testing with JUnit 5](#-unit-testing-with-junit-5)
  - [SharedOrderQueueTest.java](#sharedorderqueuetestjava)
- [Frequently Asked Interview Questions (Q&A)](#-frequently-asked-interview-questions-qa)
- [Quickstart: Build & Run](#-quickstart-build--run)
- [Contributing & License](#-contributing--license)

---

## 📂 Repository Architecture

```text
java-multithreading-mastery/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/multithreading/project/
    │   ├── Order.java
    │   ├── SharedOrderQueue.java
    │   ├── OrderProducer.java
    │   ├── OrderConsumer.java
    │   └── OrderProcessingApp.java
    └── test/java/com/multithreading/project/
        └── SharedOrderQueueTest.java
