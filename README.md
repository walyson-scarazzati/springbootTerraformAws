# AWS Essential Project with Terraform and Spring Boot

This project was developed as part of the [AWS Essencial com Terraform e Spring Boot](https://www.udemy.com/course/aws-essencial-com-terraform-e-spring-boot/learn/lecture/20230892#overview) course on Udemy.

It demonstrates the integration between **Spring Boot**, **AWS Services** (like S3, SQS, and RDS), and **Terraform** for infrastructure provisioning.

---

## 🚀 Technologies Used

- **Spring Boot** (REST API)
- **Terraform** (Infrastructure as Code)
- **AWS Services**:
  - S3 (file storage)
  - SQS (message queue)
  - RDS (PostgreSQL database)
- **Maven** (project build)
- **EC2** (application hosting)
- **IAM** (access management)

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── br.com.professordavi.springbootTerraformAws/
│   │       ├── controller/
│   │       └── ...
│   └── resources/
│       └── application.properties
terraform/
├── main.tf
├── variables.tf
└── outputs.tf
```

---

## ⚙️ How to Run

### 1. Provision Infrastructure with Terraform

```bash
cd terraform
terraform init
terraform apply
```

This will create the necessary AWS resources: S3 bucket, SQS queue, RDS database, and EC2 instance.

### 2. Run the Spring Boot Application

```bash
./mvnw spring-boot:run
```

Or package and run:

```bash
./mvnw clean package
java -jar target/*.jar
```

---

## ✅ Features

- Send and receive messages from SQS
- Save data into RDS (PostgreSQL)
- Upload and retrieve files from S3
- Infrastructure fully managed by Terraform

---

## 📌 Notes

- Remember to configure your AWS credentials in `application.properties` or use environment variables:

  ```properties
  cloud.aws.credentials.accessKey=YOUR_ACCESS_KEY
  cloud.aws.credentials.secretKey=YOUR_SECRET_KEY
  cloud.aws.region.static=us-east-1
  ```

- The application listens to messages using `@SqsListener`.

---

## 📚 Course Reference

This project was created as part of the course:

**AWS Essencial com Terraform e Spring Boot**\
[Udemy Course Link](https://www.udemy.com/course/aws-essencial-com-terraform-e-spring-boot/)

Instructor: Professor Davi

---

## 🧑‍💻 Author

Developed by **[Your Name Here]** during the course for learning purposes.

