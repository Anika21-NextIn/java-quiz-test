# Java-quiz-test
## Project Summary:
This is a simple quiz project implemented in java. The main goal of this project is, it allows admin to create multiple choice of questions in a quiz pattern. Also student can login with their own credentials and take quiz test that is generated before by admin.
## Technology Used
Java
## Pre requisites
* JDK 11
* Simple JSON
* Set dependencies (gradle) 
## Functionalities
* Admin can:

1. Log in with their credentials and add new questions to the question bank.
2. Save MCQs with four options and their corresponding answer key in a JSON file.
* Student users can:

1. Log in with their own credentials and take quizzes generated from the question bank.
2. They will Receive 10 randomly selected questions from the quiz bank.
3. They can answer the questions and receive their score.
4. They can View their overall performance at the end of the quiz.
5. Marks are distributed like this:

* if mark is above 8>= message: Excellent! You have got [marks] out of 10

* if mark is above 5>= but less than 8, message: Good. You have got [marks] out of 10

* if mark is above 2>= but less than 5, message: Very poor! You have got [marks] out of 10

* if mark is 0 or less than 2 message: Very sorry you are failed. You have got [marks] out of 10

## Files
1. user.json: Contains user information, including admin and student credentials.
2. quiz.json: Stores the questions, options, and answer keys for the quiz bank.
## login credential
1. Admin:

* username: admin
* password: 1234

2. Student:

* username: anika
* password: 1234
## How to run
* git clone
* A report will be generate in your project source root

## My project video
[Java_quiz_test_video.webm](https://github.com/Anika21-NextIn/java-quiz-test/assets/55154873/a4645d0e-9656-4237-a76b-eb290dfae1f9)
